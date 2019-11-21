/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_arrays_9_anxo;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Mas_Arrays_9_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random r = new Random();
        int [] array = new int[10];
        
        for (int i=0; i<array.length;i++){
            array[i] = r.nextInt(51)+1;
        }
        
        for (int x : array){
            System.out.print(x + " ");
        }
        System.out.println("");
        
        Arrays.sort(array);
        for (int x : array){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    
}
