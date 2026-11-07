package com.carlos.ejercicios.archivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Dos formas de leer un archivo de texto. Primero ejecuta
 * {@link EscribirEnArchivoDeTexto} para crear el archivo de ejemplo.
 *
 * @author Carlos
 */
public class LeerArchivoDeTexto {

    /** Lee todo el archivo de una vez: lo más simple si el archivo no es enorme. */
    private static void leerCompleto(Path archivo) throws IOException {
        List<String> lineas = Files.readAllLines(archivo);
        lineas.forEach(System.out::println);
    }

    /**
     * Lee línea por línea sin cargar todo en memoria. El try-with-resources cierra el
     * archivo al terminar el bloque, incluso si ocurre un error.
     */
    private static void leerPorLineas(Path archivo) throws IOException {
        try (BufferedReader lector = Files.newBufferedReader(archivo)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        }
    }

    public static void main(String[] args) {
        Path archivo = Path.of("Texto.txt");
        try {
            System.out.println("== Todo de una vez ==");
            leerCompleto(archivo);
            System.out.println("\n== Línea por línea ==");
            leerPorLineas(archivo);
        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo: " + e);
        }
    }
}
