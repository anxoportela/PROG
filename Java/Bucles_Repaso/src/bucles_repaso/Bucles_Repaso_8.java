/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles_repaso;

/**
 *
 * @author anxo
 */

import java.util.Scanner;

public class Bucles_Repaso_8 {
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        int num,contador;
        boolean esPrimo;
        
        num = entrada.nextInt();
        
        esPrimo = true;
        
        for (contador=2; contador<num; contador++){
            if (num%contador==0){
                esPrimo = false;
            }
        }
        
        if (esPrimo){
            System.out.println("El número " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");
        }
    }
    
}
