package com.carlos.ejercicios.basico;

import java.util.Scanner;

/**
 * Ciclo for: se usa cuando se conoce de antemano cuántas vueltas dará.
 *
 * @author Carlos
 */
public class CicloFor {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa el número del cual se imprimirá la tabla de multiplicar");
            int numero = scanner.nextInt();

            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                System.out.println(numero + " x " + multiplicador + " = " + numero * multiplicador);
            }
        }
    }
}
