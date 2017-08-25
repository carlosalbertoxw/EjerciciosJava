package estructuraDeDatos.metodosOrdenamiento;

import java.util.LinkedList;
import java.util.Random;

/**
 * En esta clase se muestra un sencillo ejemplo del algoritmo BubbleSort<br>
 * BubbleSort:<br>
 * Es un algoritmo facil de entender y de hacer hacer ya que es iterativo.<br>
 * Consiste en la comparación de parejas adyacentes e intercambiarlas deacuerdo
 * al orden que desee darse.<br>
 * Se llama bubble sort por que consiste en flotar hasta el final el elemento
 * mayor en cada iteración.<br>
 * No es el mejor metodo para ordenar datos.<br>
 * Bibliografía: Técnicas de Diseño de Algoritmos en Java By Sonia Jaramillo
 * Valbuena, Sonia Jaramillo Valbuena, Sergio Augusto Cardona Torres, Maria Lili
 * Villegas Ramirez
 *
 * @author carlos
 *
 */
public class BubbleSort {

    /**
     * Ordena de menor a mayor los elementos de la matriz ingresada
     *
     * @param matriz
     * @return la matriz ordenada
     */
    public int[] bubbleSort(int[] matriz) {
        int buffer, i, j;
        for (i = 1; i < matriz.length; i++) {
            for (j = 0; j < matriz.length - 1; j++) {
                if (matriz[j] > matriz[j + 1]) {
                    buffer = matriz[j];
                    matriz[j] = matriz[j + 1];
                    matriz[j + 1] = buffer;
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
    public LinkedList<Integer> bubbleSort(LinkedList<Integer> lista) {
        int buffer, i, j;
        for (i = 1; i < lista.size(); i++) {
            for (j = 0; j < lista.size() - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    buffer = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, buffer);
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
        BubbleSort b = new BubbleSort();
        System.out.println("Bubble Sort");
        LinkedList<Integer> lista = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            lista.add(r.nextInt(101));
        }

        System.out.println("lista desordenada");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista = b.bubbleSort(lista);
        System.out.println("lista ordenada");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
