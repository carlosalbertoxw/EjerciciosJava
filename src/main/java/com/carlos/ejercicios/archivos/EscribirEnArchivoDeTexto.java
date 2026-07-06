package com.carlos.ejercicios.archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Contiene un método que crea y escribe en un archivo de texto (Si el archivo
 * ya existe lo sobrescribe)
 *
 * @author Carlos
 */
public class EscribirEnArchivoDeTexto {

    /**
     * Crea y escribe en un archivo de texto (Si el archivo ya existe lo
     * sobrescribe)
     *
     * @param nameFile ruta/nombre del archivo a crear
     * @param texto    contenido que se escribirá en el archivo
     */
    public void escribirEnArchivoDeTexto(String nameFile, String texto) {
        try {
            FileWriter fw = new FileWriter(nameFile);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.append(texto);

            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        //
        EscribirEnArchivoDeTexto e = new EscribirEnArchivoDeTexto();
        //
        e.escribirEnArchivoDeTexto("Texto.txt",
                "Hola mundo\nEste es un salto de linea");
    }
}
