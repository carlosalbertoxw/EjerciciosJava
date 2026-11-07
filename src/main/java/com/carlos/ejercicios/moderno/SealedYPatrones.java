package com.carlos.ejercicios.moderno;

import java.util.List;

/**
 * Tipos sellados y coincidencia de patrones. Una interfaz {@code sealed} declara
 * exactamente quién puede implementarla, así que el {@code switch} sabe que cubrió
 * todos los casos: si mañana se agrega una figura, deja de compilar hasta atenderla.
 * <p>
 * Compáralo con el patrón Factory o el polimorfismo clásico: aquí el comportamiento
 * vive fuera de las clases de datos.
 *
 * @author Carlos
 */
public class SealedYPatrones {

    sealed interface Figura permits Circulo, Rectangulo, Triangulo {
    }

    record Circulo(double radio) implements Figura {
    }

    record Rectangulo(double ancho, double alto) implements Figura {
    }

    record Triangulo(double base, double altura) implements Figura {
    }

    // Sin "default": el compilador comprueba que no falte ningún caso.
    static double area(Figura figura) {
        return switch (figura) {
            case Circulo(double radio) -> Math.PI * radio * radio;
            case Rectangulo(double ancho, double alto) -> ancho * alto;
            case Triangulo(double base, double altura) -> base * altura / 2;
        };
    }

    static String describir(Object valor) {
        return switch (valor) {
            case Integer n when n > 10 -> "entero grande: " + n;
            case Integer n -> "entero: " + n;
            case String texto -> "texto de " + texto.length() + " letras";
            case null -> "sin valor";
            default -> "otro tipo: " + valor.getClass().getSimpleName();
        };
    }

    public static void main(String[] args) {
        List<Figura> figuras = List.of(new Circulo(3), new Rectangulo(4, 5), new Triangulo(3, 6));
        for (Figura figura : figuras) {
            System.out.printf("%s -> área %.2f%n", figura, area(figura));
        }

        System.out.println();
        System.out.println(describir(42));
        System.out.println(describir(7));
        System.out.println(describir("hola"));
        System.out.println(describir(null));
        System.out.println(describir(3.14));

        // instanceof con patrón: comprueba el tipo y declara la variable a la vez.
        Object dato = "Java";
        if (dato instanceof String texto && !texto.isEmpty()) {
            System.out.println("\nEn mayúsculas: " + texto.toUpperCase());
        }
    }
}
