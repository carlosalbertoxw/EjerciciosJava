package basico;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * En esta clase se muestra un sencillo ejemplo de la utilización del la
 * sentencia switch
 *
 * @author carlos
 *
 */
public class SentenciaSwitch {

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
        // sentencia switch
        switch (calificacion) {
            case 10:
                JOptionPane.showMessageDialog(null,
                        "Ingresaste la calificación de diez");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,
                        "Ingresaste la calificación de nueve");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,
                        "Ingresaste la calificación de ocho");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,
                        "Ingresaste la calificación de siete");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,
                        "Ingresaste la calificación de seis");
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "La calificación que ingresaste esta fuera del rango");
                break;
        }

        // Utilizando la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una calificación");
        calificacion = scanner.nextInt();
        scanner.close();
        // sentencia switch
        switch (calificacion) {
            case 10:
                System.out.println("Ingresaste la calificación de diez");
                break;
            case 9:
                System.out.println("Ingresaste la calificación de nueve");
                break;
            case 8:
                System.out.println("Ingresaste la calificación de ocho");
                break;
            case 7:
                System.out.println("Ingresaste la calificación de siete");
                break;
            case 6:
                System.out.println("Ingresaste la calificación de seis");
                break;
            default:
                System.out
                        .println("La calificación que ingresaste esta fuera del rango");
                break;
        }
    }
}
