package com.carlos.ejercicios.patrones.singleton;

/**
 * Implementación clásica del patrón Singleton: garantiza una única instancia por
 * JVM mediante un constructor privado y {@link #getInstance()}.
 *
 * @author Carlos
 */
public class Singleton {

	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;

	}
}
