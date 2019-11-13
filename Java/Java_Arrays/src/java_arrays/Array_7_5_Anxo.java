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
import java.util.Random;

public class Array_7_5_Anxo {
    public static void main(String[] args) {
        Random numerosAleatorios = new Random();
        int[] frecuencia = new int[7];
        
        for(int tiro = 1; tiro <= 600000; tiro++)
            ++frecuencia[ 1 + numerosAleatorios.nextInt(6)];
        
        System.out.printf("%s%12s\n", "Cara", "Frecuencia");
        
        for(int cara=1; cara<frecuencia.length; cara++)
            System.out.printf("%4d%12d\n", cara, frecuencia[cara]);
        
    }
    
}
