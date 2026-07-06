package com.carlos.ejercicios.estructurasdedatos;

import java.util.LinkedList;

/**
 * En esta clase se muestran unos sencillos ejemplos de los diferentes tipo de
 * métodos de busqueda que existen<br>
 * bibliografía: Técnicas de Diseño de Algoritmos en Java By Sonia Jaramillo
 * Valbuena, Sonia Jaramillo Valbuena, Sergio Augusto Cardona Torres, Maria Lili
 * Villegas Ramirez
 *
 * @author Carlos
 */
public class MetodosDeBusqueda {

    /*
     * Busqueda lineal: Consiste en encontrar un elemento sobre un conjunto de
     * datos comparandolos uno a uno en el orden en el que se encuentren<br> Una
     * vez encontrado el elemento buscado se terminara la ejecución del método,
     * garantizando que no se sigan realizando comparaciones innecesarias<br>
     * Puede realizarse en un conjunto de datos desordenados a comparación del
     * metodo de la busqueda binaria
     */
    /**
     * Busca el dato ingresado en el arreglo ingresado
     *
     * @param arreglo
     * @param dato
     * @return true si el dato a buscar existe al menos una vez en el arreglo o
     * false si no existe
     */
    public boolean busquedaLineal(int[] arreglo, int dato) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == dato) {
                return true;
            }
        }
        return false;
    }

    /**
     * Busca el dato ingresado en la lista ingresada
     *
     * @param lista
     * @param dato
     * @return true si el dato a buscar existe al menos una vez en la lista o
     * false si no existe
     */
    public boolean busquedaLineal(LinkedList<Integer> lista, int dato) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == dato) {
                return true;
            }
        }
        return false;
    }

    /**
     * Busca el dato ingresado en el arreglo ingresado
     *
     * @param arreglo
     * @param dato
     * @return true si el dato a buscar existe al menos una vez en el arreglo o
     * false si no existe
     */
    public boolean busquedaLineal(int[][] arreglo, int dato) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] == dato) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * Busqueda binaria: Para este tipo de busqueda se debe de trabajar con un
     * arreglo ordenado de elementos (unica situación en la que es posible
     * aplicar la búsqueda binaria)<br> Este algoritmo es mas eficiente que el
     * de la busqueda lineal<br> Inicialmente el elemento a la mitad del arreglo
     * se compara con el dato buscado. Si el dato buscado es mayor, se redefine
     * el limite del arreglo desde el siguiente elemento al del centro hasta el
     * final del arreglo. En caso de que el dato buscado se menor, se redefine
     * el límite desde la mitad al principio del arreglo. Cada vez que se
     * realiza una comparación dentro del ciclo y mientras el limite inferior no
     * sea mayor que el limite superior, se reduce el conjunto de entrada a la
     * mitad, es decir, el arreglo descarta a los elementos que estan por fuera
     * del rango. El ciclo se deja de ejecutar cuando se retorna un valor ya sea
     * falso o verdadero
     */
    /**
     * Busca el dato ingresado en el arreglo ingresado
     *
     * @param arreglo
     * @param dato
     * @return true si el dato a buscar existe al menos una vez en el arreglo o
     * false si no existe
     */
    public boolean busquedaBinaria(int[] arreglo, int dato) {
        int centro;
        int limiteSuperior = arreglo.length - 1;
        int limiteInferior = 0;
        while (true) {
            centro = (limiteSuperior + limiteInferior) / 2;
            if (limiteInferior > limiteSuperior) {
                return false;
            } else {
                if (arreglo[centro] < dato) {
                    limiteInferior = centro + 1;
                } else {
                    if (arreglo[centro] > dato) {
                        limiteSuperior = centro - 1;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    /**
     * Busca el dato ingresado en la lista ingresada
     *
     * @param lista
     * @param dato
     * @return true si el dato a buscar existe al menos una vez en la lista o
     * false si no existe
     */
    public boolean busquedaBinaria(LinkedList<Integer> lista, int dato) {
        int centro;
        int limiteSuperior = lista.size() - 1;
        int limiteInferior = 0;
        while (true) {
            centro = (limiteSuperior + limiteInferior) / 2;
            if (limiteInferior > limiteSuperior) {
                return false;
            } else {
                if (lista.get(centro) < dato) {
                    limiteInferior = centro + 1;
                } else {
                    if (lista.get(centro) > dato) {
                        limiteSuperior = centro - 1;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        MetodosDeBusqueda mb = new MetodosDeBusqueda();

        // Arreglo ordenado (requisito para la búsqueda binaria)
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.println("Arreglo: [1, 3, 5, 7, 9, 11, 13, 15]");
        System.out.println("Búsqueda lineal de 7  -> " + mb.busquedaLineal(arreglo, 7));
        System.out.println("Búsqueda lineal de 8  -> " + mb.busquedaLineal(arreglo, 8));
        System.out.println("Búsqueda binaria de 13 -> " + mb.busquedaBinaria(arreglo, 13));
        System.out.println("Búsqueda binaria de 4  -> " + mb.busquedaBinaria(arreglo, 4));

        // Sobre una lista enlazada ordenada
        LinkedList<Integer> lista = new LinkedList<Integer>();
        for (int i = 1; i <= 8; i++) {
            lista.add(i * 2); // 2, 4, 6, ... 16
        }
        System.out.println("\nLista: " + lista);
        System.out.println("Búsqueda lineal de 10  -> " + mb.busquedaLineal(lista, 10));
        System.out.println("Búsqueda binaria de 16 -> " + mb.busquedaBinaria(lista, 16));
        System.out.println("Búsqueda binaria de 5  -> " + mb.busquedaBinaria(lista, 5));

        // Sobre una matriz de dos dimensiones (solo búsqueda lineal)
        int[][] matriz = new int[5][10];
        int y = 11;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = y;
                y++;
            }
        }
        System.out.println("\nMatriz 5x10 con valores 11..60");
        System.out.println("Búsqueda lineal de 14 -> " + mb.busquedaLineal(matriz, 14));
        System.out.println("Búsqueda lineal de 99 -> " + mb.busquedaLineal(matriz, 99));
    }
}
