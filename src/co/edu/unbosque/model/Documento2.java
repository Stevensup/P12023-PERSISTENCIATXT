package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.Archivo2;

public class Documento2 {

	private String contenido2;
	private Archivo2 archivo2;

	public Documento2() {
		contenido2 = "";
		archivo2 = new Archivo2();
	}

	public Documento2(File file) {
		contenido2 = "";
		archivo2 = new Archivo2(file);
	}

	public String leerDocumento2() {
		contenido2 = archivo2.leerArchivo2();
		return contenido2;
	}

	public String actualizarDocumento2(String texto) {
		return archivo2.escribirArchivo2(texto);

	}

	public String getContenido2() {
		return contenido2;
	}

	public void setContenido2(String contenido2) {
		this.contenido2 = contenido2;
	}

	public String obtenerNumeroInquilinos() {
		return null;
	}

}
