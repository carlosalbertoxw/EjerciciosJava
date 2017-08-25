package basico;

/**
 * En esta clase se muestran las descripciones de los diferentes tipos de datos
 *
 * @author carlos
 *
 */
public class TiposDeDatos {

    /**
     * método main
     *
     * @param args
     */
    public static void main(String[] args) {

        // Tipo de dato String
        String string = "abcdefgh qwerty  '' \"\"1234 -+*}{[]";
        System.out.println("String: " + string);

        // Datos primitivos en java

        /*
         * Tipo de dato: byte
         * 
         * Representación: Numérico Entero con signo
         * 
         * Tamaño: (Bytes) 1
         * 
         * Rango: -128 hasta 127
         * 
         * Default: 0
         * 
         * Clase: Byte
         */
        byte b = 0;
        System.out.println("byte: " + b);

        /*
         * Tipo de dato: short
         * 
         * Representación: Numérico Entero con signo
         * 
         * Tamaño: (Bytes) 2
         * 
         * Rango: -32768 hasta 32767
         * 
         * Default: 0
         * 
         * Clase: Short
         */
        short s = 0;
        System.out.println("short: " + s);

        /*
         * Tipo de dato: int
         * 
         * Representación: Numérico Entero con signo
         * 
         * Tamaño: (Bytes) 4
         * 
         * Rango: -2147483648 hasta 2147483647
         * 
         * Default: 0
         * 
         * Clase: Integer
         */
        int i = 0;
        System.out.println("int: " + i);

        /*
         * Tipo de dato: long
         * 
         * Representación: Numérico Entero con signo
         * 
         * Tamaño: (Bytes) 8
         * 
         * Rango: -9223372036854775808 hasta 9223372036854775807
         * 
         * Default: 0
         * 
         * Clase: Long
         */
        long l = 0;
        System.out.println("long: " + l);

        /*
         * Tipo de dato: float
         * 
         * Representación: Numérico en Coma flotante de precisión simple Norma
         * IEEE 754
         * 
         * Tamaño: (Bytes) 4
         * 
         * Rango: ± 3.4x10-38 hasta ± 3.4x1038
         * 
         * Default: 0.0
         * 
         * Clase: Float
         */
        float f = 0.0F;
        System.out.println("float: " + f);

        /*
         * Tipo de dato: double
         * 
         * Representación: Numérico en Coma flotante de precisión doble Norma
         * IEEE 754
         * 
         * Tamaño: (Bytes) 8
         * 
         * Rango: ± 1.8x10-308 a ± 1.8x10308
         * 
         * Default: 0.0
         * 
         * Clase: Double
         */
        double d = 0.0;
        System.out.println("double: " + d);

        /*
         * Tipo de dato: char
         * 
         * Representación: Carácter Unicode
         * 
         * Tamaño: (Bytes) 2
         * 
         * Rango: \u0000 hasta \uFFFF
         * 
         * Default: \u0000
         * 
         * Clase: Character
         */
        char c = 'a';
        System.out.println("char: " + c);

        /*
         * Tipo de dato: boolean
         * 
         * Representación: Dato lógico
         * 
         * Tamaño: (Bytes) -
         * 
         * Rango: true ó false
         * 
         * Default: false
         * 
         * Clase: Boolean
         */
        boolean e = false;
        System.out.println("boolean: " + e);
    }
}
