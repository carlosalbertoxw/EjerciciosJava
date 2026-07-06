package com.carlos.ejercicios.estructurasdedatos.ordenamiento;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

/**
 * En esta clase se muestra un sencillo ejemplo del algoritmo SelectionSort<br>
 * SelectionSort:<br>
 * bibliografía: Técnicas de Diseño de Algoritmos en Java By Sonia Jaramillo
 * Valbuena, Sonia Jaramillo Valbuena, Sergio Augusto Cardona Torres, Maria Lili
 * Villegas Ramirez
 *
 * @author Carlos
 */
public class SelectionSort {

    /**
     * Ordena de menor a mayor los elementos de la matriz ingresada
     *
     * @param matriz
     * @return la matriz ordenada
     */
    public int[] selectionSort(int[] matriz) {
        int temp, i, j;
        for (i = 0; i < matriz.length - 1; i++) {
            for (j = i; j < matriz.length; j++) {
                if (matriz[i] > matriz[j]) {
                    temp = matriz[i];
                    matriz[i] = matriz[j];
                    matriz[j] = temp;
                }
            }
        }
        return matriz;
    }

    /**
     * Ordena de menor a mayor los elementos de la lista ingresada
     *
     * @param lista
     * @return la lista ordenada
     */
    public LinkedList<Integer> selectionSort(LinkedList<Integer> lista) {
        int temp, i, j;
        for (i = 0; i < lista.size() - 1; i++) {
            for (j = i; j < lista.size(); j++) {
                if (lista.get(i) > lista.get(j)) {
                    temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
        return lista;
    }

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        System.out.println("== Selection Sort ==");

        // Ejemplo con un arreglo de enteros
        int[] arreglo = {5, 1, 4, 2, 8, 0, 3};
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("Arreglo ordenado: " + Arrays.toString(ss.selectionSort(arreglo)));

        // Ejemplo con una lista de 10 valores aleatorios (0-99)
        Random r = new Random();
        LinkedList<Integer> lista = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            lista.add(r.nextInt(100));
        }
        System.out.println("\nLista original: " + lista);
        System.out.println("Lista ordenada: " + ss.selectionSort(lista));
    }
}
