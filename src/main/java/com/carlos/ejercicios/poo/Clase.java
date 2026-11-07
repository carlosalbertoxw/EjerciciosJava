package com.carlos.ejercicios.poo;

/**
 * Muestra las partes de una clase en Java: atributos, constructor y métodos. El
 * método {@code main} es opcional: solo lo necesita la clase por la que empieza la
 * ejecución.
 *
 * @author Carlos
 */
public class Clase {

    // 1 - Atributos: los datos que guarda cada objeto
    private final String nombre;

    // 2 - Constructor: deja el objeto listo para usarse
    public Clase(String nombre) {
        this.nombre = nombre;
    }

    // 3 - Métodos: lo que el objeto sabe hacer
    public String saludar() {
        return "Hola, mi nombre es " + nombre;
    }

    public static void main(String[] args) {
        Clase objeto = new Clase("Carlos");
        System.out.println(objeto.saludar());
    }
}
