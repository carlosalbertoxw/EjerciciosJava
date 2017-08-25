package poo.herencia;

/**
 * Esta clase forma parte de un sencillo ejemplo de herencia en java orientado a
 * objetos
 *
 * @author carlos
 *
 */
public class Alumno extends Persona {

    private long numeroControl;

    /**
     *
     * @return el valor de la variable numeroControl
     */
    public long getNumeroControl() {
        return numeroControl;
    }

    /**
     * Establece un valor a la variable numeroControl
     *
     * @param numeroControl
     */
    public void setNumeroControl(long numeroControl) {
        this.numeroControl = numeroControl;
    }

}
