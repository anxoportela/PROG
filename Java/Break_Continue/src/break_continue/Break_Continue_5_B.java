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
public class Break_Continue_5_B {
    
    public static void main(String[] args) {
        int i;
        
        for (i=100;i<=130;i++){
            if (i==116 || i%2!=0){continue;}
            System.out.println(i);
        }
    }
}
