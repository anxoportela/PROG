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
public class NumCentral {
    
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner( System.in );
        
        int num1,num2,num3;
        int central = 0;
        
        System.out.print("Introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        
        if ( num1==num2 || num1==num3 || num2==num3 ) {
            System.out.println("Los numeros deben ser distintos");
        } else {
            if (num1>num2 && num1>num3) {
                if (num2>num3) {
                    central = num2;
                } else {
                    central = num3;
                }
            } else if (num2>num1 && num2>num3){
                if (num1>num3){
                    central = num1;
                } else {
                    central = num3;
                }
            } else if (num3>num1 && num3>num2){
                if (num1>num2) {
                    central = num1;
                } else {
                    central = num2;
                }
            }
            System.out.println( "El número central es " + central );
        }
    }
    
}
