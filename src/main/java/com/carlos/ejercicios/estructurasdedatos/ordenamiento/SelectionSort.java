package com.carlos.ejercicios.estructurasdedatos.ordenamiento;

import java.util.Arrays;

/**
 * SelectionSort busca en cada vuelta el menor de los elementos restantes y lo
 * coloca en su lugar con un solo intercambio. Siempre es O(n²) en comparaciones,
 * pero hace muy pocos intercambios.
 * <p>
 * Bibliografía: Técnicas de Diseño de Algoritmos en Java, de Sonia Jaramillo
 * Valbuena, Sergio Augusto Cardona Torres y Maria Lili Villegas Ramirez.
 *
 * @author Carlos
 */
public class SelectionSort {

    /** Ordena de menor a mayor el arreglo recibido, modificándolo. */
    public static void ordenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temporal = arreglo[i];
            arreglo[i] = arreglo[indiceMenor];
            arreglo[indiceMenor] = temporal;
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {5, 1, 4, 2, 8, 0, 3};
        System.out.println("== Selection Sort ==");
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        ordenar(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }
}
