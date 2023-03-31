package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Documento;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal vista;
	private Documento documento;

	public Controller() {
		vista = new VentanaPrincipal();
		documento = new Documento();
		asignarOyentes();
	}

	public void asignarOyentes() {
		vista.getPanel_botones().getBoton_borrar().addActionListener(this);
		vista.getPanel_botones().getBoton_escribir().addActionListener(this);
		vista.getPanel_botones().getBoton_ver().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();


		if (comando.equals("VER")) {
			String texto = documento.leerDocumento();
			vista.getPanel_archivo().getArea_texto().setText(texto);
		} else if (comando.equals("ESCRIBIR")) {
			String texto = "";
			String direccion = vista.getPanel_botones().getDireccion().getText();
			String tamaño = vista.getPanel_botones().getTamaño().getText();
			String habitaciones = vista.getPanel_botones().getNhabitaciones().getText();
			String propietario = vista.getPanel_botones().getPropietario().getText();

			if (documento.getContenido() != null) {
				texto = documento.actualizarDocumento(documento.getContenido() + "\n" +
						"Propiedad # " + (documento.obtenerNumeroPropiedades()+1) + " [ Dirección: " + direccion + " ]\n" +
						"Tamaño: " + tamaño + "\n" +
						"N° de Habitaciones: " + habitaciones + " Propietario: " + propietario+ "\n******************************************************");
			} else {
				texto = documento.actualizarDocumento("Propiedad # 1 [ Dirección: " + direccion + " ]\n" +
						"Tamaño: " + tamaño + "\n" +
						"N° de Habitaciones: " + habitaciones + " Propietario: " + propietario+ "\n******************************************************");
			}

			vista.getPanel_archivo().getArea_texto().setText(texto);
		} else if (comando.equals("BORRAR")) {
			vista.getPanel_archivo().getArea_texto().setText("");
		}

	}

}
