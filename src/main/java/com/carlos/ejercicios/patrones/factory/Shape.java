package com.carlos.ejercicios.patrones.factory;

/**
 * Producto del patrón Factory: define la operación común ({@link #draw()}) que
 * implementarán todas las formas concretas.
 *
 * @author Carlos
 */
public interface Shape {
	public void draw();
}
