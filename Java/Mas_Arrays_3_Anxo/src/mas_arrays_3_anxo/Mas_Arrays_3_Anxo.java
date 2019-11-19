/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_arrays_3_anxo;


import java.util.Scanner;
/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Mas_Arrays_3_Anxo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Introduzca el valor %d para el primer vector: ", i+1);
            vector1[i] = entrada.nextInt();
            System.out.printf("Introduzca el valor %d para el segundo vector: ", i+1);
            vector2[i] = entrada.nextInt();
            vector3[i] = vector1[i] + vector2[i];
        }
        
        for (int x : vector3){
            System.out.printf("%d ", vector3[x]);
        }
        
    }
    
}
