package estructuraDeDatos.listas;

/**
 * Lista generica de estructura de datos
 *
 * @author carlos
 *
 */
public class ListaGenerica implements InterfazLista {

    private Nodo nodo;

    /**
     * Clase nodo de la lista generica
     *
     * @author carlos
     *
     */
    private class Nodo {

        Object object;
        Nodo siguiente;
    }

    /**
     * constructor de la clase
     */
    public ListaGenerica() {
        nodo = null;
    }

    public boolean insertar(Object dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.object = dato;
        if (nodo == null) {
            nodo = nuevoNodo;
            if (nodo.object == dato && nodo.siguiente == null) {
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
            nuevoNodo.siguiente = null;
            if (nodo.siguiente.object == dato
                    && nodo.siguiente.siguiente == null) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void test() {
        int indice = 0;
        Nodo nodo = this.nodo;
        while (nodo != null) {
            if (nodo.siguiente == null) {
                System.out.println(indice + " - " + nodo.object + " null");
            } else {
                System.out.println(indice + " - " + nodo.object + " "
                        + nodo.siguiente.object);
            }
            nodo = nodo.siguiente;
            indice++;
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
        while (nodo != null) {
            nodo = nodo.siguiente;
            cant++;
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
                if (nodo.siguiente != null) {
                    nodo = nodo.siguiente;
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
        ListaGenerica lg = new ListaGenerica();
        for (int i = 0; i < 10; i++) {
            System.out.println(lg.insertar(i + 30));
        }
        //
        System.out.println();
        lg.test();
        //
        System.out.println();
        System.out.println("Longitud: " + lg.longitud());
        System.out.println("Esta vacia: " + lg.estaVacia());
        //
        System.out.println();
        for (int i = 0; i < lg.longitud(); i++) {
            System.out.println(lg.mostrarDatoDeIndice(i));
        }
        //
        System.out.println();
        while (lg.estaVacia() != true) {
            System.out.println(lg.extraerDatoDeIndice(0));
        }
        //
        System.out.println();
        System.out.println("Longitud: " + lg.longitud());
        System.out.println("Esta vacia: " + lg.estaVacia());
    }

}
