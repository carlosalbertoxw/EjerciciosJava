package com.carlos.ejercicios.estructurasdedatos.ordenamiento;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.junit.jupiter.api.Named;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/** Los cuatro algoritmos deben ordenar igual, incluidos los casos límite. */
class OrdenamientoTest {

    static Stream<Named<Consumer<int[]>>> algoritmos() {
        return Stream.of(
                Named.of("BubbleSort", BubbleSort::ordenar),
                Named.of("InsertionSort", InsertionSort::ordenar),
                Named.of("SelectionSort", SelectionSort::ordenar),
                Named.of("QuickSort", QuickSort::ordenar));
    }

    private static void comprobar(Consumer<int[]> algoritmo, int... datos) {
        int[] esperado = datos.clone();
        Arrays.sort(esperado);
        algoritmo.accept(datos);
        assertArrayEquals(esperado, datos);
    }

    @ParameterizedTest
    @MethodSource("algoritmos")
    void arregloVacio(Consumer<int[]> algoritmo) {
        comprobar(algoritmo);
    }

    @ParameterizedTest
    @MethodSource("algoritmos")
    void unSoloElemento(Consumer<int[]> algoritmo) {
        comprobar(algoritmo, 7);
    }

    @ParameterizedTest
    @MethodSource("algoritmos")
    void yaOrdenadoEInverso(Consumer<int[]> algoritmo) {
        comprobar(algoritmo, 1, 2, 3, 4, 5);
        comprobar(algoritmo, 5, 4, 3, 2, 1);
    }

    @ParameterizedTest
    @MethodSource("algoritmos")
    void conDuplicadosYNegativos(Consumer<int[]> algoritmo) {
        comprobar(algoritmo, 3, -1, 3, 0, -1, 3, 8);
    }

    @ParameterizedTest
    @MethodSource("algoritmos")
    void datosAleatorios(Consumer<int[]> algoritmo) {
        comprobar(algoritmo, new Random(42).ints(1_000, -500, 500).toArray());
    }
}
