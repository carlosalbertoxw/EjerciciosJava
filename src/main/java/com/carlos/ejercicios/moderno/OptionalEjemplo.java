package com.carlos.ejercicios.moderno;

import java.util.Map;
import java.util.Optional;

/**
 * {@link Optional}: deja explícito en el tipo de retorno que un valor puede faltar,
 * en lugar de devolver {@code null} y arriesgarse a un NullPointerException.
 *
 * @author Carlos
 */
public class OptionalEjemplo {

    private static final Map<String, String> CORREOS = Map.of("ana", "ana@ejemplo.com");

    static Optional<String> buscarCorreo(String usuario) {
        return Optional.ofNullable(CORREOS.get(usuario));
    }

    public static void main(String[] args) {
        // orElse: valor alternativo si no hay resultado
        System.out.println(buscarCorreo("ana").orElse("(sin correo)"));
        System.out.println(buscarCorreo("luis").orElse("(sin correo)"));

        // map: transforma el valor solo si existe
        String dominio = buscarCorreo("ana")
                .map(correo -> correo.substring(correo.indexOf('@') + 1))
                .orElse("desconocido");
        System.out.println("Dominio: " + dominio);

        // ifPresentOrElse: una acción para cada caso
        buscarCorreo("luis").ifPresentOrElse(
                correo -> System.out.println("Enviando a " + correo),
                () -> System.out.println("Luis no tiene correo"));
    }
}
