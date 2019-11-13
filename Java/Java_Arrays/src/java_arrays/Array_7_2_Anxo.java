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
public class Array_7_2_Anxo {
    public static void main(String[] args) {
        
        int[] arreglo = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        
        System.out.printf("%s%8s\n", "Indice", "Valor");
        
        for(int contador = 0; contador<arreglo.length; contador++){
            System.out.printf("%5d%8d\n", contador, arreglo[ contador ]);
            
        }
    }
    
}
