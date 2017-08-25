package swing;

import java.awt.Color;

import javax.swing.JFrame;

/**
 * Muestra un sencillo ejemplo de una interfaz gráfica
 *
 * @author carlos
 *
 */
public class InterfazGrafica extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor de la clase
     */
    public InterfazGrafica() {
        setLayout(null);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setTitle("Interfaz gráfica");
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        new InterfazGrafica();
    }
}
