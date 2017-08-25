package basico;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * En esta clase se muestra un sencillo ejemplo de la utilización del la
 * sentencia if-else
 *
 * @author carlos
 *
 */
public class SentenciaIfElse {

    /**
     * método main
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer calificacion = 0;
        // Utilizando JOptionPane
        calificacion = Integer.parseInt(JOptionPane
                .showInputDialog("Ingresa una calificación"));
        // Sentencia if-else
        if (calificacion >= 8) {
            JOptionPane.showMessageDialog(null,
                    "Esa es una buena calificación :)");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Esa es una mala calificación :(");
        }

        // Utilizando la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una calificación");
        calificacion = scanner.nextInt();
        scanner.close();
        // Sentencia if-else
        if (calificacion >= 8) {
            System.out.println("Esa es una buena calificación :)");
        } else {
            System.out.println("Esa es una mala calificación :(");
        }
    }
}
