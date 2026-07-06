package com.carlos.ejercicios.estructurasdedatos.listas;

/**
 * Lista circular de estructura de datos
 *
 * @author Carlos
 */
public class ListaCircular implements InterfazLista {

    private Nodo nodo;

    /**
     * Clase nodo de la lista circular
     *
     * @author Carlos
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
        if (indice >= 0 && indice < longitud()) {
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
        if (indice < longitud() && indice >= 0) {
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
        ListaCircular lc = new ListaCircular();
        System.out.println("== Lista circular (el último nodo apunta al primero) ==");

        System.out.println("Insertando los valores 20..29");
        for (int i = 0; i < 10; i++) {
            lc.insertar(i + 20);
        }

        System.out.println("\nContenido (dato -> siguiente):");
        lc.test();

        System.out.println("\nLongitud: " + lc.longitud());
        System.out.println("¿Está vacía? " + lc.estaVacia());
        System.out.println("Dato en índice 3: " + lc.mostrarDatoDeIndice(3));

        System.out.print("\nExtrayendo desde el inicio: ");
        while (!lc.estaVacia()) {
            System.out.print(lc.extraerDatoDeIndice(0) + " ");
        }
        System.out.println("\n¿Está vacía ahora? " + lc.estaVacia()
                + " | Longitud: " + lc.longitud());
    }
}
