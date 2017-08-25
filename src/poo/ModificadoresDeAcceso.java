package poo;

/**
 * Esta clase muestra un ejemplo de la utilización de los diferentes
 * modificadores de acceso que hay en java
 *
 * @author carlos
 *
 */
public class ModificadoresDeAcceso {

    /*
     * Existen 4 tipos de modificadores de acceso en java<br>
     * 
     * 1 - public: se puede acceder al elemento desde la misma clase, desde una
     * clase del mismo paquete, desde una subclase de otro paquete y desde otras
     * clases de otros paquetes<br>
     * 
     * 2 - protected: se puede acceder al elemento desde la misma clase, desde
     * una clase del mismo paquete y desde una subclase de otro paquete<br>
     * 
     * 3 - default: se puede acceder al elemento desde la misma clase y desde
     * una clase del mismo paquete<br>
     * 
     * 4 - private: solo se puede acceder al elemento desde la misma clase<br>
     */
    /**
     * variable publica
     */
    public String nombre;

    /**
     * variable protegida
     */
    protected String usuario;

    /**
     * variable default
     */
    String edad;

    /**
     * variable privada
     */
    private String apellido;

    /**
     * constructor publico
     */
    public ModificadoresDeAcceso() {

    }

    /**
     * constructor protegido
     */
    protected ModificadoresDeAcceso(String param1, String param2) {

    }

    /**
     * constructor default
     */
    ModificadoresDeAcceso(String param1, String param2, String param3) {

    }

    /**
     * constructor privado
     */
    private ModificadoresDeAcceso(String param1) {

    }

    /**
     * metodo publico
     */
    public void publicImprimeDatos() {

    }

    /**
     * metodo protegido
     */
    protected void protectedImprimeDatos() {

    }

    /**
     * metodo default
     */
    void defaultImprimeDatos() {

    }

    /**
     * metodo privado
     */
    private void privateImprimeDatos() {

    }

    /**
     * clase publica
     */
    public class ClasePublica {

    }

    /**
     * clase protegida
     */
    protected class ClaseProtegida {

    }

    /**
     * clase default
     */
    class ClaseDefault {

    }

    /**
     * clase privada
     */
    private class ClasePrivada {

    }

}
