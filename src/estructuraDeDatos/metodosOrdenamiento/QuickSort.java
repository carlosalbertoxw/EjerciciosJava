package estructuraDeDatos.metodosOrdenamiento;

import java.util.LinkedList;
import java.util.Random;

/**
 * En esta clase se muestra un sencillo ejemplo del algoritmo QuickSort<br>
 * QuickSort:<br>
 * Implementa la recursividad.<br>
 * Se basa en la tecnica de divide y venceras.<br>
 * Es uno de los mejores algoritmos que existen para ordenar datos.<br>
 * bibliografía: Técnicas de Diseño de Algoritmos en Java By Sonia Jaramillo
 * Valbuena, Sonia Jaramillo Valbuena, Sergio Augusto Cardona Torres, Maria Lili
 * Villegas Ramirez
 *
 * @author carlos
 *
 */
public class QuickSort {

    /**
     * Ordena de menor a mayor los elementos de la matriz ingresada
     *
     * @param matriz
     * @return la matriz ordenada
     */
    public int[] quicksort(int[] matriz) {
        matriz = quicksort(matriz, 0, matriz.length - 1);
        return matriz;
    }

    /**
     * Ordena de menor a mayor los elementos de la matriz ingresada
     *
     * @param matriz
     * @param limiteInferior
     * @param limiteSuperior
     * @return la matriz ordenada
     */
    public int[] quicksort(int[] matriz, int limiteInferior, int limiteSuperior) {
        int i = limiteInferior;
        int j = limiteSuperior;
        int pivote = matriz[(limiteInferior + limiteSuperior) / 2];
        do {
            while (matriz[i] < pivote) {
                i++;
            }
            while (matriz[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int aux = matriz[i];
                matriz[i] = matriz[j];
                matriz[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (j > limiteInferior) {
            quicksort(matriz, limiteInferior, j);
        }
        if (i < limiteSuperior) {
            quicksort(matriz, i, limiteSuperior);
        }
        return matriz;
    }

    /**
     * Ordena de menor a mayor los elementos de la lista ingresada
     *
     * @param lista
     * @return la lista ordenada
     */
    public LinkedList<Integer> quicksort(LinkedList<Integer> lista) {
        lista = quicksort(lista, 0, lista.size() - 1);
        return lista;
    }

    /**
     * Ordena de menor a mayor los elementos de la lista ingresada
     *
     * @param lista
     * @param limiteInferior
     * @param limiteSuperior
     * @return la lista ordenada
     */
    public LinkedList<Integer> quicksort(LinkedList<Integer> lista,
            int limiteInferior, int limiteSuperior) {
        int i = limiteInferior;
        int j = limiteSuperior;
        int pivote = lista.get((limiteInferior + limiteSuperior) / 2);
        do {
            while (lista.get(i) < pivote) {
                i++;
            }
            while (lista.get(j) > pivote) {
                j--;
            }
            if (i <= j) {
                int aux = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, aux);
                i++;
                j--;
            }
        } while (i <= j);
        if (j > limiteInferior) {
            quicksort(lista, limiteInferior, j);
        }
        if (i < limiteSuperior) {
            quicksort(lista, i, limiteSuperior);
        }
        return lista;
    }

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        LinkedList<Integer> lista = new LinkedList<Integer>();
        System.out.println("Quick sort");

        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            lista.add(r.nextInt(501));
        }

        System.out.println("matriz desordenada");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista = q.quicksort(lista);
        System.out.println("matriz ordenada");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
