/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

/**
 *
 * @author anxo
 */
public class Primeros40Multi3 {
    
    public static void main(String[] args) {
        
        int i;
        boolean multi;
                
        for (i=3;i<=40;i++){
            multi = false;
            if(i%3==0){
                multi = true;
            }
            if (multi) {
                System.out.println("El número " + i + " es múltiplo de 3");
            }
        }
    }
}