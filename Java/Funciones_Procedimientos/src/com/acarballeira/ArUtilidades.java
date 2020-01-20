/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acarballeira;

import java.util.Arrays;
import java.util.Random;

/**
 * Métodos con arrays
 * 
 * @author Anxo Portela-Insua Blanco &#60; anxoportela@gmail.com &#62;
 * @version 1.0
 *
 */
public class ArUtilidades {

    /**
     * Método para generar un vector de númoer aleatorios
     * @param x Tamaño del vector
     * @param y Inicio del rango de números
     * @param z Final del rango de números
     * @return Un vector de números aleatorios
     */
    public static int[] generaVector(int x, int y, int z) {

        int[] vector = new int[x];
        Random aleatorio = new Random();
        int aux;
        if (y > z) {
            aux = y;
            y = z;
            z = aux;
        }

        for (int i = 0; i < x; i++) {
            vector[i] = aleatorio.nextInt(z - y + 1) + y;
        }

        return vector;

    }

    /**
     * Muestra vector con cada elemento separado por un caracter pasado por parametro
     * @param x Vector a mostrar
     * @param y Carácter separador
     */
    public static void muestraVector(int[] x, String y) {

        String salida = "";

        for (int i = 0; i < x.length; i++) {
            if (i < x.length - 1) {
                salida += x[i] + y + "";
            } else {
                salida += x[i] + "";
            }

        }

        System.out.println(salida);

    }

    /**
     * Metodo para devolver el número más bajo dentro de un vector
     * @param x Vector a comprobar
     * @return El número más bajo del vector
     */
    public static int minVectorI(int[] x) {

        Arrays.sort(x);
        return x[0];

    }

    /**
     * Metodo para devolver el número más alto dentro de un vector
     * @param x Vector a comprobar
     * @return El número más alto del vector
     */
    public static int maxVectorI(int[] x) {

        Arrays.sort(x);
        return x[x.length - 1];

    }

    /**
     * Método para rotar n posiciones a la derecha los números de un vector
     * @param x Vector a rotar
     * @param y Número de posiciones
     * @return El vector reordenado
     */
    public static int[] rotaDerechaVector(int[] x, int y) {

        int t = x.length - 1;
        for (int i = 0; i < y; i++) {
            for (int j = 1; j <= t; j++) {
                int k = x[j];
                int l = x[0];
                x[j] = k;
                x[0] = l;
            }
        }
        return x;
    }

    /**
     * Busqueda lineal dentro de un vector
     * @param x Vector en el que buscar
     * @param y Valor a buscar
     * @return La posición de un número dentro del vector dado
     */
    public static int busquedaLineal(int[] x, int y) {

        int contador = 0;
        for (int z : x) {
            if (z == y) {
                return contador;
            } else {
                contador++;
            }
        }
        return -1;
    }

     /**
     * Busqueda binaria dentro de un vector
     * @param x Vector en el que buscar
     * @param y Valor a buscar
     * @return La posición de un número dentro del vector dado
     */
    public static int busquedaBinaria(int[] x, int y) {

        Arrays.sort(x);
        int t = x.length;
        int c, i = 0, s = t - 1;
        while (i <= s) {
            c = (s + i) / 2;
            if (x[c] == y) {
                return c;
            } else if (y < x[c]) {
                s = c - 1;
            } else {
                i = c + 1;
            }
        }
        return -1;
    }

    /**
     * Método para devolver el tiempo de ejecución
     * @param x Vector en el que buscar
     * @param y Número a buscar
     * @param z Método a utilizar
     * @return Tiempo en milisegundos en el que se finaliza la consulta
     */
    public static long tiempoEjecucion(int[] x, int y, int z) {

        if (z == 0) {
            long startTime = System.nanoTime();
            busquedaLineal(x, y);
            return System.nanoTime() - startTime;
        } else if (z == 1) {
            long startTime = System.nanoTime();
            busquedaBinaria(x, y);
            return System.nanoTime() - startTime;
        }
        return 0;
    }

}
