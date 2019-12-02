/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex2_anxo;

import java.util.Scanner;

/**
 *
 * @author anxo
 */
public class Regex2_Anxo {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        String patronTrim = "^\\s|\\s$";
        String patronInter = "\\s{2,}";
        
        System.out.print("Introduzca el texto a limpiar: ");
        String texto = entrada.nextLine();
        System.out.print("Salida texto limpio: ");
        System.out.println(texto.replaceAll(patronInter, " ").replaceAll(patronTrim, ""));  
        
    }
    
}
