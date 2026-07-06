package com.carlos.ejercicios.patrones.factory;

/**
 * Forma concreta (rectángulo) del patrón Factory; imprime su dibujo por consola.
 *
 * @author Carlos
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Dibujando un rectangulo");
	}
}
