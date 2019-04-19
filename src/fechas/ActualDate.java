/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.Calendar;

/**
 *
 * @author Carlos
 */
public class ActualDate {

    public String getActualDate() {
        Integer dia, mes, anio;
        Calendar c = Calendar.getInstance();
        dia = (c.get(Calendar.DATE));
        mes = (c.get(Calendar.MONTH));
        anio = (c.get(Calendar.YEAR));
        return dia + "-" + (mes + 1) + "-" + anio;
    }

    public static void main(String[] args) {
        System.out.println(new ActualDate().getActualDate());
    }
}
