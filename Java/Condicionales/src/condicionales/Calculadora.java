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

public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        String operacion;
        double num1,num2;
        double resultado;
        resultado=0;
        boolean fallo=false;
                
        System.out.print("Introduzca el primer número: ");
        num1 = entrada.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = entrada.nextInt();
        System.out.print("Introduzca la operación a realizar (+,-,*,/): ");
        operacion = entrada.next();
        
        switch (operacion) {
            case "+":
                resultado = num1+num2;
                break;
            case "-":
                resultado = num1-num2;
                break;
            case "*":
                resultado = num1*num2;
                break;
            case "/":
                if (num2==0){
                    System.out.println("La operación no se puede realizar");
                    fallo=true;
                } else {
                    resultado = num1/num2;
                }
                break;
            default:
                System.out.println("La operación no es correcta");
                fallo=true;
                break;
        }   
        
        if (fallo!=true){
        System.out.printf("El resultado de la operación es: %,.2f\n", resultado);
        }
    }
}
