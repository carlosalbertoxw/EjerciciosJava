package com.carlos.ejercicios.basico;

import java.util.Scanner;

/**
 * Ciclo do-while: la condición se evalúa al final, así que el bloque se ejecuta
 * al menos una vez.
 *
 * @author Carlos
 */
public class CicloDoWhile {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa el número del cual se imprimirá la tabla de multiplicar");
            int numero = scanner.nextInt();

            int multiplicador = 1;
            do {
                System.out.println(numero + " x " + multiplicador + " = " + numero * multiplicador);
                multiplicador++;
            } while (multiplicador <= 10);
        }
    }
}
