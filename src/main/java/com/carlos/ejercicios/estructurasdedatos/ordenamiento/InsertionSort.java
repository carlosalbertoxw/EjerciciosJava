package com.carlos.ejercicios.estructurasdedatos.ordenamiento;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

/**
 * En esta clase se muestra un sencillo ejemplo del algoritmo InsertionSort<br>
 * InsertionSort:<br>
 * bibliografía: Técnicas de Diseño de Algoritmos en Java By Sonia Jaramillo
 * Valbuena, Sonia Jaramillo Valbuena, Sergio Augusto Cardona Torres, Maria Lili
 * Villegas Ramirez
 *
 * @author Carlos
 */
public class InsertionSort {

    /**
     * Ordena de menor a mayor los elementos de la matriz ingresada
     *
     * @param matriz
     * @return la matriz ordenada
     */
    public int[] insertionSort(int[] matriz) {
        int temp, i, j;
        for (i = 0; i < matriz.length; i++) {
            temp = matriz[i];
            for (j = i; j > 0; j--) {
                if (matriz[j - 1] <= temp) {
                    break;
                }
                matriz[j] = matriz[j - 1];
            }
            matriz[j] = temp;
        }
        return matriz;
    }

    /**
     * Ordena de menor a mayor los elementos de la lista ingresada
     *
     * @param lista
     * @return la lista ordenada
     */
    public LinkedList<Integer> insertionSort(LinkedList<Integer> lista) {
        int temp, i, j;
        for (i = 0; i < lista.size(); i++) {
            temp = lista.get(i);
            for (j = i; j > 0; j--) {
                if (lista.get(j - 1) <= temp) {
                    break;
                }
                lista.set(j, lista.get(j - 1));
            }
            lista.set(j, temp);
        }
        return lista;
    }

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        System.out.println("== Insertion Sort ==");

        // Ejemplo con un arreglo de enteros
        int[] arreglo = {5, 1, 4, 2, 8, 0, 3};
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("Arreglo ordenado: " + Arrays.toString(is.insertionSort(arreglo)));

        // Ejemplo con una lista de 10 valores aleatorios (0-99)
        Random r = new Random();
        LinkedList<Integer> lista = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            lista.add(r.nextInt(100));
        }
        System.out.println("\nLista original: " + lista);
        System.out.println("Lista ordenada: " + is.insertionSort(lista));
    }
}
