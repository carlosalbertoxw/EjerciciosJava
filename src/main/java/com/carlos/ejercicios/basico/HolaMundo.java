package com.carlos.ejercicios.basico;

import javax.swing.JOptionPane;

/**
 * En esta clase se muestra como imprimir mensajes
 *
 * @author Carlos
 */
public class HolaMundo {

    /**
     * método main
     *
     * @param args
     */
    public static void main(String[] args) {
        // Utilizando JOptionPane
        JOptionPane.showMessageDialog(null, "Hola Mundo :)");

        // Utilizando la consola
        System.out.print("Hola Mundo :)");
    }
}
