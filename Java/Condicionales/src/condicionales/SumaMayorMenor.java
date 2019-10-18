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
public class SumaMayorMenor {
    
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner( System.in );
        
        int num1,num2,num3,num4;
        int mayor;
        int menor;
        int suma;
        
        System.out.print("Introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        System.out.print("Introduzca el cuarto numero: ");
        num4 = entrada.nextInt();
        
        if ( num1>num2 && num1>num3 && num1>num4) {
            mayor = num1;
        }
        else if ( num2>num3 && num2>num4 ) {
            mayor = num2;
        }
        else if ( num3>num4) {
            mayor = num3;
        }
        else {
            mayor = num4;
        }
        
        if ( num1<num2 && num1<num3 && num1<num4) {
            menor = num1;
        }
        else if ( num2<num3 && num2<num4 ) {
            menor = num2;
        }
        else if ( num3<num4) {
            menor = num3;
        }
        else {
            menor = num4;
        }
        
        suma = mayor+menor;
        
        System.out.println( "El resultado de la suma del mayor y menor es " + suma);
        
    }
    
}
