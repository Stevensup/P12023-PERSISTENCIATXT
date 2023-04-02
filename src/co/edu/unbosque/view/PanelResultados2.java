// Importaciones de paquetes y clases necesarias para la clase PanelResultados2
package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.Color;

// Declaración de la clase PanelResultados2, que extiende de la clase JPanel
public class PanelResultados2 extends JPanel {

	// Declaración del atributo de la clase, un objeto de JTextArea
	private JTextArea area_texto;

	// Constructor de la clase
	public PanelResultados2() {
		// Se establece un layout nulo para la clase
		setLayout(null);
		// Se inicializan los componentes de la clase
		inicializarComponentes();
		// Se establece un borde con título para la clase
		setBorder(new TitledBorder("2. Archivo:"));
		// Se establece un color de fondo para la clase
		setBackground(new Color(255, 255, 200));
	}

	// Método que inicializa los componentes de la clase
	public void inicializarComponentes() {
		// Se crea un objeto de JTextArea y se establece su tamaño y posición en la
		// pantalla
		area_texto = new JTextArea();
		area_texto.setBounds(25, 50, 380, 320);
		// Se crea un objeto de JScrollPane que contiene el objeto JTextArea anterior
		JScrollPane panel = new JScrollPane(area_texto);
		// Se establece el tamaño y posición del objeto JScrollPane en la pantalla
		panel.setBounds(25, 50, 480, 320);
		// Se establece un color de fondo para el objeto JScrollPane
		panel.setBackground(new Color(105, 145, 245));
		// Se agrega el objeto JScrollPane a la clase
		add(panel);
	}

	// Método que retorna el objeto JTextArea de la clase
	public JTextArea getArea_texto() {
		return area_texto;
	}

	// Método que establece el objeto JTextArea de la clase
	public void setArea_texto(JTextArea area_texto) {
		this.area_texto = area_texto;
	}
}
