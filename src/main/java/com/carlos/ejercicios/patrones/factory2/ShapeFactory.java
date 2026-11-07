package com.carlos.ejercicios.patrones.factory2;

/**
 * Fábrica que crea la {@link Shape} adecuada según el tipo solicitado (versión
 * gráfica del patrón Factory).
 *
 * @author Carlos
 */
public class ShapeFactory {

    /**
     * @throws IllegalArgumentException si el tipo de forma no existe
     */
    public Shape getShape(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "CIRCULO" -> new Circle();
            case "RECTANGULO" -> new Rectangle();
            case "CUADRADO" -> new Square();
            default -> throw new IllegalArgumentException("Forma no disponible: " + tipo);
        };
    }
}
