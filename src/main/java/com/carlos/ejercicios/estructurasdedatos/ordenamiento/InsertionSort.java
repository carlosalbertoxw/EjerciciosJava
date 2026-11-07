package com.carlos.ejercicios.estructurasdedatos.ordenamiento;

import java.util.Arrays;

/**
 * InsertionSort toma cada elemento y lo inserta en su lugar dentro de la parte ya
 * ordenada, como quien ordena cartas en la mano. Es O(n²) en general, pero muy
 * rápido con datos casi ordenados.
 * <p>
 * Bibliografía: Técnicas de Diseño de Algoritmos en Java, de Sonia Jaramillo
 * Valbuena, Sergio Augusto Cardona Torres y Maria Lili Villegas Ramirez.
 *
 * @author Carlos
 */
public class InsertionSort {

    /** Ordena de menor a mayor el arreglo recibido, modificándolo. */
    public static void ordenar(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int valor = arreglo[i];
            int j = i;
            while (j > 0 && arreglo[j - 1] > valor) {
                arreglo[j] = arreglo[j - 1];
                j--;
            }
            arreglo[j] = valor;
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {5, 1, 4, 2, 8, 0, 3};
        System.out.println("== Insertion Sort ==");
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        ordenar(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }
}
