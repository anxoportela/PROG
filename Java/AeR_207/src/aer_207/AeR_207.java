/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer_207;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
import java.util.Arrays;
import java.util.Scanner;

public class AeR_207 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        int alto, ancho, arbol, contador, contadorLinea;
        alto = ancho = arbol = 0;
        int coordx, coordy;

        alto = entrada.nextInt();
        ancho = entrada.nextInt();
        arbol = entrada.nextInt();

        int[][] matriz = new int[alto][ancho];

        //for (int i =0; i<matriz.length; i++){
        //    for (int j = 0; j< matriz[i].length;j++){
        //        System.out.print("* ");
        //    }
        //    System.out.println("");
        //}
        while (arbol > 0) {
            coordx = entrada.nextInt();
            coordy = entrada.nextInt();
            matriz[coordx - 1][coordy - 1] = 2;
            arbol--;
        }

        for (int i = 0; i < matriz.length; i++) {
            contador = ancho - 1;
            contadorLinea = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 2 && matriz[i][j] != 1 && contador > 0 && contadorLinea > 0) {
                    if (matriz[i][j + 1] != 2 && matriz[i + 1][j] != 2 && matriz[i + 1][j + 1] != 2 && matriz[i - 1][j] != 2 && matriz[i - 1][j + 1] != 2 && matriz[i][j + 1] != 1 && matriz[i + 1][j] != 1 && matriz[i + 1][j + 1] != 1 && matriz[i - 1][j] != 1 && matriz[i - 1][j + 1] != 1) {
                        matriz[i][j] = 0;
                        contador--;
                    } else {
                        matriz[i][j] = 1;
                        contador--;
                    }
                } else {
                    if (matriz[i][j + 1] != 2 && matriz[i + 1][j] != 2 && matriz[i + 1][j + 1] != 2) {
                        matriz[i][j] = 1;
                        contador--;
                        contadorLinea++;
                    }
                }
            }
        }
        for (int[] x : matriz) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }

}
