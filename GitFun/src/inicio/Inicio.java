/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicio;

import controlador.PersonaControlador;
import vista.PersonaVista;

/**
 *
 * @author jhonm
 */
public class Inicio {
    public static void main(String[] args) {
        PersonaVista pv=new PersonaVista();
        PersonaControlador pc=new PersonaControlador(pv);
        pv.setVisible(true);
    }
}
