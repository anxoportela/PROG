/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpaneejemplo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class joptionpaneejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        // JOptionPane.showMessageDialog(null, "Hola", "Título Ventana", 0, null);

        final ImageIcon icono = new ImageIcon(joptionpaneejemplo.class.getResource("apoyar.png"));
        final String[] s = { "rojo", "verde" };
        final String nombre = (String) JOptionPane.showInputDialog(null, "Indica un nombre", "Peticion de datos", 1,
                icono, s, s[0]);
        
        System.out.println(nombre);
        
    }
    
}
