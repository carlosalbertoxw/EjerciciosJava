package com.carlos.ejercicios.patrones.factory;

/**
 * Forma concreta (círculo) del patrón Factory; imprime su dibujo por consola.
 *
 * @author Carlos
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Dibujando un circulo");
	}
}
