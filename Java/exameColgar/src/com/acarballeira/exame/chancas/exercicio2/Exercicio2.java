/*
 * Documento creado no 2019 por DAWDU1.
 * CIFP A Carballeira. Proxecto exame no 08/12/2019.
 * Contido con licenciamento Creative Commons CC BY-NC-SA
 * Cualificación: 8
 */

package com.acarballeira.exame.chancas.exercicio2;

import java.util.Random;

/**
 * TODO - Descrición da clase
 * Plantilla de exame
 * @author Julio Mosquera González "julio.mosquera@yahoo.es"
 * @version 1.0
 */
public class Exercicio2 {
    
    static final int MAX = 46;
    static final int MIN = -50;

    public static void main(String[] args) {
        
        int[][] matriz;
        int filas, columnas;
        
        if (args.length != 2 || Integer.parseInt(args[0]) < 2 || Integer.parseInt(args[1]) < 2 
                    || Integer.parseInt(args[0]) > 100 || Integer.parseInt(args[1]) > 100) {  
            System.out.println("Error. Parámetros de entrada incorrectos");
        } else {
            //Recollo os datos da liña de comandos
            filas = Integer.parseInt(args[0]);
            columnas = Integer.parseInt(args[1]);
            
            matriz = xeneraMatriz(filas, columnas);
            System.out.println("Matriz orixinal");
            amosaMatriz(matriz);
            matriz = transponher(matriz);
            System.out.println("Matriz transposta");
            amosaMatriz(matriz);
        }
    }
    
    static int[][] transponher(int[][] m) {        
        
        int filas = m[0].length;
        int columnas = m.length;
        int [][] mTrans = new int[filas][columnas];
        
        for (int i  = 0; i < filas; i++) {
            for (int j  = 0; j < columnas; j++) {
                mTrans[i][j] = m[j][i];
            }
        }
        return mTrans;
    }
    
    static int[][] xeneraMatriz(int f, int c) {
        
        int [][] m = new int[f][c];
        Random aleatorio = new Random();
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = aleatorio.nextInt(MAX - MIN + 1) + MIN;                
            } //for
        } //for
        
        return m;
    }
    
    static void amosaMatriz(int[][] m) {        
        for (int[] fila: m) {
            for (int num : fila) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
