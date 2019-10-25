/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_reto;

/**
 *
 * @author dual108
 */

import java.util.Scanner;

public class AeR_217 {
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        num = entrada.nextInt();
        
        if (num>0){
            do {
                if (num%2==0){
                    System.out.println("DERECHA");
                } else {
                    System.out.println("IZQUIERDA");
                }
                num = entrada.nextInt();
            } while (num!=0);
        }
    }  
}
