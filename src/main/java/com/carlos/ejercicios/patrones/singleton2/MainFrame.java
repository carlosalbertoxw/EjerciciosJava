package com.carlos.ejercicios.patrones.singleton2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * Ventana principal (Swing) que, al pulsar el botón, muestra una única instancia
 * de {@link SecondFrame} (patrón Singleton aplicado a una ventana).
 *
 * @author Carlos
 */
public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public MainFrame() {
        setSize(400, 400);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new JLabel("Ejemplo del patrón de diseño singleton"), BorderLayout.CENTER);

        JButton boton = new JButton("Clic aquí");
        boton.addActionListener(evento -> SecondFrame.getInstance().setVisible(true));
        add(boton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Toda interfaz Swing debe crearse en el hilo de eventos.
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
