/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_4;

import java.util.Scanner;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Mas_Strings_4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        int pos;
        
        System.out.print("Introduce texto: ");
        texto = sc.nextLine().trim();
        pos = texto.lastIndexOf(" ");
        
        System.out.println(texto.substring(0, pos));
        
    }
    
}
