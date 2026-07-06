package com.carlos.ejercicios.estructurasdedatos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Muestra sencillos ejemplos de la implementación de listas de la api de java
 *
 * @author Carlos
 */
public class ListasApiJava {

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        ListasApiJava laj = new ListasApiJava();
        laj.listaSimple();
        laj.listaEnlazada();
    }

    /**
     * ArrayList: lista respaldada por un arreglo, ideal para acceso por índice.
     */
    private void listaSimple() {
        System.out.println("== ArrayList (acceso aleatorio por índice) ==");

        List<String> lenguajes = new ArrayList<String>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C++");
        lenguajes.add("Go");

        System.out.println("Lista: " + lenguajes);
        System.out.println("Tamaño: " + lenguajes.size());
        System.out.println("Elemento en índice 2: " + lenguajes.get(2));
        System.out.println("¿Contiene 'Go'? " + lenguajes.contains("Go"));

        lenguajes.remove("C++");
        System.out.println("Tras eliminar 'C++': " + lenguajes);
    }

    /**
     * LinkedList: lista doblemente enlazada, eficiente para insertar/eliminar en
     * los extremos.
     */
    private void listaEnlazada() {
        System.out.println("\n== LinkedList (inserción/eliminación en extremos) ==");

        LinkedList<Integer> numeros = new LinkedList<Integer>();
        numeros.add(20);
        numeros.add(30);
        numeros.addFirst(10); // inserta al inicio
        numeros.addLast(40);  // inserta al final

        System.out.println("Lista: " + numeros);
        System.out.println("Primero: " + numeros.getFirst() + " | Último: " + numeros.getLast());

        numeros.removeFirst();
        System.out.println("Tras removeFirst(): " + numeros);
    }
}
