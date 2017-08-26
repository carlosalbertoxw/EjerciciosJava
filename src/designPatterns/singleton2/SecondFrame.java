package singleton2;

import java.awt.Color;

import javax.swing.JFrame;

public class SecondFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static SecondFrame frame;

	private SecondFrame() {
		setSize(200, 200);
		getContentPane().setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static SecondFrame getInstance() {
		if (frame == null) {
			frame = new SecondFrame();
		}
		return frame;
	}

}
