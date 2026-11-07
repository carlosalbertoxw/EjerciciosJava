package com.carlos.ejercicios.patrones.factory2;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Forma concreta (rectángulo) que se dibuja con {@link java.awt.Graphics}
 * (versión gráfica del patrón Factory).
 *
 * @author Carlos
 */
public class Rectangle implements Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawRect(40, 50, 400, 200);
    }
}
