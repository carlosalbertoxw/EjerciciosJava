package com.carlos.ejercicios.patrones.factory2;

/**
 * Fábrica que crea la {@link Shape} adecuada según el tipo solicitado (versión
 * gráfica del patrón Factory).
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
