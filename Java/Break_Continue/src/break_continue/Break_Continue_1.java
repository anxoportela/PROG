/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package break_continue;

/**
 *
 * @author dual108
 */

public class Break_Continue_1 {

    public static void main(String[] args) {
        
        int num,acumulador,suma;
        suma = 0;
        acumulador = 100;
        
        for (num=1;num<=acumulador;num++){
            if (num==3 || num==5 || num==6){
                continue;
            }
            suma+=num;
            if (suma>150){break;}
        }
        
        System.out.println(suma);
        
    }
    
}
