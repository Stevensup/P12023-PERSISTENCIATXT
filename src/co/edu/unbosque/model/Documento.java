package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.Archivo;

/**
 * Constructor por defecto de la clase Documento.
 * Inicializa el contenido del documento como una cadena vacía y crea un nuevo objeto Archivo.
 */


public class Documento {

	private String contenido;
	private Archivo archivo;

	/**
	 * Constructor por defecto de la clase Documento.
	 * Inicializa el contenido del documento como una cadena vacía y crea un nuevo objeto Archivo.
	 */

	public Documento() {
		contenido = "";
		archivo = new Archivo();
	}

	/**
	 * Constructor que recibe como parámetro un archivo para ser cargado como contenido del documento.
	 * Inicializa el contenido del documento como una cadena vacía y crea un nuevo objeto Archivo con el archivo recibido como parámetro.
	 * @param file El archivo que se desea cargar como contenido del documento.
	 */
	public Documento(File file) {
		contenido = "";
		archivo = new Archivo(file);
	}

	/**
	 * Lee el contenido del archivo y lo carga en la variable de instancia contenido.
	 * @return El contenido del documento como una cadena de texto.
	 */
	public String leerDocumento() {
		contenido = archivo.leerArchivo();
		return contenido;
	}

	/**
	 * Actualiza el contenido del documento con la cadena de texto recibida como parámetro.
	 * @param texto La cadena de texto que se desea actualizar como contenido del documento.
	 * @return El contenido del documento actualizado como una cadena de texto.
	 */
	public String actualizarDocumento(String texto) {
		return archivo.escribirArchivo(texto);
		
	}

	/**
	 * Retorna el contenido actual del documento.
	 * @return El contenido del documento como una cadena de texto.
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * Establece el contenido del documento con la cadena de texto recibida como parámetro.
	 * @param contenido La cadena de texto que se desea establecer como contenido del documento.
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * Retorna el número de propiedades del documento.
	 * @return El número de propiedades del documento como una cadena de texto.
	 */
	public String obtenerNumeroPropiedades() {
		return null;
	}

	
}
