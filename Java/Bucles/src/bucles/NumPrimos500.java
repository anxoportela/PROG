/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

/**
 *
 * @author anxo
 */
public class NumPrimos500 {
    
    public static void main(String[] args) {
        
        int i,j;
        boolean esPrimo;
        
        for (i = 1; i <= 500; i++) {
            esPrimo = true;
            for (j = 2; j < i; j++) {
                if(i%j == 0) {
                    esPrimo = false;
                }
            }
            if(esPrimo) {
                System.out.println("El número " + i + " es primo");
            }
        }
    }
}
