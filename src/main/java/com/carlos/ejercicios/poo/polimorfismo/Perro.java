package com.carlos.ejercicios.poo.polimorfismo;

/**
 * Subclase de {@link Animal} que da su propio comportamiento a
 * {@link #alimentarse()} (polimorfismo).
 *
 * @author Carlos
 */
public class Perro extends Animal {

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de croquetas");
    }

}
