package com.carlos.ejercicios.estructurasdedatos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Ejemplos de las listas de la API de Java. Para ver cuándo conviene cada una,
 * revisa {@link ComparativaListas}.
 *
 * @author Carlos
 */
public class ListasApiJava {

    public static void main(String[] args) {
        listaSimple();
        listaEnlazada();
        listaInmutable();
    }

    /** ArrayList: lista respaldada por un arreglo, ideal para acceso por índice. */
    private static void listaSimple() {
        System.out.println("== ArrayList (acceso aleatorio por índice) ==");

        List<String> lenguajes = new ArrayList<>();
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

    /** LinkedList: lista doblemente enlazada, eficiente para insertar/eliminar en los extremos. */
    private static void listaEnlazada() {
        System.out.println("\n== LinkedList (inserción/eliminación en extremos) ==");

        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(20);
        numeros.add(30);
        numeros.addFirst(10); // inserta al inicio
        numeros.addLast(40);  // inserta al final

        System.out.println("Lista: " + numeros);
        System.out.println("Primero: " + numeros.getFirst() + " | Último: " + numeros.getLast());

        numeros.removeFirst();
        System.out.println("Tras removeFirst(): " + numeros);
    }

    /** List.of crea una lista inmutable: intentar modificarla lanza una excepción. */
    private static void listaInmutable() {
        System.out.println("\n== List.of (inmutable) ==");

        List<String> colores = List.of("rojo", "verde", "azul");
        System.out.println("Lista: " + colores);
        try {
            colores.add("negro");
        } catch (UnsupportedOperationException e) {
            System.out.println("No se puede modificar una lista creada con List.of");
        }
    }
}
