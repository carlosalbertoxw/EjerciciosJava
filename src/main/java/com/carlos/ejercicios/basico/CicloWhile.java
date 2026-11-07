package com.carlos.ejercicios.basico;

import java.util.Scanner;

/**
 * Ciclo while: repite el bloque mientras la condición sea verdadera. La condición
 * se evalúa antes de cada vuelta.
 *
 * @author Carlos
 */
public class CicloWhile {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa el número del cual se imprimirá la tabla de multiplicar");
            int numero = scanner.nextInt();

            int multiplicador = 1;
            while (multiplicador <= 10) {
                System.out.println(numero + " x " + multiplicador + " = " + numero * multiplicador);
                multiplicador++;
            }
        }
    }
}
