package Aleatorios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author anxo
 */
public class GenerarAleatorios {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generaVector(5,4,8)));
        
    }
 /**
  *  Texto de prueba
  * @param x
  * @param y
  * @return 
  */
    public static int generaNumero(int x, int y){
        Random aleatorio=new Random();
        int min;
        int max;
        
        if(x>y){
            max=x;
            min=y;
        } else {
            max=y;
            min=x;
        }
        
        return aleatorio.nextInt(max-min+1)+min;
}
    /**
     * Texto de prueba 2
     * @param x
     * @param y
     * @param z
     * @return 
     */
    public static int[] generaVector(int x, int y, int z){
        
        int[] vector = new int[x];
        for (int i = 0; i < x; i++) {
            vector[i]=generaNumero(y,z);
        }
        
        return vector;
    }
}