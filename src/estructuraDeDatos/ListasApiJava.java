package estructuraDeDatos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Muestra sencillos ejemplos de la implementación de listas de la api de java
 *
 * @author carlos
 *
 */
public class ListasApiJava {

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        ListasApiJava laj = new ListasApiJava();
        laj.listaSimple();
        laj.listaEnlazada();
    }

    /**
     * Lista sismple
     */
    private void listaSimple() {
        System.out.println("Lista simple");

        List<Integer> l = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            l.add(i);
        }

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

    /**
     * Lista enlazada
     */
    private void listaEnlazada() {
        System.out.println("\nLista enlazada");

        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i = 1; i <= 10; i++) {
            ll.add(i);
        }

        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
    }
}
