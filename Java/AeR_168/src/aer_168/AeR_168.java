/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer_168;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */

public class AeR_168 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        int x = entrada.nextInt();
      

        while (x != 0) {
            int vector[] = new int[x-1];
            int numFalta= 1;
            for (int i = 0; i < vector.length; i++) {
                vector[i] = entrada.nextInt();
            }
            Arrays.sort(vector);
            
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == numFalta){
                    numFalta++;
                } else {
                    break;
                }
            }
            System.out.println(numFalta);
            x = entrada.nextInt();
        }
    }
}