package com.carlos.ejercicios.estructurasdedatos.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Lista doblemente enlazada: cada nodo conoce al anterior y al siguiente. Permite
 * recorrerla en ambos sentidos y llegar a un índice desde el extremo más cercano.
 *
 * @param <T> tipo de los datos que guarda
 * @author Carlos
 */
public class ListaDoblementeEnlazada<T> extends ListaBase<T> {

    private static class Nodo<T> {

        private final T dato;
        private Nodo<T> siguiente;
        private Nodo<T> anterior;

        private Nodo(T dato) {
            this.dato = dato;
        }
    }

    private Nodo<T> primero;
    private Nodo<T> ultimo;

    @Override
    public void insertar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            primero = nuevo;
        } else {
            nuevo.anterior = ultimo;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        longitud++;
    }

    private Nodo<T> nodoEn(int indice) {
        Nodo<T> actual;
        if (indice < longitud / 2) {
            actual = primero;
            for (int i = 0; i < indice; i++) {
                actual = actual.siguiente;
            }
        } else {
            actual = ultimo;
            for (int i = longitud - 1; i > indice; i--) {
                actual = actual.anterior;
            }
        }
        return actual;
    }

    @Override
    public T obtener(int indice) {
        comprobarIndice(indice);
        return nodoEn(indice).dato;
    }

    @Override
    public T extraer(int indice) {
        comprobarIndice(indice);
        Nodo<T> extraido = nodoEn(indice);
        if (extraido.anterior == null) {
            primero = extraido.siguiente;
        } else {
            extraido.anterior.siguiente = extraido.siguiente;
        }
        if (extraido.siguiente == null) {
            ultimo = extraido.anterior;
        } else {
            extraido.siguiente.anterior = extraido.anterior;
        }
        longitud--;
        return extraido.dato;
    }

    /** Los datos del último al primero. */
    public List<T> alReves() {
        List<T> datos = new ArrayList<>(longitud);
        for (Nodo<T> actual = ultimo; actual != null; actual = actual.anterior) {
            datos.add(actual.dato);
        }
        return datos;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Nodo<T> actual = primero;

            @Override
            public boolean hasNext() {
                return actual != null;
            }

            @Override
            public T next() {
                if (actual == null) {
                    throw new NoSuchElementException();
                }
                T dato = actual.dato;
                actual = actual.siguiente;
                return dato;
            }
        };
    }

    public static void main(String[] args) {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        System.out.println("== Lista doblemente enlazada (cada nodo conoce al anterior y al siguiente) ==");

        for (int i = 1; i <= 10; i++) {
            lista.insertar(i);
        }
        System.out.println("Contenido: " + lista);
        System.out.println("Al revés : " + lista.alReves());
        System.out.println("Longitud: " + lista.longitud());
        System.out.println("Dato en índice 3: " + lista.obtener(3));

        System.out.print("Extrayendo desde el inicio: ");
        while (!lista.estaVacia()) {
            System.out.print(lista.extraer(0) + " ");
        }
        System.out.println("\n¿Está vacía ahora? " + lista.estaVacia());
    }
}
