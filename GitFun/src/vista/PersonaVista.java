/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author jhonm
 */
public class PersonaVista extends JFrame {

    public JLabel lbDocumento;
    private JLabel lbNombre;
    private JLabel lbApellido;
    private JLabel lbEmail;

    public JTextField txtDocumento;
    public JTextField txtNombre;
    public JTextField txtApellido;
    public JTextField txtEmail;

    public JButton btnGuardar;
    public JButton btnImprimir;

    public PersonaVista() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(0, 0, 200, 200);
        setLayout(new GridLayout(6, 2));
        iniElementos();
        cargarElementos();
    }

    private void cargarElementos() {
        add(lbDocumento);
        add(txtDocumento);
        
        add(lbNombre);
        add(txtNombre);
        
        add(lbApellido);
        add(txtApellido);
        
        add(lbEmail);
        add(txtEmail);
        
        add(btnImprimir);
        add(btnGuardar);
    }

    private void iniElementos() {
        lbDocumento = new JLabel("Documento:");
        lbNombre = new JLabel("Nombre:");
        lbApellido = new JLabel("Apellido:");
        lbEmail = new JLabel("Email:");

        txtDocumento = new JTextField();
        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtEmail = new JTextField();

        btnGuardar = new JButton("Guadar");
        btnImprimir = new JButton("Imprimir");
    }

}
