/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Carlos
 */
public class ValidarInputs {

    public static final String VI_URI = "uri";
    public static final String VI_URL = "url";
    public static final String VI_NUMERIC = "numeric";
    public static final String VI_NUMERIC_DECIMAL = "numeric_decimal";
    public static final String VI_EMAIL = "email";
    public static final String VI_STRING = "string";

    public String valInput(String val, String type, Integer length, Boolean empty, String field) {
        return tle(val, type, length, empty, field);
    }

    private String tle(String val, String type, Integer length, Boolean empty, String field) {
        if (val == null) {
            return "El campo '" + field + "' no puede ser nulo";
        }
        if (empty == false && val.length() == 0) {
            return "El campo '" + field + "' no puede estar vacio";
        } else if (empty == false && val.length() > 0) {
            return t(val, type, length, field);
        } else if (empty == true && val.length() > 0) {
            return t(val, type, length, field);
        } else {
            return "";
        }
    }

    private String t(String val, String type, Integer length, String field) {
        String response;
        String pattern;
        String mensaje;
        switch (type) {
            case "uri":
                pattern = "^[0-9a-zA-Z-]*$";
                mensaje = "El campo '" + field + "' solo acepta los siguientes caracteres 0-9 a-z A-Z - ";
                response = val(val, pattern, mensaje);
                break;
            case "url":
                pattern = "^(http|https)\\://[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,3}(/\\S*)?$";
                mensaje = "Ingresa una URL valida en el campo '" + field + "'";
                response = val(val, pattern, mensaje);
                break;
            case "numeric":
                pattern = "^[0-9]*$";
                mensaje = "Ingresa un valor numérico valido en el campo '" + field + "'";
                response = val(val, pattern, mensaje);
                break;
            case "numeric_decimal":
                pattern = "^[0-9,]*\\.?[0-9]*$";
                mensaje = "Ingresa un valor decimal valido en el campo '" + field + "'";
                response = val(val, pattern, mensaje);
                break;
            case "email":
                pattern = "^[^@\\s]+@[^@\\.\\s]+(\\.[^@\\.\\s]+)+$";
                mensaje = "Ingresa un correo electrónico valido en el campo '" + field + "'";
                response = val(val, pattern, mensaje);
                break;
            case "string":
                response = "";
                break;
            default:
                response = "Error al validar el tipo de dato del campo '" + field + "'";
                break;
        }
        return l(val, response, length, field);
    }

    private String l(String val, String response, Integer length, String field) {
        if (response.equals("")) {
            if (val.length() <= length) {
                return "";
            } else {
                return "La longitud del campo '" + field + "' no puede ser mayor a " + length;
            }
        } else {
            return response;
        }
    }

    public String val(String val, String pattern, String message) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(val);
        if (m.find()) {
            return "";
        } else {
            return message;
        }
    }

}
