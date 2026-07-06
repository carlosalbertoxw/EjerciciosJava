package com.carlos.ejercicios.patrones.factory2;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Forma concreta (círculo) que se dibuja con {@link java.awt.Graphics} (versión
 * gráfica del patrón Factory).
 *
 * @author Carlos
 */
public class Circle implements Shape {

	@Override
	public void draw(Graphics g) {
		g.clearRect(0, 0, 500, 500);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.GREEN);
		g.drawOval(140, 50, 200, 200);
		// g.drawOval(350, 70, 50, 70);
	}
}
