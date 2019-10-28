/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles_repaso;

/**
 *
 * @author dual108
 */

import java.util.Scanner;

public class Bucles_Repaso_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int factorial,contador;
        
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        factorial = entrada.nextInt();
        
        for (contador = factorial; contador>1; contador--){
            
            factorial *= contador;
            
        }
        
        System.out.println(factorial);
        
        
        
    }
    
}
