package basico;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * En esta clase se muestra un sencillo ejemplo del ciclo while
 *
 * @author carlos
 *
 */
public class CicloWhile {

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
        // ciclo while
        while (x <= 10) {
            JOptionPane.showMessageDialog(null, y + " x " + x + " = " + y * x);
            x++;
        }
        ;

        Integer z = 1;

        // Utilizando la consola
        Scanner scanner = new Scanner(System.in);
        System.out
                .println("Ingrese el número del cual se \nimprimira la tabla de multiplicar");
        y = scanner.nextInt();
        scanner.close();
        // ciclo while
        while (z <= 10) {
            System.out.println(y + " x " + z + " = " + y * z);
            z++;
        }
        ;
    }
}
