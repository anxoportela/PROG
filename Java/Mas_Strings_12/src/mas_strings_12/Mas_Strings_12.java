/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_12;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */

import java.util.Scanner;

public class Mas_Strings_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in, "ISO-8859-1");
        
        System.out.print("Introduzca la frase para contar sus espacios: ");
        String frase = entrada.nextLine();
        
        System.out.println("La frase tiene " + numeroEspacios(frase) + " espacios");
        
    }
    
    public static int numeroEspacios(String x){
        int numEspacios = 0;
        
        for (int i=0; i<x.length(); i++){
            if (x.charAt(i) == ' '){
                numEspacios++;
            }
        }
        return numEspacios;
    }
    
}
