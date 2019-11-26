/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_17;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */

import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections; 

public class Mas_Strings_17 {

    public static void main(String[] args) {
        
        String frase;
        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        System.out.print("Introduzca una cadena de texto: ");
        frase = entrada.nextLine();
        
        String[] vector = frase.split(" ", 0);
        String[] vectorCambio = Arrays.copyOf(vector, vector.length);
        
        System.out.print("El número de palabras es: " + vector.length + "\n");
        System.out.print("La primera palabra es: " + vector[0] + "\n");
        System.out.print("La última palabras es: " + vector[vector.length - 1] + "\n");
        
        Arrays.sort(vectorCambio);
        System.out.println("El array ordenado de la A-Z es: " + Arrays.toString(vectorCambio));
        
        Arrays.sort(vectorCambio, Collections.reverseOrder());
        System.out.println("El array ordenado de la Z-A es: " + Arrays.toString(vectorCambio));
   
    }
    
}
