package com.carlos.ejercicios.archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Crea un archivo de texto y escribe en él; si ya existe, lo sobrescribe.
 * {@link Files#writeString} abre, escribe y cierra el archivo en una sola llamada.
 *
 * @author Carlos
 */
public class EscribirEnArchivoDeTexto {

    public static void main(String[] args) {
        Path archivo = Path.of("Texto.txt");
        try {
            Files.writeString(archivo, "Hola mundo\nEste es un salto de línea\n");
            System.out.println("Archivo escrito en: " + archivo.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("No se pudo escribir el archivo: " + e.getMessage());
        }
    }
}
