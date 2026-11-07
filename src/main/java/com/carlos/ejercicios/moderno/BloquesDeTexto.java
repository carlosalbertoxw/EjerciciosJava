package com.carlos.ejercicios.moderno;

/**
 * Bloques de texto: cadenas de varias líneas entre tres comillas, sin concatenar ni
 * escapar comillas. Java quita la sangría común.
 *
 * @author Carlos
 */
public class BloquesDeTexto {

    public static void main(String[] args) {
        String json = """
                {
                  "nombre": "Ana",
                  "activo": true
                }
                """;
        System.out.println(json);

        // formatted() rellena los marcadores, igual que String.format.
        String plantilla = """
                Hola %s,
                tu saldo es de $%.2f.
                """.formatted("Luis", 1250.5);
        System.out.println(plantilla);

        // La barra invertida al final une la línea con la siguiente.
        String enUnaLinea = """
                Esta frase está en dos líneas \
                del código, pero se imprime en una.""";
        System.out.println(enUnaLinea);
    }
}
