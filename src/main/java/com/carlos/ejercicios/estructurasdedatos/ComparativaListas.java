package com.carlos.ejercicios.estructurasdedatos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Por qué importa la estructura de datos: {@link ArrayList} y {@link LinkedList}
 * cumplen la misma interfaz {@link List}, pero cada operación les cuesta distinto.
 * <ul>
 * <li>{@code get(i)}: inmediato en ArrayList; LinkedList debe recorrer nodo por nodo.</li>
 * <li>Insertar al inicio: ArrayList debe mover todos los elementos; LinkedList solo
 * enlaza un nodo.</li>
 * </ul>
 * Un algoritmo que usa {@code get(i)} dentro de un bucle pasa de O(n) a O(n²) con una
 * LinkedList. Por eso la búsqueda binaria y los ordenamientos usan arreglos.
 *
 * @author Carlos
 */
public class ComparativaListas {

    private static long ultimaSuma;

    private static long medir(Runnable operacion) {
        long inicio = System.nanoTime();
        operacion.run();
        return (System.nanoTime() - inicio) / 1_000_000;
    }

    private static void recorrerPorIndice(List<Integer> lista) {
        long suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }
        ultimaSuma = suma; // se guarda para que el compilador no elimine el bucle
    }

    private static void insertarAlInicio(List<Integer> lista, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            lista.addFirst(i);
        }
    }

    public static void main(String[] args) {
        int elementos = 30_000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < elementos; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        System.out.println("Recorrer " + elementos + " elementos con get(i):");
        System.out.println("  ArrayList : " + medir(() -> recorrerPorIndice(arrayList)) + " ms");
        System.out.println("  LinkedList: " + medir(() -> recorrerPorIndice(linkedList)) + " ms");
        System.out.println("  (suma de los elementos: " + ultimaSuma + ")");

        int inserciones = 200_000;
        System.out.println("\nInsertar " + inserciones + " elementos al inicio:");
        System.out.println("  ArrayList : " + medir(() -> insertarAlInicio(new ArrayList<>(), inserciones)) + " ms");
        System.out.println("  LinkedList: " + medir(() -> insertarAlInicio(new LinkedList<>(), inserciones)) + " ms");
    }
}
