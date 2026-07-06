package com.carlos.ejercicios.estructurasdedatos;

import java.util.Stack;

/**
 * Sencillo ejemplo de utilización de la clase Stack de la api de java
 *
 * @author Carlos
 */
public class PilaApiJava {

    public static void main(String[] args) {
        System.out.println("== Pila (Stack): LIFO, el último en entrar es el primero en salir ==");

        Stack<Integer> pila = new Stack<Integer>();

        // Apilar (push) los valores 1..5
        for (int i = 1; i <= 5; i++) {
            pila.push(i);
        }
        System.out.println("Pila tras apilar 1..5: " + pila);

        // Consultar la cima sin retirarla (peek)
        System.out.println("Cima (peek): " + pila.peek());

        // Desapilar (pop) todos los elementos hasta vaciar la pila
        System.out.print("Desapilando (pop): ");
        while (!pila.empty()) {
            System.out.print(pila.pop() + " ");
        }
        System.out.println("\n¿Pila vacía? " + pila.empty());
    }
}
