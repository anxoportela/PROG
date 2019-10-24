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

import java.util.Scanner;

public class Break_Continue_3 {
    public static void main(String[] args) {
        
        int num;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        num = entrada.nextInt();
        if (num!=0){
             do {
                if (num<0) {
                   continue;
                }
                   System.out.println(num);
                   num = entrada.nextInt();
            } while (true);
        }
    }
}