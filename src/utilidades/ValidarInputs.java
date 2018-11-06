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

    public static final String VI_USERNAME = "username";
    public static final String VI_URL = "url";
    public static final String VI_NUMERIC = "numeric";
    public static final String VI_NUMERIC_DECIMAL = "numeric_decimal";
    public static final String VI_EMAIL = "email";
    public static final String VI_STRING = "string";

    public Boolean valInput(String val, String type, Integer length, Boolean empty) {
        return tle(val, type, length, empty);
    }

    private Boolean tle(String val, String type, Integer length, Boolean empty) {
        if (val == null) {
            return false;
        }
        if (empty == false && val.length() == 0) {
            return false;
        } else if (empty == false && val.length() > 0) {
            return t(val, type, length);
        } else if (empty == true && val.length() > 0) {
            return t(val, type, length);
        } else {
            return empty == true && val.length() == 0;
        }
    }

    private Boolean t(String val, String type, Integer length) {
        Boolean flag;
        String pattern;
        switch (type) {
            case "uri":
                pattern = "^[0-9a-zA-Z-]*$";
                flag = val(val, pattern);
                break;
            case "url":
                pattern = "^(http|https)\\://[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,3}(/\\S*)?$";
                flag = val(val, pattern);
                break;
            case "numeric":
                pattern = "^[0-9]*$";
                flag = val(val, pattern);
                break;
            case "numeric_decimal":
                pattern = "^[0-9,]*\\.?[0-9]*$";
                flag = val(val, pattern);
                break;
            case "email":
                pattern = "^[^@\\s]+@[^@\\.\\s]+(\\.[^@\\.\\s]+)+$";
                flag = val(val, pattern);
                break;
            case "string":
                flag = true;
                break;
            default:
                flag = false;
                break;
        }
        return l(val, flag, length);
    }

    private Boolean l(String val, Boolean flag, Integer length) {
        return flag && val.length() <= length;
    }

    public Boolean val(String val, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(val);
        return m.find();
    }

}
