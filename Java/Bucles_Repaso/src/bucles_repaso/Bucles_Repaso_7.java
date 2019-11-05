/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles_repaso;

/**
 *
 * @author anxo
 */

import java.util.Scanner;

public class Bucles_Repaso_7 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        int num1,num2,num1aux,num2aux,aux,resto,multi,mcm;
        
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        if (num2>num1){
            aux = num2;
            num2 = num1;
            num1 = aux;
        }
        num1aux = num1;
        num2aux = num2;
        
        do {
            resto = num1%num2;
            num1 = num2;
            num2 = resto;
        } while (num1%num2!=0);
        
        multi = num1aux*num2aux;
        
        mcm = (int) (multi/resto);
        
        System.out.println(mcm);
        
    }
    
}
