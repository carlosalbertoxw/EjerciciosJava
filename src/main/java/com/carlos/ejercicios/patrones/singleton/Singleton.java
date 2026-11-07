package com.carlos.ejercicios.patrones.singleton;

/**
 * Patrón Singleton con un enum: la JVM garantiza una única instancia, incluso con
 * varios hilos. La versión clásica con {@code if (instancia == null)} no es segura:
 * dos hilos podrían crear cada uno la suya.
 *
 * @author Carlos
 */
public enum Singleton {

    INSTANCIA;

    private int visitas;

    public synchronized int registrarVisita() {
        return ++visitas;
    }
}
