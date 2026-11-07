package com.carlos.ejercicios.poo.polimorfismo;

import java.util.List;

/**
 * Polimorfismo: un mismo método se comporta distinto según el objeto que lo ejecuta.
 *
 * @author Carlos
 */
public class DemoPolimorfismo {

    public static void main(String[] args) {
        List<Animal> animales = List.of(new Perro(), new Vaca());

        for (Animal animal : animales) {
            animal.alimentarse();
        }
    }
}
