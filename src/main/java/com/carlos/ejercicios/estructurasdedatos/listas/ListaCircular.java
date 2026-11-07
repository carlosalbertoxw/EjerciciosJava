package com.carlos.ejercicios.estructurasdedatos.listas;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Lista circular: el último nodo apunta al primero. Basta con guardar el último para
 * llegar a ambos extremos, y {@link #rotar()} avanza el inicio sin mover ningún dato,
 * algo útil para repartir turnos.
 *
 * @param <T> tipo de los datos que guarda
 * @author Carlos
 */
public class ListaCircular<T> extends ListaBase<T> {

    private static class Nodo<T> {

        private final T dato;
        private Nodo<T> siguiente;

        private Nodo(T dato) {
            this.dato = dato;
        }
    }

    private Nodo<T> ultimo;

    @Override
    public void insertar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            nuevo.siguiente = nuevo;
        } else {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        longitud++;
    }

    /** El primero pasa a ser el último: avanza un turno. */
    public void rotar() {
        if (!estaVacia()) {
            ultimo = ultimo.siguiente;
        }
    }

    private Nodo<T> nodoEn(int indice) {
        Nodo<T> actual = ultimo.siguiente;
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
        Nodo<T> anterior = indice == 0 ? ultimo : nodoEn(indice - 1);
        Nodo<T> extraido = anterior.siguiente;
        anterior.siguiente = extraido.siguiente;
        if (longitud == 1) {
            ultimo = null;
        } else if (extraido == ultimo) {
            ultimo = anterior;
        }
        longitud--;
        return extraido.dato;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Nodo<T> actual = estaVacia() ? null : ultimo.siguiente;
            private int restantes = longitud;

            @Override
            public boolean hasNext() {
                return restantes > 0;
            }

            @Override
            public T next() {
                if (restantes == 0) {
                    throw new NoSuchElementException();
                }
                T dato = actual.dato;
                actual = actual.siguiente;
                restantes--;
                return dato;
            }
        };
    }

    public static void main(String[] args) {
        ListaCircular<String> turnos = new ListaCircular<>();
        System.out.println("== Lista circular (el último nodo apunta al primero) ==");

        turnos.insertar("Ana");
        turnos.insertar("Luis");
        turnos.insertar("Marta");
        System.out.println("Contenido: " + turnos);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Turno " + i + ": " + turnos.obtener(0));
            turnos.rotar();
        }

        System.out.print("Extrayendo desde el inicio: ");
        while (!turnos.estaVacia()) {
            System.out.print(turnos.extraer(0) + " ");
        }
        System.out.println("\n¿Está vacía ahora? " + turnos.estaVacia());
    }
}
