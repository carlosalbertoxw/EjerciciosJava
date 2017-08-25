package poo.herencia;

import javax.swing.JOptionPane;

/**
 * Herencia: es cuando una clase hereda propiedades o atributos de una clase
 * mayor o superclase
 *
 * @author carlos
 *
 */
public class TestHerencia {

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {

        // En esta parte solo se hace una instancia de la clase Alumno y como
        // Alumno hereda de la clase Persona se pueden utilizar los metodos de
        // Persona
        Alumno alumno = new Alumno();
        alumno.setNombre("Sandra");
        alumno.setApellido("Campos");
        alumno.setEdad("20");
        alumno.setSexo("Femenino");
        alumno.setNumeroControl(1409011110);
        alumno.setCve(1);

        JOptionPane.showMessageDialog(null,
                "Datos del alumno:\n" + "\nNombre: " + alumno.getNombre() + "\nApellido: " + alumno.getApellido()
                + "\nEdad: " + alumno.getEdad() + "\nSexo: " + alumno.getSexo() + "\nNumero de control: "
                + alumno.getNumeroControl());
    }
}
