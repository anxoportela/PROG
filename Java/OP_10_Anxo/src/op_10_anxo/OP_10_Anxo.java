/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op_10_anxo;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class OP_10_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            int aux = 0;
            if (i == 0) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = ++aux;
                }
            } else {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (j == 0) {
                        matriz[i][j] = matriz[i - 1][matriz[i].length - 1];
                    } else {
                        if (matriz[i][j - 1] < matriz[i].length) {
                            matriz[i][j] = matriz[i][j - 1] + 1;
                        } else {
                            matriz[i][j] = ++aux;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
