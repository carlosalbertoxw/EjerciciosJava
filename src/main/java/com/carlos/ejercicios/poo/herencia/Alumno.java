package com.carlos.ejercicios.poo.herencia;

/**
 * Un Alumno ES una Persona: hereda sus atributos y métodos y agrega lo propio.
 * {@code super} llama al constructor o a los métodos de la clase padre.
 *
 * @author Carlos
 */
public class Alumno extends Persona {

    private long numeroControl;

    public Alumno(String nombre, String apellido, int edad, long numeroControl) {
        super(nombre, apellido, edad);
        this.numeroControl = numeroControl;
    }

    public long getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(long numeroControl) {
        this.numeroControl = numeroControl;
    }

    // Sobrescribe el método de Persona y reutiliza su resultado.
    @Override
    public String toString() {
        return super.toString() + ", número de control " + numeroControl;
    }
}
