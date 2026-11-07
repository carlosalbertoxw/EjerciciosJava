package com.carlos.ejercicios.estructurasdedatos.listas;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * Lo que comparten todas las listas, para no repetirlo: el contador de elementos, la
 * validación de índices y la conversión a texto. Cada subclase solo implementa lo
 * que depende de cómo enlaza sus nodos.
 *
 * @param <T> tipo de los datos que guarda
 * @author Carlos
 */
abstract class ListaBase<T> implements Lista<T> {

    protected int longitud;

    @Override
    public int longitud() {
        return longitud;
    }

    @Override
    public boolean estaVacia() {
        return longitud == 0;
    }

    protected void comprobarIndice(int indice) {
        Objects.checkIndex(indice, longitud);
    }

    @Override
    public String toString() {
        StringJoiner texto = new StringJoiner(", ", "[", "]");
        for (T dato : this) {
            texto.add(String.valueOf(dato));
        }
        return texto.toString();
    }
}
