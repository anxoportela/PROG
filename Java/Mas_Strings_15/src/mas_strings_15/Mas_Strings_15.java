/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_15;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Mas_Strings_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Hola", "Título Ventana", 0, null);
        
        ImageIcon icono = new ImageIcon(Mas_Strings_15.class.getResource("apoyar.png"));
        String [] s = { "rojo", "verde" };
        String nombre = (String) JOptionPane.showInputDialog(null, "Indica un nombre", "Peticion de datos", 1, icono, s, s[0]);
        
        System.out.println(nombre);
        
    }
    
}
