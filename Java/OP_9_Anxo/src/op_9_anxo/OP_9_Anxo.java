/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op_9_anxo;

import java.util.Scanner;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class OP_9_Anxo {

    public static void main(String[] args) {

        int[][] matriz = introduceNum();
        imprimir(matriz);
        imprimir(actualizar(matriz, sumaMatriz(matriz)));

    }

    static int[][] introduceNum() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        int[][] arreglo = new int[3][3];
        System.out.println("Introduzca los valores dentro del array");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = entrada.nextInt();
            }
        }
        return arreglo;
    }

    static void imprimir(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static int sumaMatriz(int[][] x) {
        int suma = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                suma += x[i][j];
            }
        }
        return suma;
    }

    static int[][] actualizar(int[][] x, int y) {

        int arreglo[][] = new int[3][3];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                arreglo[i][j] = x[i][j] + y;
            }
        }
        return arreglo;
    }

}
