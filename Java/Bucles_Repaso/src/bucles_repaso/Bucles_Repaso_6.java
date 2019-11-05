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

public class Bucles_Repaso_6 {
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        int num1,num2,aux,resto;
        
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        if (num2>num1){
            aux = num2;
            num2 = num1;
            num1 = aux;
        }
        
        do {
            resto = num1%num2;
            num1 = num2;
            num2 = resto;
        } while (num1%num2!=0);
        
        System.out.println(resto);
    }
    
}
