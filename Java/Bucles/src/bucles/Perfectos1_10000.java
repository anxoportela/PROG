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
public class Perfectos1_10000 {
    public static void main(String[] args) {
        
        int suma,NUM_MAX;
        NUM_MAX=10000;
        
        for(int i=1;i<=NUM_MAX;i++){
            suma=0;
            for(int j=1;j<i;j++){
                 if(i%j==0){
                    suma += j;
                 }
            }
          if(i==suma){
                 System.out.println(i);
              }
        }
    }
    
}
