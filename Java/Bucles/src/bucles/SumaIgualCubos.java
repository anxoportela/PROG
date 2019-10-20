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
public class SumaIgualCubos {
    
    public static void main(String[] args) {
        
        int num,suma,aux;
        
        for(num=100;num<=999;num++){
            
            aux=num;
            suma=0;
            
            while (aux > 0) {
               suma += Math.pow((aux%10), 3);
               aux = aux / 10;
            }
            
            if (num == suma) {
                System.out.println("El número " + num + " es igual a la suma de sus tres cubos");
            }
        }
    }
}
