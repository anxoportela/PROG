/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author dual108
 */

import java.util.Scanner;

public class MayorNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        int num1,num2,num3;
        int mayor = 0;
        
        System.out.print("Introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        
        if ( num1>num2 && num1>num3 ) {
            mayor = num1;
        }
        if ( num2>num1 && num2>num3 ) {
            mayor = num2;
        }
        if ( num3>num1 && num3>num2 ) {
            mayor = num3;
        }
        
        System.out.println( "El mayor valor es " + mayor );
        
    }
    
}
