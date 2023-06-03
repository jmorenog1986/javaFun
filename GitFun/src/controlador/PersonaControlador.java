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

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    private void capturaDatos(){
    
        setDocumento(Integer.parseInt(vista.txtDocumento.getText()));
        setNombre(vista.txtNombre.getText());
        setApellido(vista.txtApellido.getText());
        setEmail(vista.txtEmail.getText());
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        capturaDatos();
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
   

    private void guardar() {

        String sql = "INSERT INTO personas VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, getDocumento());
            ps.setString(2, getNombre());
            ps.setString(3, getApellido());
            ps.setString(4, getEmail());
            ps.execute();
            JOptionPane.showMessageDialog(vista, "Se guardaron los datos.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(vista,ex);
        }
        
    }

    private void imprimir() {
    }

}
