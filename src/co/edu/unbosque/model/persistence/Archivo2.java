package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Archivo2 {

	private File file;

	/**
	 * Constructs an instance of the Archivo2 class and initializes the file attribute with a default file location.
	 */

	public Archivo2() {
		file = new File("datos\\registro2.txt");
	}

	/**
	 * Constructs an instance of the Archivo2 class and initializes the file attribute with a given file location.
	 * @param file The file to be used for reading and writing text information.
	 */

	public Archivo2(File file) {
		this.file = file;
	}

	/**
	 * Reads the text information stored in the file and returns it as a string.
	 * @return A string with the text information stored in the file, or an error message if the file could not be read.
	 */

	public String leerArchivo2() {
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
	 * Writes the given text information to the file.
	 * @param texto The text information to be written to the file.
	 * @return A message indicating whether the information was successfully written to the file or not.
	 */
	
	public String escribirArchivo2(String texto) {
		String rta = "";
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(texto + "\r\n");
			fw.close();
			rta = "Arrendatario Ingresado con Exito";
		} catch (Exception e) {
			rta = "No fue posible registrar la informacion en el archivo";
		}
		return rta;
	}

}
