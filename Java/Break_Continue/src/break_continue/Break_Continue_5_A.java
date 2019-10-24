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
public class Break_Continue_5_A {

    public static void main(String[] args) {
        int i;
        
        for (i=100;i<=130;i+=2){
            if (i==116){continue;}
            System.out.println(i);
        }
    }
}
