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

public class Bucles_Repaso_11 {
  
    public static void main(String[] args) {
        
        int n,contador1,contador2;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        n = entrada.nextInt();
        
        while (n<3 || n>15 || n%2==0){
            System.out.println("El número debe ser impar y estar entre el rango de 3 y 15");
            n = entrada.nextInt();
        }
        
        for (contador1=1;contador1<=n;contador1+=2){
            for (contador2=1;contador2<=n-contador1;contador2+=2){
                System.out.print(" ");
            }
            for (contador2=1; contador2<=contador1;contador2++){
                if (contador2==1 || contador2==contador1){
                System.out.print("*");
                } else {
                System.out.print("");    
                }
            }
            System.out.println("");
        }
        
        for (contador1=(n-2);contador1>=1;contador1-=2){
            for (contador2=(n-contador1);contador2>=1;contador2-=2){
                System.out.print(" ");
            }
            for (contador2=contador1; contador2>=1;contador2--){
                if (contador2==contador1 || contador2==1){
                  System.out.print("*");  
                } else {
                  System.out.print("-");  
                }
            }
            System.out.println("");
        }       
        
    }
}
