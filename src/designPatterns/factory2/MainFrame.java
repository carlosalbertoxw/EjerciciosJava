package factory2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		setTitle("Dibujando formas con el factory pattern");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel centerPanel = new JPanel();
		add(centerPanel, BorderLayout.CENTER);
		centerPanel.setBackground(Color.WHITE);

		JPanel soutPanel = new JPanel();
		soutPanel.setBackground(Color.WHITE);
		add(soutPanel, BorderLayout.SOUTH);

		JLabel lblForma = new JLabel("Forma");
		soutPanel.add(lblForma);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Selecciona una opción");
		comboBox.addItem("Rectangulo");
		comboBox.addItem("Cuadrado");
		comboBox.addItem("Circulo");
		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				ShapeFactory factory = new ShapeFactory();
				String forma = comboBox.getSelectedItem().toString();
				Shape shape = factory.getShape(forma);
				if (shape != null) {
					shape.draw(centerPanel.getGraphics());
				} else {
					centerPanel.repaint();
				}
			}
		});
		soutPanel.add(comboBox);

		setVisible(true);
		repaint();
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
