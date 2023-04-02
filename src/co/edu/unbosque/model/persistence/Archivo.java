package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Archivo {

	private File file;

	/**
	 * Constructor sin parámetros de la clase Archivo, crea un objeto Archivo con el archivo por defecto "datos\\registro.txt".
	 */

	public Archivo() {
		file = new File("datos\\registro.txt");
	}

	/**
	 * Constructor de la clase Archivo que recibe como parámetro un objeto de tipo File.
	 * @param file Objeto File que representa el archivo a manipular.
	 */

	public Archivo(File file) {
		this.file = file;
	}

	/**
	 * Método que permite leer el contenido del archivo.
	 * @return Una cadena de caracteres que representa el contenido del archivo.
	 */

	public String leerArchivo() {
		String rta = "";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader linea = null;
		String contenido = "";
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			linea = new BufferedReader(isr);
	
			if (file.exists()) {
				String linea_leida = linea.readLine();
				contenido = linea_leida;
				while (linea_leida != null) {
					linea_leida = linea.readLine();
					if (linea_leida != null) {
						contenido += "\n" + linea_leida;
					}
				}
				rta = contenido;
			} else {
				rta = "El archivo no existe";
			}
		} catch (Exception e) {
			rta = "El archivo no pudo ser leido";
		} finally {
			try {
				if (linea != null) linea.close();
				if (isr != null) isr.close();
				if (fis != null) fis.close();
			} catch (Exception e) {
				rta = "No se pudo cerrar el archivo correctamente";
			}
		}
	
		return rta;
	}

	/**
	 * Método que permite escribir en el archivo.
	 * @param texto Cadena de caracteres que se desea escribir en el archivo.
	 * @return Una cadena de caracteres que indica si el registro en el archivo fue exitoso o no.
	 */
	
	public String escribirArchivo(String texto) {
		String rta = "";
		try {
			FileWriter lineatxt = new FileWriter(file);
			String linea_archivo = texto;
			lineatxt.write(linea_archivo + "\r\n");
			lineatxt.close();
			rta = "Vivienda Ingresada con Exito";
		} catch (Exception e) {
			rta = "No fue posible registrar la informacion en el archivo";
		}
		return rta;
	}

}
