/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_5;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */

import java.util.Scanner;

public class Mas_Strings_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        String texto, caracter;
        int contador = 0;
        
        System.out.print("Introduzca la frase: ");
        texto = entrada.nextLine();
        System.out.print("Introduzca el caracter a buscar: ");
        caracter = entrada.next();
        
        for (int i = 0; i<texto.length(); i++){
            if (texto.charAt(i) == caracter.charAt(0)){
                contador++;
            }
        }
        System.out.println("El caracter " + caracter + " aparece " + contador + " vez(es)");
        
    }
    
}
