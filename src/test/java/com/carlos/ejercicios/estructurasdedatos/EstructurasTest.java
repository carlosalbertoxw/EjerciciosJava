package com.carlos.ejercicios.estructurasdedatos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class EstructurasTest {

    private static final int[] ORDENADO = {1, 3, 5, 7, 9};

    @Test
    void busquedaBinariaEncuentraEnCadaPosicion() {
        for (int dato : ORDENADO) {
            assertTrue(MetodosDeBusqueda.busquedaBinaria(ORDENADO, dato));
        }
    }

    @Test
    void busquedaBinariaNoEncuentraLoQueFalta() {
        assertFalse(MetodosDeBusqueda.busquedaBinaria(ORDENADO, 4));
        assertFalse(MetodosDeBusqueda.busquedaBinaria(ORDENADO, 0));
        assertFalse(MetodosDeBusqueda.busquedaBinaria(ORDENADO, 10));
        assertFalse(MetodosDeBusqueda.busquedaBinaria(new int[0], 1));
    }

    @Test
    void busquedaLinealEnArregloYMatriz() {
        assertTrue(MetodosDeBusqueda.busquedaLineal(new int[] {9, 2, 7}, 7));
        assertFalse(MetodosDeBusqueda.busquedaLineal(new int[0], 7));
        assertTrue(MetodosDeBusqueda.busquedaLineal(new int[][] {{1, 2}, {3, 4}}, 4));
        assertFalse(MetodosDeBusqueda.busquedaLineal(new int[][] {{1, 2}, {3, 4}}, 5));
    }

    @Test
    void arbolVacio() {
        ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
        assertEquals(0, arbol.altura());
        assertEquals(List.of(), arbol.enOrden());
        assertFalse(arbol.existe(1));
    }

    @Test
    void arbolRecorridosYAltura() {
        ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
        for (int valor : new int[] {50, 30, 70, 20, 40}) {
            arbol.insertar(valor);
        }

        assertEquals(List.of(20, 30, 40, 50, 70), arbol.enOrden());
        assertEquals(List.of(50, 30, 20, 40, 70), arbol.preOrden());
        assertEquals(List.of(20, 40, 30, 70, 50), arbol.postOrden());
        assertEquals(3, arbol.altura());
        assertTrue(arbol.existe(40));
        assertFalse(arbol.existe(99));
    }
}
