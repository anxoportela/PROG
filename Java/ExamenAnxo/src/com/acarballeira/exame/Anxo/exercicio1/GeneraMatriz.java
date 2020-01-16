/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acarballeira.exame.Anxo.exercicio1;

import java.util.Random;
import java.util.Scanner;

/**
 * Generador de matrices con números aleatorios
 * @author Anxo Portela-Insua Blanco
 * @version 1.0
 */
public class GeneraMatriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        final int MIN = 150;
        final int MAX = 900;

        int filas, columnas;

        System.out.print("Introduzca el número de filas: ");
        filas = entrada.nextInt();
        System.out.print("Introduzca el número de columnas: ");
        columnas = entrada.nextInt();

        while (filas < 5 || filas > 10 || columnas < 5 || columnas > 10) {
            System.out.println("El valor de las filas y columnas debe estar entre 5-10");
            System.out.println("");
            System.out.print("Introduzca el número de filas: ");
            filas = entrada.nextInt();
            System.out.print("Introduzca el número de columnas: ");
            columnas = entrada.nextInt();
        }
        
        generaMatriz(filas,columnas,MIN,MAX);
    }
    
    /**
     * Método para generar números aleatorios
     * @param x Primer valor del rango
     * @param y Segundo valor del rango
     * @return Un número aleatorio comprendido entre los dos valores del rango
     */
    public static int generaAleatorio(int x, int y) {

        Random aleatorio = new Random();
        int min, max;

        if (x > y) {
            min = y;
            max = x;
        } else {
            min = x;
            max = y;
        }

        return aleatorio.nextInt(max - min + 1) + min;
    }
    
    /**
     * Método para generar una matriz de números aleatorios
     * @param i Número de filas
     * @param j Número de columnas
     * @param k Primer valor del rango
     * @param l Segundo valor del rango
     */
    public static void generaMatriz(int i, int j, int k, int l) {

        int filas = i;
        int columnas = j;
        int min = k;
        int max = l;
        int[][] matrizAleatorios = new int[filas][columnas];

        for (int m = 0; m < matrizAleatorios.length; m++) {
            for (int n = 0; n < matrizAleatorios[m].length; n++) {
                matrizAleatorios[m][n] = generaAleatorio(min, max);
                System.out.print(matrizAleatorios[m][n] + "  ");
            }
            System.out.println("");
        }
    }
}
