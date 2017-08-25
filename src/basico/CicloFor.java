package basico;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * En esta clase se muestra un sencillo ejemplo del ciclo for
 *
 * @author carlos
 *
 */
public class CicloFor {

    /**
     * método main
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer y;

        // Utilizando JOptionPane
        y = Integer
                .parseInt(JOptionPane
                        .showInputDialog("Ingrese el número del cual se \nimprimira la tabla de multiplicar"));
        // ciclo for
        for (Integer x = 0; x <= 10; x++) {
            JOptionPane.showMessageDialog(null, y + " x " + x + " = " + y * x);
        }
        ;

        // Utilizando la consola
        Scanner scanner = new Scanner(System.in);
        System.out
                .println("Ingrese el número del cual se \nimprimira la tabla de multiplicar");
        y = scanner.nextInt();
        scanner.close();
        // ciclo for
        for (Integer z = 0; z <= 10; z++) {
            System.out.println(y + " x " + z + " = " + y * z);
        }
        ;
    }
}
