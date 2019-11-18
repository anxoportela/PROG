/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OB_4_Anxo;

/**
 *
 * @author dual108
 */
import java.util.Random;

public class OB_4_Anxo {

    public static void main(String[] args) {

        int numMin, numMax, filaMin, filaMax, columnMin, columnMax;
        filaMin = filaMax = columnMin = columnMax = 0;
        numMin = 41;
        numMax = 0;

        Random numRandom = new Random();
        int[][] matriz = new int[5][8];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numRandom.nextInt(21) + 20;
                System.out.printf("%2d ", matriz[i][j]);
                if (matriz[i][j] > numMax) {
                    numMax = matriz[i][j];
                    filaMax = i + 1;
                    columnMax = j + 1;
                }
                if (matriz[i][j] < numMin) {
                    numMin = matriz[i][j];
                    filaMin = i + 1;
                    columnMin = j + 1;
                }
            }
            System.out.println("");
        }

        System.out.printf("Elemento menor: %2d\t Fila: %2d Columna: %2d\n", numMin, filaMin, columnMin);
        System.out.printf("Elemento mayor: %2d\t Fila: %2d Columna: %2d\n", numMax, filaMax, columnMax);

    }
}