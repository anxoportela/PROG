/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author dual108
 */
public class SumaIgual {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        int num1,num2,num3;
        
        System.out.print("Introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        
        if ((num1+num2==num3) || (num1+num3==num2) || (num2+num3==num1)) {
            System.out.println("Iguales");
        } else {
            System.out.println("Distintos");
        } 
    }
}
