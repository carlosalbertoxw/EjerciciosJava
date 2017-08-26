package factory2;

import java.awt.Color;
import java.awt.Graphics;

public class Square implements Shape {

	@Override
	public void draw(Graphics g) {
		g.clearRect(0, 0, 500, 500);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.GREEN);
		g.drawRect(140, 50, 200, 200);
		// g.fillRect(140, 50, 200, 200);
	}
}
