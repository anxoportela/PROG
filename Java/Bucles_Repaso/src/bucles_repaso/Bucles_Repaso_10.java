/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles_repaso;

/**
 *
 * @author dual108
 */

import java.util.Scanner;

public class Bucles_Repaso_10 {
    
    public static void main(String[] args) {
        
        int contador1,contador2,divisor;
        float acumulador,aux;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        divisor = entrada.nextInt();
        acumulador=0;
        
        
        for (contador1 = 1; contador1<=(divisor+1); contador1++){
            aux = 1;
                for (contador2=1; contador2<contador1; contador2++){
                   aux *= contador2;
                }
                acumulador += (float)(1/aux);
                System.out.printf("%.6f\n",acumulador);
        }
        
    }
}
