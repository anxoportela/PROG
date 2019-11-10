/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_reto;

/**
 *
 * @author anxo
 */

import java.util.Scanner;

public class AeR_116 {
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        int num;
        String s = "Hola Mundo.";
        
        num = entrada.nextInt();
        
        for (int i = 0; i<num; i++){
            System.out.println(s);
        }
    }
    
}
