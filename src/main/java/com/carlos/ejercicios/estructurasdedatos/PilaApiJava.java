package com.carlos.ejercicios.estructurasdedatos;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Una pila con la API de Java. Se usa {@link ArrayDeque}: la clase antigua
 * {@code java.util.Stack} sigue existiendo, pero su propia documentación recomienda
 * {@link Deque} en su lugar.
 *
 * @author Carlos
 */
public class PilaApiJava {

    public static void main(String[] args) {
        System.out.println("== Pila: LIFO, el último en entrar es el primero en salir ==");

        Deque<Integer> pila = new ArrayDeque<>();

        // Apilar (push) los valores 1..5
        for (int i = 1; i <= 5; i++) {
            pila.push(i);
        }
        System.out.println("Pila tras apilar 1..5 (la cima aparece primero): " + pila);

        // Consultar la cima sin retirarla (peek)
        System.out.println("Cima (peek): " + pila.peek());

        // Desapilar (pop) todos los elementos hasta vaciar la pila
        System.out.print("Desapilando (pop): ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop() + " ");
        }
        System.out.println("\n¿Pila vacía? " + pila.isEmpty());
    }
}
