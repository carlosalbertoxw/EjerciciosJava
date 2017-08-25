package poo;

import javax.swing.JOptionPane;

/**
 * Esta clase muestra la estructura de una clase en java
 *
 * @author carlos
 *
 */
public class Clase {

    // La estructura de una clase en java consta de cuatro partes
    // 1 - Atributos o variables de la clase
    private String nombre;

    // 2 - El constructor (sirve para inicializar variables o componentes para
    // la correcta ejecución de la clase)
    public Clase() {
        nombre = JOptionPane.showInputDialog("Por favor escribe tu nombre");
        imprimeNombre(nombre);
    }

    // 3 - El metodo main (opcional, solo si es la primera clase que se ejecuta)
    public static void main(String[] args) {
        new Clase();
    }

    // 4 - Metodos o funciones de la clase
    public void imprimeNombre(String nombre) {
        JOptionPane.showMessageDialog(null, "Tu nombre es: " + nombre);
    }
}
