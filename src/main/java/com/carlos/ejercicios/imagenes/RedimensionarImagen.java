package com.carlos.ejercicios.imagenes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Genera una miniatura (máximo 150x150) a partir de una imagen, conservando la
 * proporción. El método {@code main} crea una imagen de ejemplo, produce su
 * miniatura y verifica el resultado, sin depender de archivos externos.
 *
 * @author Carlos
 */
public class RedimensionarImagen {

    private static final int ANCHO_MAXIMO = 150;
    private static final int ALTO_MAXIMO = 150;

    /** Devuelve la imagen reducida para caber en el tamaño máximo; nunca la agranda. */
    public static BufferedImage crearMiniatura(BufferedImage imagen) {
        double escala = Math.min(1.0, Math.min(
                (double) ANCHO_MAXIMO / imagen.getWidth(),
                (double) ALTO_MAXIMO / imagen.getHeight()));
        int ancho = Math.max(1, (int) Math.round(imagen.getWidth() * escala));
        int alto = Math.max(1, (int) Math.round(imagen.getHeight() * escala));

        BufferedImage miniatura = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = miniatura.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(imagen, 0, 0, ancho, alto, null);
        g.dispose();
        return miniatura;
    }

    public static BufferedImage cargar(File archivo) throws IOException {
        BufferedImage imagen = ImageIO.read(archivo);
        if (imagen == null) {
            throw new IOException("No es una imagen válida: " + archivo);
        }
        return imagen;
    }

    public static void guardar(BufferedImage imagen, File archivo) throws IOException {
        File carpeta = archivo.getAbsoluteFile().getParentFile();
        carpeta.mkdirs();
        String formato = archivo.getName().endsWith(".png") ? "png" : "jpg";
        if (!ImageIO.write(imagen, formato, archivo)) {
            throw new IOException("Formato de imagen no soportado: " + formato);
        }
    }

    /** Crea una imagen de ejemplo (400 x 250) con figuras de colores. */
    private static BufferedImage crearImagenDeEjemplo() {
        BufferedImage ejemplo = new BufferedImage(400, 250, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = ejemplo.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 400, 250);
        g.setColor(Color.BLUE);
        g.fillOval(40, 30, 200, 160);
        g.setColor(Color.RED);
        g.fillRect(220, 90, 140, 120);
        g.dispose();
        return ejemplo;
    }

    public static void main(String[] args) throws IOException {
        // Carpeta de salida dentro del proyecto (se crea sola; no se versiona)
        File original = new File("salida", "imagen-original.png");
        File miniatura = new File("salida", "imagen-miniatura.png");

        BufferedImage ejemplo = crearImagenDeEjemplo();
        guardar(ejemplo, original);
        System.out.println("Imagen original creada: " + original
                + " (" + ejemplo.getWidth() + "x" + ejemplo.getHeight() + ")");

        guardar(crearMiniatura(cargar(original)), miniatura);

        // Verificar el resultado leyendo la miniatura generada
        BufferedImage resultado = cargar(miniatura);
        System.out.println("Miniatura generada:     " + miniatura
                + " (" + resultado.getWidth() + "x" + resultado.getHeight() + ")");
    }
}
