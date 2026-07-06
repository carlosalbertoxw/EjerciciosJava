package com.carlos.ejercicios.poo;

/**
 * Esta clase muestra un ejemplo de la utilización de los diferentes
 * modificadores de acceso que hay en java
 *
 * @author Carlos
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
        System.out.println("  -> método public: accesible desde cualquier clase");
    }

    /**
     * metodo protegido
     */
    protected void protectedImprimeDatos() {
        System.out.println("  -> método protected: accesible desde el paquete y subclases");
    }

    /**
     * metodo default
     */
    void defaultImprimeDatos() {
        System.out.println("  -> método default: accesible desde el mismo paquete");
    }

    /**
     * metodo privado
     */
    private void privateImprimeDatos() {
        System.out.println("  -> método private: accesible solo desde esta clase");
    }

    /**
     * método main
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("== Modificadores de acceso en Java ==");
        System.out.println("public    : misma clase, mismo paquete, subclases y otras clases (cualquier lugar)");
        System.out.println("protected : misma clase, mismo paquete y subclases (incluso de otro paquete)");
        System.out.println("default   : misma clase y mismo paquete");
        System.out.println("private   : solo la misma clase");

        // Desde la propia clase se puede acceder a los cuatro niveles de visibilidad
        ModificadoresDeAcceso obj = new ModificadoresDeAcceso();
        obj.nombre = "Carlos";    // public
        obj.usuario = "carlos99"; // protected
        obj.edad = "30";          // default
        obj.apellido = "Pérez";   // private

        System.out.println("\nAtributos (todos accesibles desde la misma clase):");
        System.out.println("  public    nombre   = " + obj.nombre);
        System.out.println("  protected usuario  = " + obj.usuario);
        System.out.println("  default   edad     = " + obj.edad);
        System.out.println("  private   apellido = " + obj.apellido);

        System.out.println("\nMétodos:");
        obj.publicImprimeDatos();
        obj.protectedImprimeDatos();
        obj.defaultImprimeDatos();
        obj.privateImprimeDatos();
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
