package estructuraDeDatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

/**
 * Contiene un método para leer archivos de texto
 *
 * @author carlos
 *
 */
public class LeerArchivoDeTexto {

    /**
     * Lee un archivo de texto
     *
     * @param nombreArchivo
     * @return lista elazada con las lineas del texto del archivo leído
     */
    public LinkedList<String> leerArchivoDeTexto(String nombreArchivo) {
        LinkedList<String> texto = new LinkedList<String>();
        try {
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(r);

            String temp = "";
            while (temp != null) {
                temp = buffer.readLine();
                if (temp != null) {
                    texto.add(temp);
                }
            }

            buffer.close();
            r.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return texto;
    }

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        // Instancia de la clase
        LeerArchivoDeTexto lat = new LeerArchivoDeTexto();
        // Se manda llamar al método
        LinkedList<String> texto = lat.leerArchivoDeTexto("Texto.txt");
        // Se itera la lista enlazada retornada de la llamada del método
        // anteriro para imprimir en consola el contenido del archivo
        while (texto.isEmpty() != true) {
            System.out.println(texto.poll());
        }
    }
}
