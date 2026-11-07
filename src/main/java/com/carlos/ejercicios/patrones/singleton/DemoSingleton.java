package com.carlos.ejercicios.patrones.singleton;

/**
 * Demuestra el patrón Singleton: {@link Singleton#INSTANCIA} es siempre el mismo
 * objeto, así que el estado se comparte.
 *
 * @author Carlos
 */
public class DemoSingleton {

    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCIA;
        Singleton s2 = Singleton.INSTANCIA;

        System.out.println("¿Es el mismo objeto? " + (s1 == s2));
        System.out.println("Visitas desde s1: " + s1.registrarVisita());
        System.out.println("Visitas desde s2: " + s2.registrarVisita());
    }
}
