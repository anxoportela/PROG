/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_16;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Mas_Strings_16 {

    public static void main(String[] args) {
        InputStream texto = Mas_Strings_16.class.getResourceAsStream("ejemplo.txt");
        Scanner entrada = new Scanner(texto);
        
        while (entrada.hasNext()) {
            System.out.println(entrada.nextLine());
        }
        entrada.close();
        
    }
    
}
