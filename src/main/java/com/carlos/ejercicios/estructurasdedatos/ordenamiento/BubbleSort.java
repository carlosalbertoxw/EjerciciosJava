package com.carlos.ejercicios.estructurasdedatos.ordenamiento;

import java.util.Arrays;

/**
 * BubbleSort compara parejas adyacentes y las intercambia si están en desorden.
 * En cada vuelta el mayor de los elementos restantes "flota" hasta el final, así
 * que cada vuelta revisa uno menos, y si en una vuelta no hubo intercambios el
 * arreglo ya está ordenado. Es fácil de entender, pero O(n²) en el caso general.
 * <p>
 * Bibliografía: Técnicas de Diseño de Algoritmos en Java, de Sonia Jaramillo
 * Valbuena, Sergio Augusto Cardona Torres y Maria Lili Villegas Ramirez.
 *
 * @author Carlos
 */
public class BubbleSort {

    /** Ordena de menor a mayor el arreglo recibido, modificándolo. */
    public static void ordenar(int[] arreglo) {
        boolean huboIntercambio = true;
        for (int vuelta = 1; vuelta < arreglo.length && huboIntercambio; vuelta++) {
            huboIntercambio = false;
            for (int j = 0; j < arreglo.length - vuelta; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    huboIntercambio = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {5, 1, 4, 2, 8, 0, 3};
        System.out.println("== Bubble Sort ==");
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        ordenar(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }
}
