package com.carlos.ejercicios.patrones.singleton;

/**
 * Demuestra el patrón Singleton: {@link Singleton#getInstance()} devuelve
 * siempre el mismo objeto.
 *
 * @author Carlos
 */
public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println("Creando un objeto en la primera instancia: "
				+ s1.toString());

		Singleton s2 = Singleton.getInstance();
		System.out
				.println("Retornando el mismo objeto en la segunda instancia: "
						+ s2.toString());

	}
}
