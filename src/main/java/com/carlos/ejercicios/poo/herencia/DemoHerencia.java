package com.carlos.ejercicios.poo.herencia;

/**
 * Herencia: una clase hereda atributos y métodos de otra, su superclase.
 *
 * @author Carlos
 */
public class DemoHerencia {

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Sandra", "Campos", 20, 1409011110L);

        // Métodos heredados de Persona y método propio de Alumno
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Número de control: " + alumno.getNumeroControl());

        // toString() de Alumno, que amplía el de Persona
        System.out.println("Datos completos: " + alumno);
    }
}
