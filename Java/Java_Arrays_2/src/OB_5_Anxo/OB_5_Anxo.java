/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OB_5_Anxo;

/**
 *
 * @author dual108
 */
import java.util.Scanner;

public class OB_5_Anxo {

    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int aux1,aux2;

        matriz[0][0] = entrada.nextInt();
        matriz[1][1] = entrada.nextInt();
        matriz[2][2] = entrada.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            aux1 = 0;
            aux2 =2;
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j){
                   aux1 = matriz[i][j]; 
                } else{
                    if (j > i) {
                        matriz[i][j] = (int) Math.pow(aux1, aux2);
                        aux2++;
                    } else if (j < i) {
                        matriz[i][j] = matriz[i][j + 1] >> 2;
                    }
                }
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.println("");
        }
    }
}