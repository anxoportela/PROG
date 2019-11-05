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

public class Bucles_Repaso_9 {
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        int contador1,contador2,NUM_MIN,NUM_MAX;
        boolean esPrimo;
        NUM_MIN = 2;
        NUM_MAX = 1000;
        
        for (contador1=NUM_MIN; contador1<=NUM_MAX; contador1++){
            esPrimo = true;
            for (contador2=2; contador2<contador1; contador2++){
                if (contador1%contador2==0){
                    esPrimo = false;
                }
            }
            if (esPrimo){
                System.out.println("El número " + contador1 + " es primo");
            }
        }
    }
}
