package estructuraDeDatos.listas;

/**
 * Interfaz de las clases lista de estructura de datos
 *
 * @author carlos
 *
 */
public interface InterfazLista {

    /**
     * Inserta un nodo a una lista
     *
     * @param object
     * @return true si el metodo se ejecuto correctamente o false de lo
     * contrario
     */
    public boolean insertar(Object object);

    /**
     * Retorna el dato del indice ingresado y elimina el nodo
     *
     * @param indice
     * @return el dato del indice ingresado
     */
    public Object extraerDatoDeIndice(int indice);

    /**
     * Retorna el dato del indice ingresado
     *
     * @param indice
     * @return el dato del indice ingresado
     */
    public Object mostrarDatoDeIndice(int indice);

    /**
     * Cuenta los nodos de la lista
     *
     * @return la longitud de la lista
     */
    public int longitud();

    /**
     * Comprueba si la lista esta vacia o si tiene por lo menos un nodo
     *
     * @return true si esta vacia o false si tiene por lo menos un nodo
     */
    public boolean estaVacia();

    /**
     * Método para probar el correcto funcionamiento de la lista
     */
    public void test();
}
