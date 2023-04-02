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

	public JTextField getInquilino() {
		return this.Inquilino;
	}

	public void setInquilino(JTextField Inquilino) {
		this.Inquilino = Inquilino;
	}

	public JTextField getDocumento_Id() {
		return this.Documento_Id;
	}

	public void setDocumento_Id(JTextField Documento_Id) {
		this.Documento_Id = Documento_Id;
	}

	public JTextField getAsignacion() {
		return this.Asignacion;
	}

	public void setAsignacion(JTextField Asignacion) {
		this.Asignacion = Asignacion;
	}

	public JTextField getNombre() {
		return this.Nombre;
	}

	public void setNombre(JTextField Nombre) {
		this.Nombre = Nombre;
	}

	public JTextField getCuotaMensual() {
		return this.CuotaMensual;
	}

	public void setCuotaMensual(JTextField CuotaMensual) {
		this.CuotaMensual = CuotaMensual;
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

	public JTextField getFechadePago() {
		return this.FechadePago;
	}

	public void setFechadePago(JTextField FechadePago) {
		this.FechadePago = FechadePago;
	}

}
