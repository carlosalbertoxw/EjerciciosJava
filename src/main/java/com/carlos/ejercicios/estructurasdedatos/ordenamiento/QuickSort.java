package com.carlos.ejercicios.estructurasdedatos.ordenamiento;

import java.util.Arrays;

/**
 * QuickSort aplica recursividad y "divide y vencerás": elige un pivote, deja a un
 * lado los menores y al otro los mayores, y repite con cada parte. Es O(n log n)
 * en promedio y de los algoritmos más usados en la práctica.
 * <p>
 * Bibliografía: Técnicas de Diseño de Algoritmos en Java, de Sonia Jaramillo
 * Valbuena, Sergio Augusto Cardona Torres y Maria Lili Villegas Ramirez.
 *
 * @author Carlos
 */
public class QuickSort {

    /** Ordena de menor a mayor el arreglo recibido, modificándolo. */
    public static void ordenar(int[] arreglo) {
        if (arreglo.length > 1) {
            ordenar(arreglo, 0, arreglo.length - 1);
        }
    }

    private static void ordenar(int[] arreglo, int inferior, int superior) {
        int i = inferior;
        int j = superior;
        int pivote = arreglo[inferior + (superior - inferior) / 2];
        while (i <= j) {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int temporal = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temporal;
                i++;
                j--;
            }
        }
        if (j > inferior) {
            ordenar(arreglo, inferior, j);
        }
        if (i < superior) {
            ordenar(arreglo, i, superior);
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {5, 1, 4, 2, 8, 0, 3};
        System.out.println("== Quick Sort ==");
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        ordenar(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }
}
