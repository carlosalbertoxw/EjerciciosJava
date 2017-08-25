package estructuraDeDatos;

import java.util.Random;

public class ArbolBinarioOrdenado {

    Nodo raiz;
    int altura;

    private class Nodo {

        private Nodo izquierdo;
        private Nodo derecho;
        private int dato;
    }

    public ArbolBinarioOrdenado() {
        raiz = null;
    }

    public void insertar(int dato) {
        Nodo nodo;
        nodo = new Nodo();
        nodo.dato = dato;
        nodo.izquierdo = null;
        nodo.derecho = null;
        if (raiz == null) {
            raiz = nodo;
        } else {
            Nodo anterior = null;
            Nodo rcrd;
            rcrd = raiz;
            while (rcrd != null) {
                anterior = rcrd;
                if (dato < rcrd.dato) {
                    rcrd = rcrd.izquierdo;
                } else {
                    rcrd = rcrd.derecho;
                }
            }
            if (dato < anterior.dato) {
                anterior.izquierdo = nodo;
            } else {
                anterior.derecho = nodo;
            }
        }
    }

    private void imprimirPreOrden(Nodo rcrd) {
        if (rcrd != null) {
            System.out.println(rcrd.dato + " ");
            imprimirPreOrden(rcrd.izquierdo);
            imprimirPreOrden(rcrd.derecho);
        }
    }

    public void imprimirPreOrden() {
        imprimirPreOrden(raiz);
        System.out.println();
    }

    private void imprimirPreOrdenConNivel(Nodo rcrd, int nivel) {
        if (rcrd != null) {
            System.out.println(" (" + nivel + ") - " + rcrd.dato + " ");
            imprimirPreOrdenConNivel(rcrd.izquierdo, nivel + 1);
            imprimirPreOrdenConNivel(rcrd.derecho, nivel + 1);
        }
    }

    public void imprimirPreOrdenConNivel() {
        imprimirPreOrdenConNivel(raiz, 1);
        System.out.println();
    }

    private void imprimirEntreOrden(Nodo rcrd) {
        if (rcrd != null) {
            imprimirEntreOrden(rcrd.izquierdo);
            System.out.println(rcrd.dato + " ");
            imprimirEntreOrden(rcrd.derecho);
        }
    }

    public void imprimirEntreOrden() {
        imprimirEntreOrden(raiz);
        System.out.println();
    }

    private void imprimirEntreOrdenConNivel(Nodo rcrd, int nivel) {
        if (rcrd != null) {
            imprimirEntreOrdenConNivel(rcrd.izquierdo, nivel + 1);
            System.out.println(" (" + nivel + ") - " + rcrd.dato);
            imprimirEntreOrdenConNivel(rcrd.derecho, nivel + 1);
        }
    }

    public void imprimirEntreOrdenConNivel() {
        imprimirEntreOrdenConNivel(raiz, 1);
        System.out.println();
    }

    private void imprimirPostOrden(Nodo rcrd) {
        if (rcrd != null) {
            imprimirPostOrden(rcrd.izquierdo);
            imprimirPostOrden(rcrd.derecho);
            System.out.println(rcrd.dato + " ");
        }
    }

    public void imprimirPostOrden() {
        imprimirPostOrden(raiz);
        System.out.println();
    }

    private void imprimirPostOrdenConNivel(Nodo rcrd, int nivel) {
        if (rcrd != null) {
            imprimirPostOrdenConNivel(rcrd.izquierdo, nivel + 1);
            imprimirPostOrdenConNivel(rcrd.derecho, nivel + 1);
            System.out.println(" (" + nivel + ") - " + rcrd.dato + " ");
        }
    }

    public void imprimirPostOrdenConNivel() {
        imprimirPostOrdenConNivel(raiz, 1);
        System.out.println();
    }

    public boolean existe(int dato) {
        Nodo rcrd = raiz;
        while (rcrd != null) {
            if (dato == rcrd.dato) {
                return true;
            } else if (dato > rcrd.dato) {
                rcrd = rcrd.derecho;
            } else {
                rcrd = rcrd.izquierdo;
            }
        }
        return false;
    }

    private void retornarAltura(Nodo rcrd, int nivel) {
        if (rcrd != null) {
            retornarAltura(rcrd.izquierdo, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(rcrd.derecho, nivel + 1);
        }
    }

    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    public static void main(String[] args) {
        ArbolBinarioOrdenado abo = new ArbolBinarioOrdenado();

        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            abo.insertar(r.nextInt(101));
        }
        System.out.println("Entre orden");
        abo.imprimirEntreOrdenConNivel();
        System.out.println("Post orden");
        abo.imprimirPostOrdenConNivel();
        System.out.println("Pre orden");
        abo.imprimirPreOrdenConNivel();
        System.out.println("Altura");
        System.out.println(abo.retornarAltura());
    }
}
