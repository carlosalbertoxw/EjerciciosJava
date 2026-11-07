package com.carlos.ejercicios.patrones.factory;

import java.util.Scanner;

/**
 * Demuestra el patrón Factory por consola: pide al usuario el tipo de forma y
 * delega su creación en {@link ShapeFactory}.
 *
 * @author Carlos
 */
public class DemoFactory {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        try (Scanner scanner = new Scanner(System.in)) {
            String respuesta;
            do {
                System.out.println("Teclea la forma solicitada (circulo, rectangulo, cuadrado):");
                try {
                    factory.getShape(scanner.next()).draw();
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("¿Deseas continuar? s/n:");
                respuesta = scanner.next();
            } while (respuesta.equalsIgnoreCase("s"));
        }
        System.out.println("Programa terminado");
    }
}
