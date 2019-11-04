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

public class Bucles_Repaso_5 {
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        int num,NUM_MAX;
        String opcion;
        NUM_MAX=100;
        
        opcion = entrada.next().toLowerCase();
                
        switch (opcion){
            case "a":
                for (num = 11; num<=NUM_MAX; num++){
                    if (num%11==0){
                        System.out.println(num);
                    }
                }
                break;
            case "b":
                for (num = 17; num<=NUM_MAX; num++){
                    if (num%17==0){
                        System.out.println(num);
                    }
                }
                break;
            case "c":
                for (num = 23; num<=NUM_MAX; num++){
                    if (num%23==0){
                        System.out.println(num);
                    }
                }
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
    
}
