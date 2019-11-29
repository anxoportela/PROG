/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OB_3_Anxo;

/**
 *
 * @author dual108
 */

import java.util.Random;

public class OB_3_Anxo {
    public static void main(String[] args) {
        Random numRandom = new Random();
        int[][] matriz = new int[10][5];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d ", numRandom.nextInt(32));
            }
            System.out.println("");
        }
        
    }
    
}
