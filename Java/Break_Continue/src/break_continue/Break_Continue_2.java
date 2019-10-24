/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package break_continue;

/**
 *
 * @author dual108
 */

import java.util.Scanner;

public class Break_Continue_2 {
    
    public static void main(String[] args) {
        
        int num,i;
        boolean esPrimo;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        esPrimo = true;
        
        num = entrada.nextInt();
        
        for (i=2;i<num;i++){
            if (num%2==0){
                esPrimo=false;
                break;
            }
        }
        
        if (esPrimo){
            System.out.println("El número " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");
        }
    }
}
