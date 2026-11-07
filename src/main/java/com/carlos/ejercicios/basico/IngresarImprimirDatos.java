package com.carlos.ejercicios.basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Tres formas de pedir datos al usuario: {@link Scanner}, {@link BufferedReader}
 * y los diálogos gráficos de {@link JOptionPane}. Este es el único ejercicio que
 * usa diálogos, que requieren un entorno con escritorio.
 * <p>
 * No se cierra {@code System.in}: cerrarlo impediría volver a leer de la consola
 * durante el resto del programa.
 *
 * @author Carlos
 */
public class IngresarImprimirDatos {

    private static void saludar(String nombre, int edad) {
        System.out.println("Hola. Tu nombre es: " + nombre + " y tienes " + edad + " años");
    }

    /** Scanner: la forma más cómoda de leer de la consola. */
    private static void conScanner(Scanner scanner) {
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = Integer.parseInt(scanner.nextLine());
        saludar(nombre, edad);
    }

    /** BufferedReader: lee línea por línea y obliga a manejar IOException. */
    private static void conBufferedReader() throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa tu nombre");
        String nombre = lector.readLine();
        System.out.println("Ingresa tu edad");
        int edad = Integer.parseInt(lector.readLine());
        saludar(nombre, edad);
    }

    /** JOptionPane: pide y muestra los datos con ventanas de diálogo. */
    private static void conDialogos() {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
        JOptionPane.showMessageDialog(null,
                "Hola. Tu nombre es: " + nombre + " y tienes " + edad + " años");
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cómo quieres ingresar los datos?");
        System.out.println("1. Scanner   2. BufferedReader   3. Diálogos (JOptionPane)");

        switch (scanner.nextLine().trim()) {
            case "1" -> conScanner(scanner);
            case "2" -> conBufferedReader();
            case "3" -> conDialogos();
            default -> System.out.println("Opción no válida");
        }
    }
}
