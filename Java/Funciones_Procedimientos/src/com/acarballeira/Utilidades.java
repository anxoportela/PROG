/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acarballeira;

/**
 * Métodos a utilizar dentro del paquete
 *
 * @author Anxo Portela-Insua Blanco &#60; anxoportela@gmail.com &#62;
 * @version 1.0
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
    public static int suma(int x, int y) {
        return x + y;
    }

    /**
     *
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static int suma(int x, int y, int z) {
        return suma(x, suma(y, z));
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    public static int max(int x, int y) {
        return x > y ? x : y;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    public static int min(int x, int y) {
        return x < y ? x : y;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    public static int mcd(int x, int y) {
        return y == 0 ? x : mcd(y, x % y);
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    public static int mcm(int x, int y) {
        return (x / mcd(x, y) * y);
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    public static String[] diasMes(int x, int y) {
        String[][] vectorMeses = {{"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"},
        {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}};

        String[] res1 = {vectorMeses[0][x - 1], vectorMeses[1][x - 1]};
        String[] res2 = {"29", "Febrero"};

        return (esBisiesto(y) && x == 2) ? res2 : res1;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @param z
     * @return 
     */
    public static int diasTranscurridos1980(int x, int y, int z){
        
        int dias = 0;
        
        for (int i = 1980; i<z;i++){
            if (esBisiesto(i)){
                dias += 366;
            } else {
                dias += 365;
            }
        }
        
        for (int j = 1; j<y;j++){
            dias+=Integer.parseInt(diasMes(j,z)[0]);
        }
        
        return dias+=(x-1);        
    }
    
    /**
     * 
     * @param x
     * @param y
     * @param z
     * @return 
     */
    public static int horaASegundos(int x, int y, int z){
        return x*3600+y*60+z;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @param z
     * @return 
     */
    public static String horaBonita(int x, int y, int z){
        String horaError= "00:00:00";
        return x<0||x>23||y<0||y>59||z<0||z>59?horaError:menorDiez(x)+":"+menorDiez(y)+":"+menorDiez(z);
    }
    
    /**
     * 
     * @param x
     * @return 
     */
    public static String menorDiez(int x){
        return x<10?"0"+x:Integer.toString(x);
    }

}
