package com.carlos.ejercicios.patrones.factory;

/**
 * Forma concreta (cuadrado) del patrón Factory; imprime su dibujo por consola.
 *
 * @author Carlos
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Dibujando un cuadrado");
	}
}
