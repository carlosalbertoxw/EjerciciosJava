package estructuraDeDatos.listas;

/**
 * Lista circular de estructura de datos
 *
 * @author carlos
 *
 */
public class ListaCircular implements InterfazLista {

    private Nodo nodo;

    /**
     * Clase nodo de la lista circular
     *
     * @author carlos
     *
     */
    private class Nodo {

        Object object;
        Nodo siguiente;
    }

    /**
     * Constructor de la clase
     */
    public ListaCircular() {
        nodo = null;
    }

    public boolean insertar(Object dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.object = dato;
        if (nodo == null) {
            nodo = nuevoNodo;
            nuevoNodo.siguiente = nodo;
            if (nodo.object == dato && nodo.siguiente == nuevoNodo) {
                return true;
            } else {
                return false;
            }
        } else {
            Nodo nodo = this.nodo;
            do {
                nodo = nodo.siguiente;
            } while (nodo.siguiente != this.nodo);
            nodo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = this.nodo;
            if (nodo.siguiente.object == dato
                    && nodo.siguiente.siguiente == this.nodo) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void test() {
        if (nodo != null) {
            Nodo nodo = this.nodo;
            do {
                System.out.println(nodo.object + " siguiente: "
                        + nodo.siguiente.object);
                nodo = nodo.siguiente;
            } while (nodo != this.nodo);
        }
    }

    public boolean estaVacia() {
        if (nodo == null) {
            return true;
        } else {
            return false;
        }
    }

    public int longitud() {
        int cant = 0;
        Nodo nodo = this.nodo;
        if (nodo != null) {
            do {
                nodo = nodo.siguiente;
                cant++;
            } while (nodo != this.nodo);
        }
        return cant;
    }

    public Object mostrarDatoDeIndice(int indice) {
        if (indice >= 0 && indice <= longitud()) {
            Object dato;
            if (indice == 0) {
                dato = nodo.object;
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
                if (nodo.siguiente != nodo) {
                    Nodo nodo = this.nodo;
                    do {
                        nodo = nodo.siguiente;
                    } while (nodo.siguiente != this.nodo);
                    this.nodo = this.nodo.siguiente;
                    nodo.siguiente = this.nodo;
                } else {
                    nodo = null;
                }
            } else {
                Nodo nodo = this.nodo;
                for (int i = 0; i <= indice - 2; i++) {
                    nodo = nodo.siguiente;
                }
                dato = nodo.siguiente.object;
                nodo.siguiente = nodo.siguiente.siguiente;
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
        //
        ListaCircular lc = new ListaCircular();
        for (int i = 0; i < 10; i++) {
            System.out.println(lc.insertar(i + 20));
        }
        //
        System.out.println();
        lc.test();
        //
        System.out.println();
        System.out.println("Longitud: " + lc.longitud());
        System.out.println("Esta vacia: " + lc.estaVacia());
        //
        System.out.println();
        for (int i = 0; i < lc.longitud(); i++) {
            System.out.println(lc.mostrarDatoDeIndice(i));
        }
        //
        System.out.println();
        while (lc.estaVacia() != true) {
            System.out.println(lc.extraerDatoDeIndice(0));
        }
        //
        System.out.println();
        System.out.println("Longitud: " + lc.longitud());
        System.out.println("Esta vacia: " + lc.estaVacia());
    }
}
