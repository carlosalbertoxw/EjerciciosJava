package com.carlos.ejercicios.basico;

import java.util.Scanner;

/**
 * Sentencia switch: elige un camino según el valor de una variable. Se muestran
 * la forma clásica, que necesita {@code break}, y la moderna con flechas, que no
 * se "cae" al caso siguiente y además puede devolver un valor.
 *
 * @author Carlos
 */
public class SentenciaSwitch {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa una calificación");
            int calificacion = scanner.nextInt();

            // Forma clásica: sin break, la ejecución sigue con el caso siguiente.
            switch (calificacion) {
                case 10:
                    System.out.println("Ingresaste la calificación de diez");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("Ingresaste una calificación aprobatoria");
                    break;
                default:
                    System.out.println("La calificación que ingresaste no es aprobatoria o está fuera del rango");
                    break;
            }

            // Forma moderna: una expresión switch que devuelve un valor.
            String resultado = switch (calificacion) {
                case 10 -> "Excelente";
                case 8, 9 -> "Muy bien";
                case 6, 7 -> "Suficiente";
                default -> "Sin aprobar";
            };
            System.out.println("Resultado: " + resultado);
        }
    }
}
