package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.Archivo2;

/**
 * Constructor que recibe como parámetro un archivo para ser cargado como contenido del documento.
 * Inicializa el contenido del documento como una cadena vacía y crea un nuevo objeto Archivo con el archivo recibido como parámetro.
 * @param file El archivo que se desea cargar como contenido del documento.
 */
public class Documento2 {

	private String contenido2;
	private Archivo2 archivo2;

	/**
	 * Constructor por defecto de la clase Documento2.
	 * Inicializa el contenido del documento como una cadena vacía y crea un nuevo archivo.
	 */

	public Documento2() {
		contenido2 = "";
		archivo2 = new Archivo2();
	}

	/**
	 * Constructor que recibe un archivo como parámetro.
	 * Inicializa el contenido del documento como una cadena vacía y crea un archivo con la ruta proporcionada.
	 * @param file El archivo que se utilizará como fuente o destino del contenido del documento.
	 */

	public Documento2(File file) {
		contenido2 = "";
		archivo2 = new Archivo2(file);
	}

	/**
	 * Lee el contenido del archivo asociado y lo guarda en la propiedad contenido2.
	 * @return El contenido del archivo como una cadena de caracteres.
	 */
	public String leerDocumento2() {
		contenido2 = archivo2.leerArchivo2();
		return contenido2;
	}

	/**
	 * Actualiza el contenido del archivo asociado con el texto proporcionado.
	 * @param texto El nuevo contenido que se guardará en el archivo.
	 * @return La cadena de caracteres escrita en el archivo.
	 */
	public String actualizarDocumento2(String texto) {
		return archivo2.escribirArchivo2(texto);

	}

	/**
	 * Retorna el contenido actual del documento.
	 * @return La cadena de caracteres que representa el contenido del documento.
	 */
	public String getContenido2() {
		return contenido2;
	}

	/**
	 * Establece el contenido del documento con la cadena de caracteres proporcionada.
	 * @param contenido2 La cadena de caracteres que se establecerá como el nuevo contenido del documento.
	 */
	public void setContenido2(String contenido2) {
		this.contenido2 = contenido2;
	}

	/**
	 * Método no implementado que debería retornar el número de inquilinos de una propiedad.
	 * @return La cantidad de inquilinos de una propiedad.
	 */
	public String obtenerNumeroInquilinos() {
		return null;
	}

}
