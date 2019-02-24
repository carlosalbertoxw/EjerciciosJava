/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Worker extends Thread {

    public static void main(String[] args) {
        try {
            new Worker().start();
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Worker() throws InterruptedException {
        int i = 1;
        while (true) {
            work(i);
            Thread.sleep(5000);
            i++;
        }
    }

    private void work(int i) {
        System.out.println("Trabajo: " + i);
    }

}
