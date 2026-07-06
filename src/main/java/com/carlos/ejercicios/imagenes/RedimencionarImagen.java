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
public class RedimencionarImagen {
    //Ancho máximo
    public static int MAX_WIDTH=150;
    //Alto máximo
    public static int MAX_HEIGHT=150;
 
    public static void copyImage(String filePath, String copyPath) {
        BufferedImage bimage = loadImage(filePath);
        if (bimage == null) {
            System.out.println("No se pudo cargar la imagen: " + filePath);
            return;
        }
        if(bimage.getHeight()>bimage.getWidth()){
            int height = (bimage.getHeight() * MAX_WIDTH) / bimage.getWidth();
            bimage = resize(bimage, MAX_WIDTH, height);
            int width = (bimage.getWidth() * MAX_HEIGHT) / bimage.getHeight();
            bimage = resize(bimage, width, MAX_HEIGHT);
        }else{
            int width = (bimage.getWidth() * MAX_HEIGHT) / bimage.getHeight();
            bimage = resize(bimage, width, MAX_HEIGHT);
            int height = (bimage.getHeight() * MAX_WIDTH) / bimage.getWidth();
            bimage = resize(bimage, MAX_WIDTH, height);
        }
        saveImage(bimage, copyPath);
    }
    
    /*
    Este método se utiliza para cargar la imagen de disco
    */
    public static BufferedImage loadImage(String pathName) {
        BufferedImage bimage = null;
        try {
            bimage = ImageIO.read(new File(pathName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bimage;
    }
 
    /*
    Este método se utiliza para almacenar la imagen en disco
    */
    public static void saveImage(BufferedImage bufferedImage, String pathName) {
        try {
            String format = (pathName.endsWith(".png")) ? "png" : "jpg";
            File file =new File(pathName);
            file.getParentFile().mkdirs();
            ImageIO.write(bufferedImage, format, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
    /*
    Este método se utiliza para redimensionar la imagen
    */
    public static BufferedImage resize(BufferedImage bufferedImage, int newW, int newH) {
        int w = bufferedImage.getWidth();
        int h = bufferedImage.getHeight();
        BufferedImage bufim = new BufferedImage(newW, newH, bufferedImage.getType());
        Graphics2D g = bufim.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(bufferedImage, 0, 0, newW, newH, 0, 0, w, h, null);
        g.dispose();
        return bufim;
    }

    /**
     * método main
     *
     * @param args
     */
    public static void main(String[] args) {
        // Carpeta de salida dentro del proyecto (se crea sola; no se versiona)
        String dir = "salida";
        String original = new File(dir, "imagen-original.png").getPath();
        String miniatura = new File(dir, "imagen-miniatura.png").getPath();

        // 1. Crear una imagen de ejemplo (400 x 250) y guardarla en disco
        BufferedImage ejemplo = new BufferedImage(400, 250, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = ejemplo.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 400, 250);
        g.setColor(Color.BLUE);
        g.fillOval(40, 30, 200, 160);
        g.setColor(Color.RED);
        g.fillRect(220, 90, 140, 120);
        g.dispose();
        saveImage(ejemplo, original);
        System.out.println("Imagen original creada: " + original
                + " (" + ejemplo.getWidth() + "x" + ejemplo.getHeight() + ")");

        // 2. Generar la miniatura (máximo 150x150 conservando la proporción)
        copyImage(original, miniatura);

        // 3. Verificar el resultado leyendo la miniatura generada
        BufferedImage resultado = loadImage(miniatura);
        if (resultado != null) {
            System.out.println("Miniatura generada:     " + miniatura
                    + " (" + resultado.getWidth() + "x" + resultado.getHeight() + ")");
        }
    }
}
