package factory2;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Shape {

	@Override
	public void draw(Graphics g) {
		g.clearRect(0, 0, 500, 500);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.GREEN);
		g.drawRect(40, 50, 400, 200);
		// g.fillRect(40, 50, 400, 200);
	}
}
