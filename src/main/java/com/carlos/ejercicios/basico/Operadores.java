package com.carlos.ejercicios.basico;

/**
 * En esta clase se muestran sencillos ejemplos de la utilización de los
 * operadores, imprimiendo por consola el resultado de cada uno.
 *
 * @author Carlos
 */
public class Operadores {

    /**
     * método main
     *
     * @param args
     */
    public static void main(String[] args) {
        // Operadores aritméticos
        System.out.println("== Operadores aritméticos ==");
        System.out.println("5 + 5 = " + (5 + 5));
        System.out.println("5 - 3 = " + (5 - 3));
        System.out.println("5 * 5 = " + (5 * 5));
        System.out.println("10 / 5 = " + (10 / 5));
        System.out.println("3 % 2 = " + (3 % 2));

        // Operadores relacionales
        System.out.println("\n== Operadores relacionales ==");
        int a = 1;
        int b = 2;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >= b : " + (a >= b));

        // Operadores lógicos
        System.out.println("\n== Operadores lógicos ==");
        boolean x = true;
        boolean y = false;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));
        System.out.println("x & y  : " + (x & y));
        System.out.println("x | y  : " + (x | y));
        System.out.println("x ^ y  : " + (x ^ y));

        // Operadores de asignación
        System.out.println("\n== Operadores de asignación ==");
        String g = "abcd";
        g += "efgh";
        System.out.println("g += \"efgh\" -> " + g);
        int i = 2;
        int j = 6;
        j -= i;
        System.out.println("j -= i -> " + j);
        i *= j;
        System.out.println("i *= j -> " + i);
        i /= j;
        System.out.println("i /= j -> " + i);
        j %= 4;
        System.out.println("j %= 4 -> " + j);

        // Operadores de incremento y decremento
        System.out.println("\n== Incremento y decremento ==");
        int m = 5;
        System.out.println("m      = " + m);
        System.out.println("m++    = " + (m++) + " (después m = " + m + ")");
        System.out.println("++m    = " + (++m));
        System.out.println("m--    = " + (m--) + " (después m = " + m + ")");
        System.out.println("--m    = " + (--m));
    }
}
