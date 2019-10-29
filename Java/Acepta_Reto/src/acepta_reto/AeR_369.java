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

public class AeR_369 {
    
    public static void main(String[] args) {
        
        int num,contador;
        String salida;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        num = entrada.nextInt();
        
        while (num>0 && num<=1000){
            salida = "";
            for (contador=0;contador<num;contador++){
                salida += "1";
            }
            System.out.println(salida);
            num = entrada.nextInt();
        }
        
    }
    
}
