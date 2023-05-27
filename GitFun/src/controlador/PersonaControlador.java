/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Persona;
import vista.PersonaVista;

/**
 *
 * @author jhonm
 */
public class PersonaControlador extends Persona implements ActionListener {

    private PersonaVista vista;

    public PersonaControlador(PersonaVista vista) {
        this.vista = vista;

        this.vista.btnGuardar.setActionCommand("guardar");
        this.vista.btnImprimir.setActionCommand("imprimir");

        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnImprimir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "guardar":
                guardar();
                break;
            case "imprimir":
                imprimir();
                break;
            default:
                throw new AssertionError();
        }
    }
    Persona p;

    private void guardar() {
//        setDocumento(Integer.parseInt(vista.txtDocumento.getText()));
//        setNombre(vista.txtNombre.getText());
//        setApellido(vista.txtApellido.getText());
        if (!vista.txtDocumento.getText().equals("")) {
            if (vista.txtEmail.getText().equals("")) {
                p = new Persona(Integer.parseInt(vista.txtDocumento.getText()), vista.txtNombre.getText(), vista.txtApellido.getText());
            } else {
                p = new Persona(Integer.parseInt(vista.txtDocumento.getText()), vista.txtNombre.getText(), vista.txtApellido.getText(), vista.txtEmail.getText());
            }

            JOptionPane.showMessageDialog(vista, "Los datos se guardaron");
            vista.txtDocumento.setText("");
            vista.txtNombre.setText("");
            vista.txtApellido.setText("");
            vista.txtEmail.setText("");
            
        } else {
            vista.lbDocumento.setForeground(Color.red);
        }

    }

    private void imprimir() {
        JOptionPane.showMessageDialog(vista, p.toString());
    }

}
