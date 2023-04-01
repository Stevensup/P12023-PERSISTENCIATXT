package co.edu.unbosque.view;

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

public class PanelIngreso extends JPanel {

	private JTextField Propietario;
	private JTextField Tamaño;
	private JTextField Nhabitaciones;
	private JTextField Direccion;
	private JTextField Propiedad;

	private JButton boton_escribir;
	private JButton boton_ver;
	private JButton boton_borrar;

	public PanelIngreso() {
		setLayout(null);
		inicializarComponentes();
		setBorder(new TitledBorder("Ingreso información Vivienda:"));
		setBackground(new Color(255, 225, 123));
	}

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
		Nhabitaciones = new JTextField();
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

		// Crear JTextField Propiedad
		Propiedad = new JTextField();
		Propiedad.setBounds(75, 215, 280, 40);
		TitledBorder borderPropiedad = BorderFactory.createTitledBorder("Tipo de Propiedad");
		Border emptyBorderPropiedad = BorderFactory.createEmptyBorder(0, 5, 0, 5);
		Propiedad.setBorder(new CompoundBorder(borderPropiedad, emptyBorderPropiedad));
		Propiedad.setFont(new Font("Arial", Font.PLAIN, 16));
		add(Propiedad);

		// Botones Escribir
		boton_escribir = new JButton("Escribir");
		boton_escribir.setBounds(380, 35, 120, 25);
		boton_escribir.setActionCommand("ESCRIBIR");
		add(boton_escribir);

		// Botones Ver
		boton_ver = new JButton("Ver");
		boton_ver.setBounds(380, 65, 120, 25);
		boton_ver.setActionCommand("VER");
		add(boton_ver);

		// Botones Borrar
		boton_borrar = new JButton("Limpiar Campo");
		boton_borrar.setBounds(380, 90, 120, 25);
		boton_borrar.setActionCommand("BORRAR");
		add(boton_borrar);
	}

	public JTextField getPropietario() {
		return this.Propietario;
	}

	public void setPropietario(JTextField Propietario) {
		this.Propietario = Propietario;
	}

	public JTextField getTamaño() {
		return this.Tamaño;
	}

	public void setTamaño(JTextField Tamaño) {
		this.Tamaño = Tamaño;
	}

	public JTextField getNhabitaciones() {
		return this.Nhabitaciones;
	}

	public void setNhabitaciones(JTextField Nhabitaciones) {
		this.Nhabitaciones = Nhabitaciones;
	}

	public JTextField getDireccion() {
		return this.Direccion;
	}

	public void setDireccion(JTextField Direccion) {
		this.Direccion = Direccion;
	}

	public JTextField getPropiedad() {
		return this.Propiedad;
	}

	public void setPropiedad(JTextField Propiedad) {
		this.Propiedad = Propiedad;
	}

	public JButton getBoton_escribir() {
		return this.boton_escribir;
	}

	public void setBoton_escribir(JButton boton_escribir) {
		this.boton_escribir = boton_escribir;
	}

	public JButton getBoton_ver() {
		return this.boton_ver;
	}

	public void setBoton_ver(JButton boton_ver) {
		this.boton_ver = boton_ver;
	}

	public JButton getBoton_borrar() {
		return this.boton_borrar;
	}

	public void setBoton_borrar(JButton boton_borrar) {
		this.boton_borrar = boton_borrar;
	}

}
