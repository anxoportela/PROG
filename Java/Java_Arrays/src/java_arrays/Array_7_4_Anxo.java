/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_arrays;

/**
 *
 * @author dual108
 */
public class Array_7_4_Anxo {
    public static void main(String[] args) {
        int[] arreglo = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;
        
        for(int contador = 0; contador<arreglo.length; contador++){
            total += arreglo[contador];
        }
        
        System.out.printf("Total de los elementos del arreglo: %d\n", total);
    }
}
