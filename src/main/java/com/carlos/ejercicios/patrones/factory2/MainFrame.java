package com.carlos.ejercicios.patrones.factory2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ItemEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Ventana Swing que aplica el patrón Factory: al elegir una forma en el combo,
 * usa {@link ShapeFactory} para crearla y la dibuja en el panel central.
 *
 * @author Carlos
 */
public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final String SIN_SELECCION = "Selecciona una opción";

    /**
     * Panel que recuerda la forma actual. Swing vuelve a llamar a paintComponent
     * cada vez que hace falta (al redimensionar, al restaurar...), por lo que el
     * dibujo nunca se pierde. Por eso no se dibuja con getGraphics().
     */
    private static class Lienzo extends JPanel {

        private static final long serialVersionUID = 1L;
        private transient Shape forma;

        private void mostrar(Shape nuevaForma) {
            forma = nuevaForma;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (forma != null) {
                forma.draw(g);
            }
        }
    }

    public MainFrame() {
        setTitle("Dibujando formas con el factory pattern");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Lienzo lienzo = new Lienzo();
        lienzo.setBackground(Color.WHITE);
        add(lienzo, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(Color.WHITE);
        add(panelInferior, BorderLayout.SOUTH);
        panelInferior.add(new JLabel("Forma"));

        JComboBox<String> combo = new JComboBox<>(
                new String[] {SIN_SELECCION, "Rectangulo", "Cuadrado", "Circulo"});
        ShapeFactory factory = new ShapeFactory();
        combo.addItemListener(evento -> {
            // Cada cambio avisa dos veces: al deseleccionar y al seleccionar.
            if (evento.getStateChange() == ItemEvent.SELECTED) {
                String opcion = (String) evento.getItem();
                lienzo.mostrar(opcion.equals(SIN_SELECCION) ? null : factory.getShape(opcion));
            }
        });
        panelInferior.add(combo);
    }

    public static void main(String[] args) {
        // Toda interfaz Swing debe crearse en el hilo de eventos.
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
