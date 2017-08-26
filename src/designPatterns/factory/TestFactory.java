package factory;

import java.util.Scanner;

public class TestFactory {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ShapeFactory factory = new ShapeFactory();

		String req = "";
		do {
			System.out.println("Teclea la forma solicitada:");
			String shapeType = scanner.next();
			// get an object of shape required and call its draw method.
			Shape shape = factory.getShape(shapeType);
			// call draw method of shape required, if not exist print a error
			// message
			if (shape != null) {
				shape.draw();
			} else {
				System.out.println("Esta forma no esta disponible");
			}
			System.out.println("Deseas continuar s/n:");
			req = scanner.next();
		} while (req.equalsIgnoreCase("S"));
		scanner.close();
		System.out.println("Programa terminado");
	}
}
