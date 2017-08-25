package poo.polimorfismo;

/**
 * Polimorfismo: es cuando un mismo método tiene diferente comportamiento según
 * el objeto que se mande llamas
 *
 * @author carlos
 *
 */
public class TestPolimorfismo {

    public static void main(String[] args) {
        Perro p = new Perro();
        p.alimentarse();

        Vaca v = new Vaca();
        v.alimentarse();
    }
}
