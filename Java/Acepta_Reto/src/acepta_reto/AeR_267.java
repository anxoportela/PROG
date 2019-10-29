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

public class AeR_267 {

    public static void main(String[] args) {
        
        double ladoVertical,ladoHorizontal,ladoMax;
        double postesV,postesH,postesTotal;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        ladoVertical = entrada.nextInt();
        ladoHorizontal = entrada.nextInt();
        ladoMax = entrada.nextInt();
        
        while (ladoVertical != 0 && ladoHorizontal != 0 && ladoMax != 0){
            
            if (ladoVertical>ladoMax){
                postesV = Math.ceil(ladoVertical/ladoMax)*2;
            } else {
                postesV = 2;
            }
            
            if (ladoHorizontal>ladoMax){
                postesH = Math.ceil(ladoHorizontal/ladoMax)*2;
            } else {
                postesH = 2;
            }
            
            postesTotal = postesV+postesH;
            
            System.out.println((int)postesTotal);
            
            ladoVertical = entrada.nextInt();
            ladoHorizontal = entrada.nextInt();
            ladoMax = entrada.nextInt();
        }
        
    }
}
