/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Str2_Anxo;

import java.util.Scanner;

/**
 *
 * @author dual108
 */
public class Str2_Anxo {
    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);
        String cadena,cadenaCompleta;
        System.out.print("Introduzca una cadena de carácteres: ");
        cadena = entrada.next();
        cadenaCompleta = cadena;
        
        for (int i = cadena.length() - 2; i >= 0; i--) {
            cadenaCompleta += cadena.charAt(i);
        }

        System.out.println(cadenaCompleta);

    }
}
