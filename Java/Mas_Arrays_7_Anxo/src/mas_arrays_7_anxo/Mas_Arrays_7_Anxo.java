/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_arrays_7_anxo;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */

import java.util.Arrays;

public class Mas_Arrays_7_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] numeros = new int[10];
        
        Arrays.fill(numeros,3);
        int [] numerosCopia = Arrays.copyOfRange(numeros, 1, 9);
        
        for (int x : numeros){
            System.out.print(numeros[x] + " ");
        }
        System.out.println("");
                for (int x : numerosCopia){
            System.out.print(numerosCopia[x] + " ");
        }
        System.out.println("");
        
        
    }
    
}
