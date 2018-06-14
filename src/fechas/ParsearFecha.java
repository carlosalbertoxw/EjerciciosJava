/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ParsearFecha {

    public static String yyyymmdd(String f) {
        if (f != null && f.length() > 0) {
            try {
                Date date = new SimpleDateFormat("dd-MM-yyyy").parse(f);
                return String.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(date));
            } catch (ParseException ex) {
                Logger.getLogger(ParsearFecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return f;
    }

    public static String ddmmyyyy(String f) {
        if (f != null && f.length() > 0) {
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(f);
                return String.valueOf(new SimpleDateFormat("dd-MM-yyyy").format(date));
            } catch (ParseException ex) {
                Logger.getLogger(ParsearFecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return f;
    }

    public static String ddmmmyyyy(String f) {
        if (f != null && f.length() > 0) {
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(f);
                return String.valueOf(new SimpleDateFormat("dd-MMM-yyyy", new Locale("es")).format(date));
            } catch (ParseException ex) {
                Logger.getLogger(ParsearFecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(ParsearFecha.ddmmyyyy("1999-01-20"));
        System.out.println(ParsearFecha.yyyymmdd("20-01-1999"));
        System.out.println(ParsearFecha.ddmmmyyyy("1999-01-20"));
    }
}
