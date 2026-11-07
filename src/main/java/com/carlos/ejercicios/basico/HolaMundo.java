package com.carlos.ejercicios.basico;

/**
 * El primer programa: imprimir un mensaje en la consola.
 * <p>
 * Desde Java 25, {@code main} ya no necesita ser {@code public static} ni recibir
 * {@code String[] args}, y la clase {@code IO} simplifica la salida. La forma
 * clásica, que verás en casi todo el código existente, es:
 * <pre>
 * public static void main(String[] args) {
 *     System.out.println("Hola Mundo :)");
 * }
 * </pre>
 *
 * @author Carlos
 */
public class HolaMundo {

    void main() {
        IO.println("Hola Mundo :)");
    }
}
