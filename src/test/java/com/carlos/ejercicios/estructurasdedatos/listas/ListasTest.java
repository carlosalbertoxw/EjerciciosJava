package com.carlos.ejercicios.estructurasdedatos.listas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.jupiter.api.Named;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/** Las tres implementaciones cumplen el mismo contrato, así que comparten pruebas. */
class ListasTest {

    static Stream<Named<Supplier<Lista<Integer>>>> listas() {
        return Stream.of(
                Named.of("ListaEnlazadaSimple", ListaEnlazadaSimple::new),
                Named.of("ListaCircular", ListaCircular::new),
                Named.of("ListaDoblementeEnlazada", ListaDoblementeEnlazada::new));
    }

    private static Lista<Integer> conDatos(Supplier<Lista<Integer>> fabrica, int... datos) {
        Lista<Integer> lista = fabrica.get();
        for (int dato : datos) {
            lista.insertar(dato);
        }
        return lista;
    }

    private static List<Integer> contenido(Lista<Integer> lista) {
        List<Integer> datos = new ArrayList<>();
        lista.forEach(datos::add);
        return datos;
    }

    @ParameterizedTest
    @MethodSource("listas")
    void empiezaVacia(Supplier<Lista<Integer>> fabrica) {
        Lista<Integer> lista = fabrica.get();
        assertTrue(lista.estaVacia());
        assertEquals(0, lista.longitud());
        assertEquals("[]", lista.toString());
    }

    @ParameterizedTest
    @MethodSource("listas")
    void insertarConservaElOrden(Supplier<Lista<Integer>> fabrica) {
        Lista<Integer> lista = conDatos(fabrica, 10, 20, 30);
        assertFalse(lista.estaVacia());
        assertEquals(List.of(10, 20, 30), contenido(lista));
        assertEquals(30, lista.obtener(2));
        assertEquals("[10, 20, 30]", lista.toString());
    }

    @ParameterizedTest
    @MethodSource("listas")
    void extraerDelInicioMedioYFinal(Supplier<Lista<Integer>> fabrica) {
        Lista<Integer> lista = conDatos(fabrica, 1, 2, 3, 4, 5);

        assertEquals(3, lista.extraer(2));
        assertEquals(List.of(1, 2, 4, 5), contenido(lista));
        assertEquals(1, lista.extraer(0));
        assertEquals(List.of(2, 4, 5), contenido(lista));
        assertEquals(5, lista.extraer(2));
        assertEquals(List.of(2, 4), contenido(lista));

        // Tras quitar el último, insertar debe seguir enlazando bien.
        lista.insertar(9);
        assertEquals(List.of(2, 4, 9), contenido(lista));
    }

    @ParameterizedTest
    @MethodSource("listas")
    void vaciarYReutilizar(Supplier<Lista<Integer>> fabrica) {
        Lista<Integer> lista = conDatos(fabrica, 1, 2);
        lista.extraer(0);
        lista.extraer(0);
        assertTrue(lista.estaVacia());

        lista.insertar(7);
        assertEquals(List.of(7), contenido(lista));
    }

    @ParameterizedTest
    @MethodSource("listas")
    void indiceInvalidoLanzaExcepcion(Supplier<Lista<Integer>> fabrica) {
        Lista<Integer> lista = conDatos(fabrica, 1);
        assertThrows(IndexOutOfBoundsException.class, () -> lista.obtener(1));
        assertThrows(IndexOutOfBoundsException.class, () -> lista.obtener(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> lista.extraer(5));
    }

    @Test
    void circularRotaLosTurnos() {
        ListaCircular<String> turnos = new ListaCircular<>();
        turnos.insertar("Ana");
        turnos.insertar("Luis");

        assertEquals("Ana", turnos.obtener(0));
        turnos.rotar();
        assertEquals("Luis", turnos.obtener(0));
        turnos.rotar();
        assertEquals("Ana", turnos.obtener(0));
    }

    @Test
    void doblementeEnlazadaSeRecorreAlReves() {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.extraer(1);

        assertEquals(List.of(3, 1), lista.alReves());
    }
}
