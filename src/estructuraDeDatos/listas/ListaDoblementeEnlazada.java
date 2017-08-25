package estructuraDeDatos.listas;

/**
 * Lista doblemente enlazada
 *
 * @author carlos
 *
 */
public class ListaDoblementeEnlazada implements InterfazLista {

    private Nodo nodo;

    /**
     * Clase nodo de la lista doblemente enlazada
     *
     * @author carlos
     *
     */
    private class Nodo {

        Object object;
        Nodo siguiente;
        Nodo anterior;

        /**
         * constructor de la clase nodo
         */
        private Nodo() {
            siguiente = null;
            anterior = null;
        }
    }

    /**
     * Constructor de la calse ListaDoblementeEnlazada
     */
    public ListaDoblementeEnlazada() {
        nodo = null;
    }

    public boolean insertar(Object dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.object = dato;
        if (nodo == null) {
            nodo = nuevoNodo;
            if (nodo.object == dato && nodo.siguiente == null
                    && nodo.anterior == null) {
                return true;
            } else {
                return false;
            }
        } else {
            Nodo nodo = this.nodo;
            while (nodo.siguiente != null) {
                nodo = nodo.siguiente;
            }
            nodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = nodo;
            if (nodo.siguiente.object == dato
                    && nodo.siguiente.siguiente == null
                    && nodo.siguiente.anterior == nodo) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void test() {
        Nodo nodo = this.nodo;
        while (nodo != null) {
            if (nodo.anterior == null && nodo.siguiente == null) {
                System.out.println("ant " + "null" + " dato " + nodo.object
                        + " sig " + "null");
            } else if (nodo.anterior == null) {
                System.out.println("ant " + "null" + " dato " + nodo.object
                        + " sig " + nodo.siguiente.object);
            } else if (nodo.siguiente == null) {
                System.out.println("ant " + nodo.anterior.object + " dato "
                        + nodo.object + " sig " + "null");
            } else {
                System.out.println("ant " + nodo.anterior.object + " dato "
                        + nodo.object + " sig " + nodo.siguiente.object);
            }
            nodo = nodo.siguiente;
        }
    }

    public int longitud() {
        int cant = 0;
        Nodo nodo = this.nodo;
        while (nodo != null) {
            nodo = nodo.siguiente;
            cant++;
        }
        return cant;
    }

    public boolean estaVacia() {
        if (nodo == null && nodo == null) {
            return true;
        } else {
            return false;
        }
    }

    public Object mostrarDatoDeIndice(int indice) {
        if (indice >= 0 && indice <= longitud()) {
            Object dato;
            if (indice == 0) {
                dato = this.nodo.object;
            } else {
                Nodo nodo = this.nodo;
                for (int i = 0; i <= indice - 1; i++) {
                    nodo = nodo.siguiente;
                }
                dato = nodo.object;
            }
            return dato;
        } else {
            System.err.println("El indice ingresado no existe en esta lista");
            return null;
        }
    }

    public Object extraerDatoDeIndice(int indice) {
        if (indice <= longitud() && indice >= 0) {
            Object dato;
            if (indice == 0) {
                dato = nodo.object;
                if (nodo.siguiente == null) {
                    nodo = null;
                } else {
                    nodo = nodo.siguiente;
                    nodo.anterior = null;
                }
            } else {
                Nodo nodo = this.nodo;
                for (int i = 0; i <= indice - 2; i++) {
                    nodo = nodo.siguiente;
                }
                dato = nodo.siguiente.object;
                nodo.siguiente = nodo.siguiente.siguiente;
                if (nodo.siguiente != null) {
                    nodo.siguiente.anterior = nodo;
                }
            }
            return dato;
        } else {
            System.err.println("El indice ingresado no existe en esta lista");
            return null;
        }
    }

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        ListaDoblementeEnlazada lde = new ListaDoblementeEnlazada();
        //
        for (int i = 0; i < 10; i++) {
            System.out.println(lde.insertar(i + 1));
        }
        //
        System.out.println();
        lde.test();
        //
        System.out.println();
        System.out.println(lde.estaVacia());
        System.out.println(lde.longitud());
        //
        System.out.println();
        for (int i = 0; i < lde.longitud(); i++) {
            System.out.println(lde.mostrarDatoDeIndice(i));
        }
        //
        System.out.println();
        while (lde.estaVacia() != true) {
            System.out.println(lde.extraerDatoDeIndice(0));

        }
        //
        System.out.println();
        System.out.println(lde.estaVacia());
        System.out.println(lde.longitud());
    }
}
