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

public class AeR_373 {
    
    public static void main(String[] args) {
        long lado,cubos;
        int casos,contador;
           
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        casos = entrada.nextInt();
        
        for (contador=1;contador<=casos;contador++){
            lado = entrada.nextInt();
                cubos = (long) (Math.pow(lado,3)-((lado-2)*(lado-2)*(lado-2)));
                System.out.println(cubos);
        }
    }
}
