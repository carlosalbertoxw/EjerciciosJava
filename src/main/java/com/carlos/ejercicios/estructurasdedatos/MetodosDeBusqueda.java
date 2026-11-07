package com.carlos.ejercicios.estructurasdedatos;

/**
 * Búsqueda lineal y búsqueda binaria.
 * <p>
 * Bibliografía: Técnicas de Diseño de Algoritmos en Java, de Sonia Jaramillo
 * Valbuena, Sergio Augusto Cardona Torres y Maria Lili Villegas Ramirez.
 *
 * @author Carlos
 */
public class MetodosDeBusqueda {

    /**
     * Búsqueda lineal: compara los elementos uno a uno y termina en cuanto encuentra
     * el dato. Es O(n) y funciona aunque los datos estén desordenados.
     *
     * @return true si el dato aparece al menos una vez
     */
    public static boolean busquedaLineal(int[] arreglo, int dato) {
        for (int elemento : arreglo) {
            if (elemento == dato) {
                return true;
            }
        }
        return false;
    }

    /** Búsqueda lineal en una matriz: recorre fila por fila. */
    public static boolean busquedaLineal(int[][] matriz, int dato) {
        for (int[] fila : matriz) {
            if (busquedaLineal(fila, dato)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Búsqueda binaria: requiere un arreglo ORDENADO. Compara el dato con el centro y
     * descarta la mitad donde no puede estar, hasta encontrarlo o quedarse sin
     * elementos. Es O(log n): con un millón de datos bastan unas 20 comparaciones.
     *
     * @return true si el dato aparece al menos una vez
     */
    public static boolean busquedaBinaria(int[] arreglo, int dato) {
        int inferior = 0;
        int superior = arreglo.length - 1;
        while (inferior <= superior) {
            // Así se evita desbordar int, que podría pasar con (inferior + superior) / 2.
            int centro = inferior + (superior - inferior) / 2;
            if (arreglo[centro] < dato) {
                inferior = centro + 1;
            } else if (arreglo[centro] > dato) {
                superior = centro - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Arreglo ordenado (requisito para la búsqueda binaria)
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.println("Arreglo: [1, 3, 5, 7, 9, 11, 13, 15]");
        System.out.println("Búsqueda lineal de 7   -> " + busquedaLineal(arreglo, 7));
        System.out.println("Búsqueda lineal de 8   -> " + busquedaLineal(arreglo, 8));
        System.out.println("Búsqueda binaria de 13 -> " + busquedaBinaria(arreglo, 13));
        System.out.println("Búsqueda binaria de 4  -> " + busquedaBinaria(arreglo, 4));

        // Sobre una matriz de dos dimensiones (solo búsqueda lineal)
        int[][] matriz = new int[5][10];
        int valor = 11;
        for (int[] fila : matriz) {
            for (int j = 0; j < fila.length; j++) {
                fila[j] = valor++;
            }
        }
        System.out.println("\nMatriz 5x10 con valores 11..60");
        System.out.println("Búsqueda lineal de 14 -> " + busquedaLineal(matriz, 14));
        System.out.println("Búsqueda lineal de 99 -> " + busquedaLineal(matriz, 99));
    }
}
