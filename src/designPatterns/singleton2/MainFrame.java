package singleton2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		setSize(400, 400);
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JLabel label = new JLabel("Ejemplo del patrón de diseño singleton");
		add(label, BorderLayout.CENTER);

		JButton button = new JButton("Clic aquí");
		add(button, BorderLayout.SOUTH);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SecondFrame sf = SecondFrame.getInstance();
				sf.setVisible(true);
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
