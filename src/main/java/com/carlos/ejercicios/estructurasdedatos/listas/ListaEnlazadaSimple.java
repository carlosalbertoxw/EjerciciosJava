package com.carlos.ejercicios.estructurasdedatos.listas;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Lista enlazada simple: cada nodo conoce solo al siguiente.
 *
 * @param <T> tipo de los datos que guarda
 * @author Carlos
 */
public class ListaEnlazadaSimple<T> extends ListaBase<T> {

    private static class Nodo<T> {

        private final T dato;
        private Nodo<T> siguiente;

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
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        longitud++;
    }

    private Nodo<T> nodoEn(int indice) {
        Nodo<T> actual = primero;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
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
        T dato;
        if (indice == 0) {
            dato = primero.dato;
            primero = primero.siguiente;
        } else {
            Nodo<T> anterior = nodoEn(indice - 1);
            dato = anterior.siguiente.dato;
            anterior.siguiente = anterior.siguiente.siguiente;
            if (indice == longitud - 1) {
                ultimo = anterior;
            }
        }
        longitud--;
        return dato;
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
        Lista<Integer> lista = new ListaEnlazadaSimple<>();
        System.out.println("== Lista enlazada simple ==");

        for (int i = 30; i < 40; i++) {
            lista.insertar(i);
        }
        System.out.println("Contenido: " + lista);
        System.out.println("Longitud: " + lista.longitud());
        System.out.println("Dato en índice 3: " + lista.obtener(3));

        System.out.print("Extrayendo desde el inicio: ");
        while (!lista.estaVacia()) {
            System.out.print(lista.extraer(0) + " ");
        }
        System.out.println("\n¿Está vacía ahora? " + lista.estaVacia());
    }
}
