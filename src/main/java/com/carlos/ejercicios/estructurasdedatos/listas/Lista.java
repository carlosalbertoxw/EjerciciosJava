package com.carlos.ejercicios.estructurasdedatos.listas;

/**
 * Contrato común de las listas de este paquete. Es genérico: {@code Lista<String>}
 * solo admite textos y el compilador lo comprueba. Al ser {@link Iterable}, cualquier
 * lista se puede recorrer con un for-each.
 *
 * @param <T> tipo de los datos que guarda
 * @author Carlos
 */
public interface Lista<T> extends Iterable<T> {

    /** Agrega un dato al final. */
    void insertar(T dato);

    /**
     * Devuelve el dato de la posición indicada sin quitarlo.
     *
     * @throws IndexOutOfBoundsException si la posición no existe
     */
    T obtener(int indice);

    /**
     * Quita de la lista el dato de la posición indicada y lo devuelve.
     *
     * @throws IndexOutOfBoundsException si la posición no existe
     */
    T extraer(int indice);

    int longitud();

    boolean estaVacia();
}
