/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author dual108
 */
public class Strings {
    
    public static void main(String[] args) {
        
        String cadena = "Esto es una prueba";
        System.out.println(cadena);
        System.out.println(cadena.length());
        System.out.println(cadena.charAt(2));
        System.out.println(cadena.indexOf("una"));
        System.out.println(cadena.lastIndexOf("una"));
        System.out.println(cadena.substring(8));
        System.out.println(cadena.substring(8,11));
        
    }
}
