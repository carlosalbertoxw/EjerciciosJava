package estructuraDeDatos.metodosOrdenamiento;

import java.util.LinkedList;
import java.util.Random;

/**
 * En esta clase se muestra un sencillo ejemplo del algoritmo SelectionSort<br>
 * SelectionSort:<br>
 * bibliografía: Técnicas de Diseño de Algoritmos en Java By Sonia Jaramillo
 * Valbuena, Sonia Jaramillo Valbuena, Sergio Augusto Cardona Torres, Maria Lili
 * Villegas Ramirez
 *
 * @author carlos
 *
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
        System.out.println("Selection Sort");
        LinkedList<Integer> lista = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            lista.add(r.nextInt(101));
        }

        System.out.println("matriz desordenada");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista = ss.selectionSort(lista);
        System.out.println("matriz ordenada");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
