package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * En esta clase se muestra como imprimir mensajes, ingresar datos e imprimir
 * los datos ingresados de diferentes maneras
 *
 * @author carlos
 *
 */
public class IngresarImprimirDatos {

    /**
     * Permite ingresar un nombre y una edad y los imprime utilizando
     * JOptionPane
     */
    public void IOConJOptionPane() {
        String name;
        int edad;
        //
        name = JOptionPane.showInputDialog("Ingresa tu nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
        JOptionPane.showMessageDialog(null, "Hola. Tu nombre es: " + name
                + " y tienes " + edad + " años");
    }

    /**
     * Permite ingresar un nombre y una edad y los imprime utilizando la clase
     * Scanner
     */
    public void IOConScanner() {
        String name = "";
        int edad = 0;

        // Utilizando la clase Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nomre");
        name = scanner.next();
        System.out.println("Ingresa tu edad");
        edad = Integer.parseInt(scanner.next());
        scanner.close();
        System.out.println("Hola. Tu nombre es: " + name + " y tienes " + edad
                + " años");
    }

    /**
     * Permite ingresar un nombre y una edad y los imprime utilizando
     * InputStreamReader y BufferedReader
     */
    public void IOConSRyBR() {
        String name = "";
        int edad = 0;
        //
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);
        try {
            System.out.println("Ingresa tu nombre");
            name = br.readLine();
            System.out.println("Ingresa tu edad");
            edad = Integer.parseInt(br.readLine());
            br.close();
            sr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hola. Tu nombre es: " + name + " y tienes " + edad
                + " años");
    }

    /**
     * método main
     *
     * @param args
     */
    public static void main(String[] args) {
        IngresarImprimirDatos datos = new IngresarImprimirDatos();
        datos.IOConSRyBR();
    }
}
