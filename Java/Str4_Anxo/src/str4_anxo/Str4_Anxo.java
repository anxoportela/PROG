/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str4_anxo;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */

import java.util.Scanner;

public class Str4_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);

        String cadena1, cadena2;
        int posicionInicial, posicionFinal;
        String cadenaFinal;
        System.out.print("Introduzca la cadena principal: ");
        cadena1 = entrada.nextLine();
        System.out.print("Introduzca la cadena a buscar: ");
        cadena2 = entrada.nextLine();
        cadenaFinal = "";
        
        posicionInicial = cadena1.indexOf(cadena2);
        posicionFinal = cadena1.indexOf(cadena2) + cadena2.length();
        
        cadenaFinal += cadena1.substring(0,posicionInicial);
        cadenaFinal += cadena2.toUpperCase();
        cadenaFinal += cadena1.substring(posicionFinal);
        
        System.out.println(cadenaFinal);    
    }
}
