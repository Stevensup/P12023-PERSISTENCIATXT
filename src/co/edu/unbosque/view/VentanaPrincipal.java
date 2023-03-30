package co.edu.unbosque.view;

import java.awt.Color;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	private PanelIngreso panel_botones;
	private PanelResultados panel_archivo;	

	public VentanaPrincipal() {
		setTitle("Persistencia: ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 800);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.WHITE);

		inicializarComponentes();

		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void inicializarComponentes() {
		panel_botones = new PanelIngreso();
		panel_botones.setBounds(25, 25, 535, 300);
		getContentPane().add(panel_botones);

		panel_archivo = new PanelResultados();
		panel_archivo.setBounds(25, 300, 535, 320);
		getContentPane().add(panel_archivo);

	}

	public PanelIngreso getPanel_botones() {
		return panel_botones;
	}

	public void setPanel_botones(PanelIngreso panel_botones) {
		this.panel_botones = panel_botones;
	}

	public PanelResultados getPanel_archivo() {
		return panel_archivo;
	}

	public void setPanel_archivo(PanelResultados panel_archivo) {
		this.panel_archivo = panel_archivo;
	}

	public File abrirArchivo() {
		JFileChooser fc = new JFileChooser();
		int seleccion = fc.showOpenDialog(this);
		if (seleccion == JFileChooser.APPROVE_OPTION) {
			return fc.getSelectedFile();
		} else {
			return null;
		}
	}
}
