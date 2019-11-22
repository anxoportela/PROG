/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_6;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */

import java.util.Scanner;

public class Mas_Strings_6 {

    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        String cadena = entrada.nextLine().toLowerCase();
        String patron = "[aeiou\\s]";
        int contador = 0;
        
        String cadenaConvertida = cadena.replaceAll(patron, "");
        
        for ( int i= 0; i < cadenaConvertida.length(); i++)
            contador++;
        
        System.out.println(contador);
    }
    
}
