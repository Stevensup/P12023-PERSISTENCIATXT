package co.edu.unbosque.view;

/**

Este paquete contiene la clase PanelIngreso, la cual es una extensión de JPanel que representa la vista de la
pantalla de ingreso de información sobre una vivienda en el sistema.
*/

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.Color;

/**
 * 
 * Clase que representa la vista del panel de ingreso de información de
 * viviendas.
 */
public class PanelIngreso extends JPanel {

	private JTextField Propietario;
	private JTextField Tamaño;
	private JComboBox<String> Nhabitaciones;
	private JTextField Direccion;

	private JButton boton_escribir;
	private JButton boton_ver;
	private JButton boton_borrar;

	/**
	 * 
	 * Constructor de la clase PanelIngreso, el cual inicializa la vista y sus
	 * componentes.
	 */

	public PanelIngreso() {
		setLayout(null);
		inicializarComponentes();
		setBorder(new TitledBorder("Ingreso información Vivienda:"));
		setBackground(new Color(255, 225, 123));
	}

	/**
	 * 
	 * Método que inicializa los componentes de la vista.
	 */

	public void inicializarComponentes() {

		// Crear JTextField Propietario
		Propietario = new JTextField();
		Propietario.setBounds(75, 35, 280, 40);
		TitledBorder border = BorderFactory.createTitledBorder("Propietario");
		Border emptyBorder = BorderFactory.createEmptyBorder(0, 5, 0, 5);
		Propietario.setBorder(new CompoundBorder(border, emptyBorder));
		Propietario.setFont(new Font("Arial", Font.PLAIN, 16));
		add(Propietario);

		// Crear JTextField Tamaño
		Tamaño = new JTextField();
		Tamaño.setBounds(75, 80, 280, 40);
		TitledBorder borderTamaño = BorderFactory.createTitledBorder("Tamaño");
		Border emptyBorderTamaño = BorderFactory.createEmptyBorder(0, 5, 0, 5);
		Tamaño.setBorder(new CompoundBorder(borderTamaño, emptyBorderTamaño));
		Tamaño.setFont(new Font("Arial", Font.PLAIN, 16));
		add(Tamaño);

		// Crear JTextField Nhabitaciones
		Nhabitaciones = new JComboBox<String>();
		Nhabitaciones.addItem("ESTUDIO");
		Nhabitaciones.addItem("1 HABITACION");
		Nhabitaciones.addItem("2 HABITACIONES");
		Nhabitaciones.addItem("3 HABITACIONES");
		Nhabitaciones.setBounds(75, 125, 280, 40);
		TitledBorder borderNhabitaciones = BorderFactory.createTitledBorder("Número de Habitaciones");
		Border emptyBorderNhabitaciones = BorderFactory.createEmptyBorder(0, 5, 0, 5);
		Nhabitaciones.setBorder(new CompoundBorder(borderNhabitaciones, emptyBorderNhabitaciones));
		Nhabitaciones.setFont(new Font("Arial", Font.PLAIN, 16));
		add(Nhabitaciones);

		// Crear JTextField Direccion
		Direccion = new JTextField();
		Direccion.setBounds(75, 170, 280, 40);
		TitledBorder borderDireccion = BorderFactory.createTitledBorder("Dirección");
		Border emptyBorderDireccion = BorderFactory.createEmptyBorder(0, 5, 0, 5);
		Direccion.setBorder(new CompoundBorder(borderDireccion, emptyBorderDireccion));
		Direccion.setFont(new Font("Arial", Font.PLAIN, 16));
		add(Direccion);

		// Botones Escribir
		boton_escribir = new JButton("Escribir");
		boton_escribir.setBounds(400, 270, 120, 25);
		boton_escribir.setActionCommand("ESCRIBIR");
		add(boton_escribir);

		// Botones Ver
		boton_ver = new JButton("Ver");
		boton_ver.setBounds(400, 300, 120, 25);
		boton_ver.setActionCommand("VER");
		add(boton_ver);

		// Botones Borrar
		boton_borrar = new JButton("Limpiar Campo");
		boton_borrar.setBounds(400, 330, 120, 25);
		boton_borrar.setActionCommand("BORRAR");
		add(boton_borrar);
	}

	/**
	 * 
	 * Devuelve el campo de texto correspondiente al propietario.
	 * 
	 * @return JTextField del propietario
	 */
	public JTextField getPropietario() {
		return this.Propietario;
	}

	/**
	 * 
	 * Establece el valor del campo de texto correspondiente al propietario.
	 * 
	 * @param Propietario JTextField del propietario
	 */
	public void setPropietario(JTextField Propietario) {
		this.Propietario = Propietario;
	}

	/**
	 * 
	 * Devuelve el campo de texto correspondiente al tamaño de la propiedad.
	 * 
	 * @return JTextField del tamaño
	 */
	public JTextField getTamaño() {
		return this.Tamaño;
	}

	/**
	 * 
	 * Establece el valor del campo de texto correspondiente al tamaño de la
	 * propiedad.
	 * 
	 * @param Tamaño JTextField del tamaño
	 */
	public void setTamaño(JTextField Tamaño) {
		this.Tamaño = Tamaño;
	}

	/**
	 * 
	 * Devuelve el cuadro de selección correspondiente al número de habitaciones.
	 * 
	 * @return JComboBox del número de habitaciones
	 */
	public JComboBox<String> getNhabitaciones() {
		return this.Nhabitaciones;
	}

	/**
	 * 
	 * Establece el valor del cuadro de selección correspondiente al número de
	 * habitaciones.
	 * 
	 * @param Nhabitaciones JComboBox del número de habitaciones
	 */
	public void setNhabitaciones(JComboBox<String> Nhabitaciones) {
		this.Nhabitaciones = Nhabitaciones;
	}

	/**
	 * 
	 * Devuelve el campo de texto correspondiente a la dirección de la propiedad.
	 * 
	 * @return JTextField de la dirección
	 */
	public JTextField getDireccion() {
		return this.Direccion;
	}

	/**
	 * 
	 * Establece el valor del campo de texto correspondiente a la dirección de la
	 * propiedad.
	 * 
	 * @param Direccion JTextField de la dirección
	 */
	public void setDireccion(JTextField Direccion) {
		this.Direccion = Direccion;
	}

	/**
	 * 
	 * Devuelve el campo de texto correspondiente al tipo de propiedad.
	 * 
	 * @return JTextField del tipo de propiedad
	 */
	public JTextField getPropiedad() {
		return this.Propiedad;
	}

	/**
	 * 
	 * Establece el valor del campo de texto correspondiente al tipo de propiedad.
	 * 
	 * @param Propiedad JTextField del tipo de propiedad
	 */
	public void setPropiedad(JTextField Propiedad) {
		this.Propiedad = Propiedad;
	}

	/**
	 * 
	 * Devuelve el botón correspondiente a la acción de escribir.
	 * 
	 * @return JButton de la acción de escribir
	 */
	public JButton getBoton_escribir() {
		return this.boton_escribir;
	}

	/**
	 * 
	 * Establece el valor del botón correspondiente a la acción de escribir.
	 * 
	 * @param boton_escribir JButton de la acción de escribir
	 */
	public void setBoton_escribir(JButton boton_escribir) {
		this.boton_escribir = boton_escribir;
	}

	/**
	 * 
	 * Devuelve el botón correspondiente a la acción de ver.
	 * 
	 * @return JButton de la acción de ver
	 */
	public JButton getBoton_ver() {
		return this.boton_ver;
	}

	/**
	 * 
	 * Establece el valor del botón correspondiente a la acción de ver.
	 * 
	 * @param boton_ver JButton de la acción de ver
	 */
	public void setBoton_ver(JButton boton_ver) {
		this.boton_ver = boton_ver;
	}

	/**
	 * 
	 * Devuelve el botón correspondiente a la acción de borrar.
	 * 
	 * @return JButton de la acción de borrar
	 */
	public JButton getBoton_borrar() {
		return this.boton_borrar;
	}
	/**
	 * 
	 * Establece el valor del botón correspondiente a la acción de borrar.
	 * 
	 * @param boton_borrar JButton de la acción de borrar
	 */

}
