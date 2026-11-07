package com.carlos.ejercicios.moderno;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Streams y lambdas: procesar colecciones diciendo QUÉ se quiere (filtrar,
 * transformar, agrupar) en lugar de CÓMO recorrerlas. La lista original no cambia.
 *
 * @author Carlos
 */
public class Streams {

    record Empleado(String nombre, String area, double salario) {
    }

    public static void main(String[] args) {
        List<Empleado> empleados = List.of(
                new Empleado("Ana", "Sistemas", 30_000),
                new Empleado("Luis", "Ventas", 18_000),
                new Empleado("Marta", "Sistemas", 35_000),
                new Empleado("Pedro", "Ventas", 22_000),
                new Empleado("Sofía", "Legal", 28_000));

        // filter + map + toList
        List<String> sueldosAltos = empleados.stream()
                .filter(e -> e.salario() > 25_000)
                .map(Empleado::nombre)
                .toList();
        System.out.println("Salario mayor a 25 000: " + sueldosAltos);

        // Ordenar y tomar el primero: el resultado es un Optional, porque podría no haber.
        empleados.stream()
                .max(Comparator.comparingDouble(Empleado::salario))
                .ifPresent(e -> System.out.println("Salario más alto: " + e.nombre()));

        // Agregados
        double total = empleados.stream().mapToDouble(Empleado::salario).sum();
        System.out.println("Nómina total: " + total);

        // Agrupar: área -> salario promedio
        Map<String, Double> promedioPorArea = empleados.stream()
                .collect(Collectors.groupingBy(
                        Empleado::area,
                        Collectors.averagingDouble(Empleado::salario)));
        promedioPorArea.forEach((area, promedio) ->
                System.out.println("Promedio en " + area + ": " + promedio));
    }
}
