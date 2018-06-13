/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificaciones;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 *
 * @author Carlos
 */
public class CodificarBase64 {

    public static String codificarBase64(String a) {
        Base64.Encoder encoder = Base64.getEncoder();
        String b = encoder.encodeToString(a.getBytes(StandardCharsets.UTF_8));
        return b;
    }

    public static String decodificarBase64(String a) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedByteArray = decoder.decode(a);

        String b = new String(decodedByteArray);
        return b;
    }

    public static void main(String[] args) {
        String codificado = codificarBase64("Hola Mundo!");
        System.out.println(codificado);
        String decodificado = decodificarBase64(codificado);
        System.out.println(decodificado);
    }
}
