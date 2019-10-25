/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author dual108
 */


public class FuncionMayor {
    
    public static void main(String[] args) {
        
        int i = mayor(4,5);
        System.out.println(i);
    }
    
    static int mayor(int x,int y){
        if (x >= y) {
            return x;
        } else {
            return y;
        }   
    }
    
}
