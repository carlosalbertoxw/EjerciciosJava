package basico;

/**
 * En esta clase se muestran sencillos ejemplos de la utilización de los
 * operadores
 *
 * @author carlos
 *
 */
public class Operadores {

    /**
     * método main
     *
     * @param args
     */
    public static void main(String[] args) {
        // Operadores aritméticos
        float addition = 5 + 5;
        float subtraction = 5 - 3;
        float multiplication = 5 * 5;
        float division = 10 / 5;
        float module = 3 % 2;

        // Operadores relacionales
        int a = 1;
        int b = 2;

        if (a == b) {
        } else {
        }

        if (a != b) {
        } else {
        }

        if (a < b) {
        } else {
        }

        if (a > b) {
        } else {
        }

        if (a <= b) {
        } else {
        }

        if (a >= b) {
        } else {
        }

        // Operadores lógicos
        boolean x = true;
        boolean y = false;
        if (x == true && y == false) {
        } else {
        }

        if (x == false || y == false) {
        } else {
        }

        if (!x) {
        } else {
        }
        if (x == true & y == false) {
        } else {
        }

        if (x == false | y == false) {
        } else {
        }

        if (true ^ x) {
        } else {
        }

        // Operadores de asignación
        String g = "abcd";
        String h = "";
        int i = 2;
        int j = 6;

        h = "efgh";
        g += h;
        j -= i;
        i *= j;
        i /= j;
        j %= 4;

        // Operadores especiales
        int m = 5;

        m++;
        m++;
        ++m;
        ++m;

        m--;
        m--;
        --m;
        --m;
    }
}
