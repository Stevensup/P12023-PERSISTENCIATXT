package co.edu.unbosque.view;

/**

Este paquete contiene todas las vistas necesarias para la aplicación
*/

import javax.swing.JButton;
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
 * Clase PanelIngreso2 que extiende JPanel y se encarga de mostrar la interfaz
 * para el ingreso de información del arrendatario
 */
public class PanelIngreso2 extends JPanel {

	private JTextField Inquilino;
	private JTextField Documento_Id;
	private JTextField CuotaMensual;
	private JTextField FechadePago;

	private JButton boton_escribir;
	private JButton boton_ver;
	private JButton boton_borrar;

	public PanelIngreso2() {
		setLayout(null);
		inicializarComponentes();
		setBorder(new TitledBorder("Ingreso información Arrendatario:"));
		setBackground(new Color(255, 255, 200));
	}

	/**
	 * 
	 * Método que inicializa los componentes del panel
	 */

	public void inicializarComponentes() {

		// Crear JTextField Inquilino
		Inquilino = new JTextField();
		Inquilino.setBounds(75, 25, 280, 40);
		TitledBorder border = BorderFactory.createTitledBorder("Inquilino");
		Border emptyBorder = BorderFactory.createEmptyBorder(0, 5, 0, 5);
		Inquilino.setBorder(new CompoundBorder(border, emptyBorder));
		Inquilino.setFont(new Font("Arial", Font.PLAIN, 16));
		add(Inquilino);

		// Crear JTextField Documento_Id
		Documento_Id = new JTextField();
		Documento_Id.setBounds(75, 70, 280, 40);
		TitledBorder borderDocumento_Id = BorderFactory.createTitledBorder("Documento_Id");
		Border emptyBorderDocumento_Id = BorderFactory.createEmptyBorder(0, 5, 0, 5);
		Documento_Id.setBorder(new CompoundBorder(borderDocumento_Id, emptyBorderDocumento_Id));
		Documento_Id.setFont(new Font("Arial", Font.PLAIN, 16));
		add(Documento_Id);

		// Crear JTextField CuotaMensual
		CuotaMensual = new JTextField();
		CuotaMensual.setBounds(75, 205, 280, 40);
		TitledBorder borderCuotaMensual = BorderFactory.createTitledBorder("Cuota Mensual");
		Border emptyBorderCuotaMensual = BorderFactory.createEmptyBorder(0, 5, 0, 5);
		CuotaMensual.setBorder(new CompoundBorder(borderCuotaMensual, emptyBorderCuotaMensual));
		CuotaMensual.setFont(new Font("Arial", Font.PLAIN, 16));
		add(CuotaMensual);

		// Crear JTextField FechadePago
		FechadePago = new JTextField();
		FechadePago.setBounds(75, 250, 280, 40);
		TitledBorder borderFechadePago = BorderFactory.createTitledBorder("Fecha de Pago");
		Border emptyBorderFechadePago = BorderFactory.createEmptyBorder(0, 5, 0, 5);
		FechadePago.setBorder(new CompoundBorder(borderFechadePago, emptyBorderFechadePago));
		FechadePago.setFont(new Font("Arial", Font.PLAIN, 16));
		add(FechadePago);

		// // Botones Escribir
		// boton_escribir = new JButton("Escribir");
		// boton_escribir.setBounds(360, 25, 120, 25);
		// boton_escribir.setActionCommand("ESCRIBIR");
		// add(boton_escribir);

		// // Botones Ver
		// boton_ver = new JButton("Ver");
		// boton_ver.setBounds(360, 55, 120, 25);
		// boton_ver.setActionCommand("VER");
		// add(boton_ver);

		// // Botones Borrar
		// boton_borrar = new JButton("Limpiar Campo");
		// boton_borrar.setBounds(360, 80, 120, 25);
		// boton_borrar.setActionCommand("BORRAR");
		// add(boton_borrar);
	}

	/**
	 * 
	 * Retorna el valor del campo de texto Inquilino
	 * 
	 * @return el valor actual del campo de texto Inquilino
	 */
	public JTextField getInquilino() {
		return this.Inquilino;
	}

	/**
	 * 
	 * Establece el valor del campo de texto Inquilino
	 * 
	 * @param Inquilino el nuevo valor para el campo de texto Inquilino
	 */
	public void setInquilino(JTextField Inquilino) {
		this.Inquilino = Inquilino;
	}

	/**
	 * 
	 * Retorna el valor del campo de texto Documento_Id
	 * 
	 * @return el valor actual del campo de texto Documento_Id
	 */
	public JTextField getDocumento_Id() {
		return this.Documento_Id;
	}

	/**
	 * 
	 * Establece el valor del campo de texto Documento_Id
	 * 
	 * @param Documento_Id el nuevo valor para el campo de texto Documento_Id
	 */
	public void setDocumento_Id(JTextField Documento_Id) {
		this.Documento_Id = Documento_Id;
	}

	/**
	 * 
	 * Retorna el valor del campo de texto Asignacion
	 * 
	 * @return el valor actual del campo de texto Asignacion
	 */
	public JTextField getAsignacion() {
		return this.Asignacion;
	}

	/**
	 * 
	 * Establece el valor del campo de texto Asignacion
	 * 
	 * @param Asignacion el nuevo valor para el campo de texto Asignacion
	 */
	public void setAsignacion(JTextField Asignacion) {
		this.Asignacion = Asignacion;
	}

	/**
	 * 
	 * Retorna el valor del campo de texto Nombre
	 * 
	 * @return el valor actual del campo de texto Nombre
	 */
	public JTextField getNombre() {
		return this.Nombre;
	}

	/**
	 * 
	 * Establece el valor del campo de texto Nombre
	 * 
	 * @param Nombre el nuevo valor para el campo de texto Nombre
	 */
	public void setNombre(JTextField Nombre) {
		this.Nombre = Nombre;
	}

	/**
	 * 
	 * Retorna el valor del campo de texto CuotaMensual
	 * 
	 * @return el valor actual del campo de texto CuotaMensual
	 */
	public JTextField getCuotaMensual() {
		return this.CuotaMensual;
	}

	/**
	 * 
	 * Establece el valor del campo de texto CuotaMensual
	 * 
	 * @param CuotaMensual el nuevo valor para el campo de texto CuotaMensual
	 */
	public void setCuotaMensual(JTextField CuotaMensual) {
		this.CuotaMensual = CuotaMensual;
	}

	/**
	 * 
	 * Retorna el valor del botón boton_escribir
	 * 
	 * @return el valor actual del botón boton_escribir
	 */
	public JButton getBoton_escribir() {
		return this.boton_escribir;
	}

	/**
	 * 
	 * Establece el valor del botón boton_escribir
	 * 
	 * @param boton_escribir el nuevo valor para el botón boton_escribir
	 */
	public void setBoton_escribir(JButton boton_escribir) {
		this.boton_escribir = boton_escribir;
	}

	/**
	 * 
	 * Retorna el valor del botón boton_ver
	 * 
	 * @return el valor actual del botón boton_ver
	 */
	public JButton getBoton_ver() {
		return this.boton_ver;
	}

	/**
	 * 
	 * Establece el valor del botón boton_ver
	 * 
	 * @param boton_ver el nuevo valor para el botón boton_ver
	 */
	public void setBoton_ver(JButton boton_ver) {
		this.boton_ver = boton_ver;
	}

	/**
	 * 
	 * Retorna el valor del botón boton_borrar
	 * 
	 * @return el valor actual del botón boton_borrar
	 */
	public JButton getBoton_borrar() {
		return this.boton_borrar;
	}

	/**
	 * Establece el botón para borrar la información del formulario.
	 *
	 * @param boton_borrar el botón para borrar la información del formulario
	 */
	public void setBoton_borrar(JButton boton_borrar) {
		this.boton_borrar = boton_borrar;
	}

	/**
	 * Obtiene el campo de texto para la fecha de pago.
	 *
	 * @return el campo de texto para la fecha de pago
	 */
	public JTextField getFechadePago() {
		return this.FechadePago;
	}

	/**
	 * Establece el campo de texto para la fecha de pago.
	 *
	 * @param FechadePago el campo de texto para la fecha de pago
	 */
	public void setFechadePago(JTextField FechadePago) {
		this.FechadePago = FechadePago;
	}

}
