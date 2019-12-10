/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer_161;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */

public class AeR_161 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        int x = entrada.nextInt();
        int mitad,resultado;

        while (x != 0) {
            int vector[] = new int[x];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = entrada.nextInt();
            }
            mitad = vector.length/2;
            Arrays.sort(vector);
            
             if (esPar(x)){
                 resultado = vector[mitad]+vector[mitad-1];
             } else {
                 resultado = vector[mitad]*2;
             }

            System.out.println(resultado);
            x = entrada.nextInt();
        }
    }
    
    public static boolean esPar(int x){
        return x%2==0;
    }
}
