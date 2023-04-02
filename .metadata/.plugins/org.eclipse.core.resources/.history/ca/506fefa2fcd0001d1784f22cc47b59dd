package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class PanelResultados extends JPanel {

	private JTextArea area_texto;

	public PanelResultados() {
		setLayout(null);
		inicializarComponentes();
		setBorder(new TitledBorder("1. Archivo:"));
		setBackground(new Color(255, 225, 123));
	}

	public void inicializarComponentes() {
		area_texto = new JTextArea();
		area_texto.setBounds(25, 50, 380, 320);
		JScrollPane panel = new JScrollPane(area_texto);
		panel.setBounds(25, 50, 480, 320);
		panel.setBackground(new Color(105, 145, 245));
		add(panel);
	}

	public JTextArea getArea_texto() {
		return area_texto;
	}

	public void setArea_texto(JTextArea area_texto) {
		this.area_texto = area_texto;
	}

}
