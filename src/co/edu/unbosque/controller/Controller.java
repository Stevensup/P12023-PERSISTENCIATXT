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

     public Controller() {
          vista = new VentanaPrincipal();
          documento = new Documento();
          documento2 = new Documento2();
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
               String texto2 = documento2.leerDocumento2();
               vista.getPanel_archivo().getArea_texto().setText(texto);
               vista.getPanel_archivo2().getArea_texto().setText(texto2);
          } else if (comando.equals("ESCRIBIR")) {
               String texto = "";
               String texto2 = "";
               String direccion = vista.getPanel_botones().getDireccion().getText();
               String tamaño = vista.getPanel_botones().getTamaño().getText();
               String habitaciones = vista.getPanel_botones().getNhabitaciones().getText();
               String propietario = vista.getPanel_botones().getPropietario().getText();
               String inquilino = vista.getPanel_botones2().getInquilino().getText();
               String documentoId = vista.getPanel_botones2().getDocumento_Id().getText();
               String asignacion = vista.getPanel_botones2().getAsignacion().getText();
               String nombre = vista.getPanel_botones2().getNombre().getText();
               String cuotaMensual = vista.getPanel_botones2().getCuotaMensual().getText();
               String fechadePago = vista.getPanel_botones2().getFechadePago().getText();
               if (documento.getContenido() != null) {
                    texto = documento.actualizarDocumento(documento.getContenido() + "\n" +
                              "Propiedad # " + (documento.obtenerNumeroPropiedades() + 1) + " [ Dirección: " + direccion
                              + " ]\n" +
                              "Tamaño: " + tamaño + "\n" +
                              "N° de Habitaciones: " + habitaciones + " Propietario: " + propietario
                              + "\n******************************************************");

                    texto2 = documento2.actualizarDocumento2(documento2.getContenido2() + "\n" +
                              "Inquilino # " + (documento2.obtenerNumeroInquilinos() + 1)
                              + " [ Documento de Identificación: " + documentoId
                              + " ] - [Asignación: Propiedad # " + (documento.obtenerNumeroPropiedades()) + "] Nombre: "
                              + nombre
                              + "\nCuota Mensual: $ " + cuotaMensual + " COP / ++++++++++++++++" +
                              "\nFechas de Pago: " + fechadePago);
               } else {
                    texto = documento.actualizarDocumento("Propiedad # 1 [ Dirección: " + direccion + " ]\n" +
                              "Tamaño: " + tamaño + "\n" +
                              "N° de Habitaciones: " + habitaciones + " Propietario: " + propietario
                              + "\n******************************************************");
               }

               vista.getPanel_archivo().getArea_texto().setText(texto);
               vista.getPanel_archivo2().getArea_texto().setText(texto2);
          } else if (comando.equals("BORRAR")) {
               vista.getPanel_archivo().getArea_texto().setText("");
               vista.getPanel_archivo2().getArea_texto().setText("");
          }

     }

}
