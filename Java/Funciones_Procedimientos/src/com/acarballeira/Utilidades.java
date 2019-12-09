/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acarballeira;

/**
 * Métodos a utilizar dentro del paquete
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 *
 */
public class Utilidades {

    /**
     * 
     * @param x
     * @return 
     */
    public static boolean esPar(int x) {
        return x % 2 == 0;
    }
    
    /**
     * 
     * @param x
     * @return 
     */
    public static boolean esBisiesto(int x) {
        return (x % 100 != 0 && x % 4 == 0) || (x % 400 == 0);
    }
    
    /**
     * 
     * @param x
     * @return 
     */
    public static int[] tablaMulti(int x) {
        int tabla[] = new int[10];
        for (int i = 0; i < 10; i++) {
            tabla[i] = x * (i + 1);
        }
        return tabla;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    public static String imprimeSerie(int x, int y) {

        String serie = "";
        int incremento = x < y ? 1 : -1;
        for (int i = x, j = 0; j <= Math.abs(y - x); j++, i += incremento) {
            if (esPar(i)) {
                serie += i + " ";
            }
        }
        return serie;
    }
    
    /**
     * 
     * @param x
     * @return 
     */
    public static short signo(int x) {
        return (short) (x < 0 ? -1 : x > 0 ? 1 : 0);
    }
    
    /**
     * 
     * @param x
     * @return 
     */
    public static String signoString(int x) {
        return (x < 0 ? "-1" : x > 0 ? "1" : "0");
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    public static int suma(int x, int y){
        return x+y;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @param z
     * @return 
     */
    public static int suma(int x, int y, int z){
        return suma(x,suma(y,z));
    }

}
