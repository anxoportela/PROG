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

public class Bucles_Repaso_4 {
    public static void main(String[] args) {
        
        int num,contador;
        contador = 0;
        num=1;
        while (contador<10){
            if (num%2==0 || num%3==0){
                num+=1;
            } else {
                System.out.println(num);
                contador+=1;
                num+=1;
            }
        }
    }    
}
