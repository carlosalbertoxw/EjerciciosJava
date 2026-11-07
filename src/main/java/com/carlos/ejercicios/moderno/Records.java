package com.carlos.ejercicios.moderno;

import java.util.List;

/**
 * Records: clases inmutables para transportar datos. Java genera el constructor, los
 * accesores, {@code equals}, {@code hashCode} y {@code toString}.
 *
 * @author Carlos
 */
public class Records {

    /** Una sola línea equivale a decenas de líneas de una clase con getters. */
    record Producto(String nombre, double precio) {

        // Constructor compacto: valida los datos antes de asignarlos.
        Producto {
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            }
        }

        // Un record también puede tener métodos.
        double conIva() {
            return precio * 1.16;
        }
    }

    public static void main(String[] args) {
        Producto teclado = new Producto("Teclado", 500);

        System.out.println(teclado);                      // toString generado
        System.out.println("Nombre: " + teclado.nombre()); // accesor, sin "get"
        System.out.println("Con IVA: " + teclado.conIva());

        // equals compara los datos, no la referencia.
        System.out.println("¿Iguales? " + teclado.equals(new Producto("Teclado", 500)));

        // Var infiere el tipo a partir del valor; sigue siendo tipado estático.
        var productos = List.of(teclado, new Producto("Ratón", 200));
        for (var producto : productos) {
            System.out.println("- " + producto.nombre());
        }

        try {
            new Producto("Inválido", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
