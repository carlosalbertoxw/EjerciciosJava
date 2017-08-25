package basico;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * En esta clase se muestra un sencillo ejemplo del ciclo doWhile
 *
 * @author carlos
 *
 */
public class CicloDoWhile {

    /**
     * método main
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer y;
        Integer x = 1;

        // Utilizando JOptionPane
        y = Integer
                .parseInt(JOptionPane
                        .showInputDialog("Ingrese el número del cual se \nimprimira la tabla de multiplicar"));
        // ciclo doWhile
        do {
            JOptionPane.showMessageDialog(null, y + " x " + x + " = " + y * x);
            x++;
        } while (x <= 10);

        Integer z = 1;

        // Utilizando la consola
        Scanner scanner = new Scanner(System.in);
        System.out
                .println("Ingrese el número del cual se \nimprimira la tabla de multiplicar");
        y = scanner.nextInt();
        scanner.close();
        // ciclo doWhile
        do {
            System.out.println(y + " x " + z + " = " + y * z);
            z++;
        } while (z <= 10);
    }
}
