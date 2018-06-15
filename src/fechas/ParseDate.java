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

    public static String yyyymmdd(String date) {
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

    public static String ddmmyyyy(String date) {
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

    public static String ddmmmyyyy(String date) {
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

    public static void main(String[] args) {
        System.out.println(ParseDate.ddmmyyyy("1999-01-20"));
        System.out.println(ParseDate.yyyymmdd("20-01-1999"));
        System.out.println(ParseDate.ddmmmyyyy("1999-01-20"));
    }
}
