package com.carlos.ejercicios.basico;

/**
 * Los tipos primitivos de Java con su tamaño y su rango. Los rangos se leen de las
 * constantes de cada clase envoltorio ({@code Integer.MAX_VALUE}, etc.), así que no
 * hay que memorizarlos.
 *
 * @author Carlos
 */
public class TiposDeDatos {

    public static void main(String[] args) {
        // String no es primitivo: es una clase, pero se usa a cada momento.
        String texto = "abcdefgh qwerty  '' \"\"1234 -+*}{[]";
        System.out.println("String: " + texto);

        System.out.println("\nEnteros con signo (clase envoltorio entre paréntesis):");
        System.out.printf("byte  (Byte,    1 byte)  : %d a %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short (Short,   2 bytes) : %d a %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int   (Integer, 4 bytes) : %d a %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long  (Long,    8 bytes) : %d a %d%n", Long.MIN_VALUE, Long.MAX_VALUE);

        // MAX_VALUE es el mayor valor; MIN_VALUE, el positivo más pequeño (no el más negativo).
        System.out.println("\nComa flotante IEEE 754 (con signo ±):");
        System.out.println("float  (Float,  4 bytes) : " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("double (Double, 8 bytes) : " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);

        System.out.println("\nOtros:");
        System.out.printf("char    (Character, 2 bytes): \\u%04x a \\u%04x%n",
                (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        System.out.println("boolean (Boolean)           : true o false");

        // Sufijos y literales: L para long, F para float, comillas simples para char.
        long grande = 9_000_000_000L;
        float decimal = 1.5F;
        char letra = 'a';
        boolean activo = true;
        System.out.println("\nEjemplos: " + grande + ", " + decimal + ", " + letra + ", " + activo);

        // Los atributos de una clase toman un valor por defecto (0, 0.0, false,
        // \u0000 o null); las variables locales, como estas, hay que inicializarlas.
    }
}
