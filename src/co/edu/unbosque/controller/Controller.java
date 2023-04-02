package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Documento;
import co.edu.unbosque.model.Documento2;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.Archivo2;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

     private VentanaPrincipal vista;
     private Documento documento;
     private Documento2 documento2;
     private int numeroPropiedades = 0; // variable para llevar el contador de propiedades

      /**
      * Constructor de la clase Controller, inicializa la vista y los modelos a utilizar.
      */

     public Controller() {
          vista = new VentanaPrincipal();
          documento = new Documento();
          documento2 = new Documento2();
          asignarOyentes();
          
     }

     /**
      * Método encargado de asignar los listeners a los botones de la vista.
      */

     public void asignarOyentes() {
          vista.getPanel_botones().getBoton_borrar().addActionListener(this);
          vista.getPanel_botones().getBoton_escribir().addActionListener(this);
          vista.getPanel_botones().getBoton_ver().addActionListener(this);
     }


     /**
      * Método que maneja los eventos de los botones de la vista.
      * @param e Evento de botón
      */

      
     @Override
     public void actionPerformed(ActionEvent e) {

          String comando = e.getActionCommand();

          if (comando.equals("VER")) {
               String texto = documento.leerDocumento();
               String texto2 = documento2.leerDocumento2();
               vista.getPanel_archivo().getArea_texto().setText(texto);
               vista.getPanel_archivo2().getArea_texto().setText(texto2);
          } else if (comando.equals("ESCRIBIR")) {
               String texto = "";
               String texto2 = "";
               String direccion = vista.getPanel_botones().getDireccion().getText();
               String tamaño = vista.getPanel_botones().getTamaño().getText();
               String habitaciones = (String) vista.getPanel_botones().getNhabitaciones().getSelectedItem();
               String propietario = vista.getPanel_botones().getPropietario().getText();
               String inquilino = vista.getPanel_botones2().getInquilino().getText();
               String documentoId = vista.getPanel_botones2().getDocumento_Id().getText();
               String cuotaMensual = vista.getPanel_botones2().getCuotaMensual().getText();
               String fechadePago = vista.getPanel_botones2().getFechadePago().getText();
               if (documento.getContenido() != null) {
                    texto = documento.actualizarDocumento(documento.getContenido() + "\n" +
                              "Propiedad # " + (++numeroPropiedades) + // Incrementamos la variable de contador
                              " [ Dirección: " + (direccion != null ? direccion : "") + " ]\n" +
                              "Tamaño: " + (tamaño != null ? tamaño : "") + "m²" + "\n" +
                              "N° de Habitaciones: " + (habitaciones != null ? habitaciones : "") +
                              " Propietario: " + (propietario != null ? propietario : "") +
                              "\n******************************************************");

                    texto2 = documento2.actualizarDocumento2(texto2 + "\n" +
                              "Inquilino "+ inquilino + (documento2.obtenerNumeroInquilinos() + 1) +
                              " [ Documento de Identificación: " + (documentoId != null ? documentoId : "") + "\n"
                              + " ]" + " - [Asignación: Propiedad # " + numeroPropiedades +
                              "] \nCuota Mensual: $ " + (cuotaMensual != null ? cuotaMensual : "")
                              + " COP / Fecha de Pago: " + (fechadePago != null ? fechadePago : "")+
                              "\n******************************************************");
               } else {
                    texto = documento.actualizarDocumento("Propiedad # 1 [ Dirección: " +
                              (direccion != null ? direccion : "") + " ]\n" +
                              "Tamaño: " + (tamaño != null ? tamaño : "") + "\n" +
                              "N° de Habitaciones: " + (habitaciones != null ? habitaciones : "") +
                              " Propietario: " + (propietario != null ? propietario : "") +
                              "\n******************************************************");
               }

               vista.getPanel_archivo().getArea_texto().setText(texto);
               vista.getPanel_archivo2().getArea_texto().setText(texto2);
          } else if (comando.equals("BORRAR")) {
               vista.getPanel_archivo().getArea_texto().setText("");
               vista.getPanel_archivo2().getArea_texto().setText("");
          }

     }

}
