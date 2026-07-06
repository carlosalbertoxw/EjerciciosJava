package com.carlos.ejercicios.patrones.factory;

/**
 * Fábrica que crea la {@link Shape} adecuada según el tipo solicitado. Es el
 * corazón del patrón Factory: centraliza la creación de los objetos.
 *
 * @author Carlos
 */
public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("CIRCULO")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGULO")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("CUADRADO")) {
			return new Square();
		} else {
			return null;
		}
	}
}
