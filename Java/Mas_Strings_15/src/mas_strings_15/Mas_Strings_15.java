/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_15;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */

public class Mas_Strings_15 {

    public static void main(String[] args) {
        int edadNumerica;
        JFrame box;
        box = new JFrame();
        String nombre = JOptionPane.showInputDialog(box, "Introduzca su nombre");
        String edad =  JOptionPane.showInputDialog(box, "Introduzca su edad");
        edadNumerica = Integer.parseInt(edad);
        JOptionPane.showMessageDialog(box, "El nombre introducido es: " + nombre +"\nLa edad introducida es: " + edadNumerica);
    }
}
