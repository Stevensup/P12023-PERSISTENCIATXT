package co.edu.unbosque.view;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class VentanaPrincipal extends JFrame {
	// Vivienda
	private PanelIngreso panel_botones;
	private PanelResultados panel_archivo;

	// arrendatarios
	private PanelIngreso2 panel_botones2;
	private PanelResultados2 panel_archivo2;

	public VentanaPrincipal() {
		setTitle("Persistencia: ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1100, 800);
		getContentPane().setLayout(null);
		getContentPane().setLayout(new GridLayout(2, 2));

		inicializarComponentes();

		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void inicializarComponentes() {
		// VIVIENDA
		panel_botones = new PanelIngreso();
		panel_botones.setBounds(25, 25, 535, 300);
		getContentPane().add(panel_botones);

		panel_archivo = new PanelResultados();
		panel_archivo.setBounds(25, 300, 535, 400);
		getContentPane().add(panel_archivo);

		// ARRENDATARIOS
		panel_botones2 = new PanelIngreso2();
		panel_botones2.setBounds(25, 25, 535, 300);
		getContentPane().add(panel_botones2);

		panel_archivo2 = new PanelResultados2();
		panel_archivo2.setBounds(600, 300, 535, 400);
		getContentPane().add(panel_archivo2);

	}

	public PanelIngreso getPanel_botones() {
		return this.panel_botones;
	}

	public void setPanel_botones(PanelIngreso panel_botones) {
		this.panel_botones = panel_botones;
	}

	public PanelIngreso2 getPanel_botones2() {
		return this.panel_botones2;
	}

	public void setPanel_botones2(PanelIngreso2 panel_botones2) {
		this.panel_botones2 = panel_botones2;
	}

	public PanelResultados2 getPanel_archivo2() {
		return this.panel_archivo2;
	}

	public void setPanel_archivo2(PanelResultados2 panel_archivo2) {
		this.panel_archivo2 = panel_archivo2;
	}

	public PanelResultados getPanel_archivo() {
		return this.panel_archivo;
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
