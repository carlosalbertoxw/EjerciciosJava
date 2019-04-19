package poo.polimorfismo;

/**
 * Polimorfismo: es cuando un mismo método tiene diferente comportamiento según
 * el objeto que se mande llamar
 *
 * @author carlos
 *
 */
public class TestPolimorfismo {

    public static void main(String[] args) {
        Animal a;

        a = new Perro();
        a.alimentarse();

        a = new Vaca();
        a.alimentarse();
    }
}
