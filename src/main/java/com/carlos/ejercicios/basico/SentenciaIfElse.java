package com.carlos.ejercicios.basico;

import java.util.Scanner;

/**
 * Sentencia if-else: ejecuta un bloque u otro según una condición.
 *
 * @author Carlos
 */
public class SentenciaIfElse {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa una calificación");
            int calificacion = scanner.nextInt();

            if (calificacion >= 8) {
                System.out.println("Esa es una buena calificación :)");
            } else {
                System.out.println("Esa es una mala calificación :(");
            }
        }
    }
}
