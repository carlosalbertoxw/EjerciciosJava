package com.carlos.ejercicios.estructurasdedatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Árbol binario de búsqueda (ABB): inserta enteros manteniendo el orden y ofrece
 * recorridos (en orden, preorden y postorden), búsqueda de un dato y cálculo de
 * la altura.
 *
 * @author Carlos
 */
public class ArbolBinarioOrdenado {

    private Nodo raiz;

    private static class Nodo {

        private final int dato;
        private Nodo izquierdo;
        private Nodo derecho;

        private Nodo(int dato) {
            this.dato = dato;
        }
    }

    /** Inserta un dato. Los repetidos van a la derecha. */
    public void insertar(int dato) {
        raiz = insertar(raiz, dato);
    }

    private static Nodo insertar(Nodo nodo, int dato) {
        if (nodo == null) {
            return new Nodo(dato);
        }
        if (dato < nodo.dato) {
            nodo.izquierdo = insertar(nodo.izquierdo, dato);
        } else {
            nodo.derecho = insertar(nodo.derecho, dato);
        }
        return nodo;
    }

    public boolean existe(int dato) {
        Nodo actual = raiz;
        while (actual != null) {
            if (dato == actual.dato) {
                return true;
            }
            actual = dato > actual.dato ? actual.derecho : actual.izquierdo;
        }
        return false;
    }

    /** Número de niveles: 0 si está vacío. */
    public int altura() {
        return altura(raiz);
    }

    private static int altura(Nodo nodo) {
        return nodo == null ? 0 : 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
    }

    /** Izquierda, raíz, derecha: en un ABB devuelve los datos ordenados. */
    public List<Integer> enOrden() {
        List<Integer> datos = new ArrayList<>();
        enOrden(raiz, datos);
        return datos;
    }

    private static void enOrden(Nodo nodo, List<Integer> datos) {
        if (nodo != null) {
            enOrden(nodo.izquierdo, datos);
            datos.add(nodo.dato);
            enOrden(nodo.derecho, datos);
        }
    }

    /** Raíz, izquierda, derecha. */
    public List<Integer> preOrden() {
        List<Integer> datos = new ArrayList<>();
        preOrden(raiz, datos);
        return datos;
    }

    private static void preOrden(Nodo nodo, List<Integer> datos) {
        if (nodo != null) {
            datos.add(nodo.dato);
            preOrden(nodo.izquierdo, datos);
            preOrden(nodo.derecho, datos);
        }
    }

    /** Izquierda, derecha, raíz. */
    public List<Integer> postOrden() {
        List<Integer> datos = new ArrayList<>();
        postOrden(raiz, datos);
        return datos;
    }

    private static void postOrden(Nodo nodo, List<Integer> datos) {
        if (nodo != null) {
            postOrden(nodo.izquierdo, datos);
            postOrden(nodo.derecho, datos);
            datos.add(nodo.dato);
        }
    }

    public static void main(String[] args) {
        ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();

        // Se insertan valores fijos para obtener un árbol reproducible
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        System.out.println("Insertando: " + Arrays.toString(valores));
        for (int valor : valores) {
            arbol.insertar(valor);
        }

        System.out.println("\nEn orden (queda ordenado): " + arbol.enOrden());
        System.out.println("Preorden                 : " + arbol.preOrden());
        System.out.println("Postorden                : " + arbol.postOrden());

        System.out.println("\nAltura del árbol: " + arbol.altura());
        System.out.println("¿Existe 40? " + arbol.existe(40));
        System.out.println("¿Existe 99? " + arbol.existe(99));
    }
}
