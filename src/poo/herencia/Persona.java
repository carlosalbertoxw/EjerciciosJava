package poo.herencia;

/**
 * Esta clase forma parte de un sencillo ejemplo de herencia en java orientado a
 * objetos
 *
 * @author carlos
 *
 */
public class Persona {

    private long cve;
    private String nombre;
    private String apellido;
    private String edad;
    private String sexo;

    /**
     *
     * @return el valor de la variable cve
     */
    public long getCve() {
        return cve;
    }

    /**
     * Establece un valor a la variable cve
     *
     * @param cve
     */
    public void setCve(long cve) {
        this.cve = cve;
    }

    /**
     *
     * @return el valor de la variable nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un valor a la variable nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return el valor de la variable apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece un valor a la variable apellido
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return el valor de la variable edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * Establece un valor a la variable edad
     *
     * @param edad
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     *
     * @return el valor de la variable sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Establece un valor a la variable sexo
     *
     * @param sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
