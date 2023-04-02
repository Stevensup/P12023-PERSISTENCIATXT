package co.edu.unbosque.view;

/**

Esta clase representa la ventana principal de la aplicación que permite ingresar y mostrar información de viviendas y arrendatarios.
*/

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

/**
 * Constructor de la clase que crea una nueva ventana principal con un tamaño
 * predeterminado.
 */
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

	/**
	 * Este método inicializa los componentes de la ventana principal, como los
	 * paneles de ingreso y resultados para viviendas y arrendatarios.
	 */

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

	/**
	 * 
	 * Obtiene el panel de ingreso de la vivienda.
	 * 
	 * @return el panel de ingreso de la vivienda.
	 */
	public PanelIngreso getPanel_botones() {
		return this.panel_botones;
	}

	/**
	 * 
	 * Establece el panel de ingreso de la vivienda.
	 * 
	 * @param panel_botones el panel de ingreso de la vivienda a establecer.
	 */
	public void setPanel_botones(PanelIngreso panel_botones) {
		this.panel_botones = panel_botones;
	}

	/**
	 * 
	 * Obtiene el panel de ingreso de los arrendatarios.
	 * 
	 * @return el panel de ingreso de los arrendatarios.
	 */
	public PanelIngreso2 getPanel_botones2() {
		return this.panel_botones2;
	}

	/**
	 * 
	 * Establece el panel de ingreso de los arrendatarios.
	 * 
	 * @param panel_botones2 el panel de ingreso de los arrendatarios a establecer.
	 */
	public void setPanel_botones2(PanelIngreso2 panel_botones2) {
		this.panel_botones2 = panel_botones2;
	}

	/**
	 * 
	 * Obtiene el panel de resultados de los arrendatarios.
	 * 
	 * @return el panel de resultados de los arrendatarios.
	 */
	public PanelResultados2 getPanel_archivo2() {
		return this.panel_archivo2;
	}

	/**
	 * 
	 * Establece el panel de resultados de los arrendatarios.
	 * 
	 * @param panel_archivo2 el panel de resultados de los arrendatarios a
	 *                       establecer.
	 */
	public void setPanel_archivo2(PanelResultados2 panel_archivo2) {
		this.panel_archivo2 = panel_archivo2;
	}

	/**
	 * 
	 * Obtiene el panel de resultados de la vivienda.
	 * 
	 * @return el panel de resultados de la vivienda.
	 */
	public PanelResultados getPanel_archivo() {
		return this.panel_archivo;
	}

	/**
	 * 
	 * Establece el panel de resultados de la vivienda.
	 * 
	 * @param panel_archivo el panel de resultados de la vivienda a establecer.
	 */
	public void setPanel_archivo(PanelResultados panel_archivo) {
		this.panel_archivo = panel_archivo;
	}

	/**
	 * 
	 * Abre un JFileChooser para permitir al usuario seleccionar un archivo.
	 * 
	 * @return el archivo seleccionado por el usuario, o null si no se seleccionó
	 *         ningún archivo.
	 */
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
