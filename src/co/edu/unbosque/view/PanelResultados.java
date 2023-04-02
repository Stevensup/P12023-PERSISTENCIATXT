package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.Color;

/**
 * This class represents a panel used for displaying results. It contains a JTextArea component
 * for displaying text.
 */
public class PanelResultados extends JPanel {

    /**
     * The JTextArea component used for displaying text.
     */
    private JTextArea area_texto;

    /**
     * Constructs a new PanelResultados object and initializes its components.
     */
    public PanelResultados() {
        setLayout(null);
        inicializarComponentes();
        setBorder(new TitledBorder("1. Archivo:"));
        setBackground(new Color(255, 225, 123));
    }

    /**
     * Initializes the components of the panel.
     */
    public void inicializarComponentes() {
        area_texto = new JTextArea();
        area_texto.setBounds(25, 50, 380, 320);
        JScrollPane panel = new JScrollPane(area_texto);
        panel.setBounds(25, 50, 480, 320);
        panel.setBackground(new Color(105, 145, 245));
        add(panel);
    }

    /**
     * Returns the JTextArea component used for displaying text.
     *
     * @return the JTextArea component used for displaying text.
     */
    public JTextArea getArea_texto() {
        return area_texto;
    }

    /**
     * Sets the JTextArea component used for displaying text.
     *
     * @param area_texto the new JTextArea component used for displaying text.
     */
    public void setArea_texto(JTextArea area_texto) {
        this.area_texto = area_texto;
    }
}
