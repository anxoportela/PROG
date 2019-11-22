/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mas_strings_5;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 *
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Mas_Strings_5_v2 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String frase,caracter;
       System.out.print("Introduce una frase: ");
       frase = entrada.nextLine();
       System.out.print("Introduzca el caracter a buscar: ");
       caracter = entrada.next();
       StringTokenizer st = new StringTokenizer(frase,caracter);
       System.out.println("Número de palabras: " + (st.countTokens()-1));
    }    
}
