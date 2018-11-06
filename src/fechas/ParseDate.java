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
 * Documentación Oracle
 * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
 *
 * @author Carlos
 */
public class ParseDate {

    public static String format1(String date) {
        if (date != null && date.length() > 0) {
            try {
                Date d = new SimpleDateFormat("dd-MM-yyyy").parse(date);
                return String.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(d));
            } catch (ParseException ex) {
                Logger.getLogger(ParseDate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return date;
    }

    public static String format2(String date) {
        if (date != null && date.length() > 0) {
            try {
                Date d = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                return String.valueOf(new SimpleDateFormat("dd-MM-yyyy").format(d));
            } catch (ParseException ex) {
                Logger.getLogger(ParseDate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return date;
    }

    public static String format3(String date) {
        if (date != null && date.length() > 0) {
            try {
                Date d = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                return String.valueOf(new SimpleDateFormat("dd-MMM-yyyy", new Locale("es")).format(d));
            } catch (ParseException ex) {
                Logger.getLogger(ParseDate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return date;
    }

    public static String format4(String date) {
        if (date != null && date.length() > 0) {
            try {
                Date d = new SimpleDateFormat("dd-MMM-yyyy", new Locale("es")).parse(date);
                return String.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(d));
            } catch (ParseException ex) {
                Logger.getLogger(ParseDate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return date;
    }

    public static void main(String[] args) {
        System.out.println(ParseDate.format1("20-01-2010"));
        System.out.println(ParseDate.format2("2010-01-20"));
        System.out.println(ParseDate.format3("2010-01-20"));
        System.out.println(ParseDate.format4("20-ene-2010"));
    }
}
