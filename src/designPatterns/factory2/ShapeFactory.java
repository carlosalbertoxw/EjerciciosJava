package factory2;

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
