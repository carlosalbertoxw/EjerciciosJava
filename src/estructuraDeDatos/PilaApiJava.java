package estructuraDeDatos;

import java.util.Stack;

/**
 * Sencillo ejemplo de utilización de la clase Stack de la api de java
 *
 * @author carlos
 *
 */
public class PilaApiJava {

    public static void main(String[] args) {

        // Instancia de la clase Stack
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila: el primero en entrar es el ultimo en salir");
        System.out.println("\n");
        System.out.println("Añadiendo elementos a la pila");

        // Añadiendo elementos a la pila
        for (int i = 1; i <= 10; i++) {
            System.out.println(pila.push(i));
        }

        System.out.println("\n");
        System.out.println("Quitando elementos de la pila");

        // Quitando elementos de la pila
        while (!pila.empty()) {
            System.out.println(pila.pop());

        }
    }
}
