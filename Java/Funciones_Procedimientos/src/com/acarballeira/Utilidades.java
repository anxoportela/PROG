/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acarballeira;

/**
 * Métodos y funciones básicas
 *
 * @author Anxo Portela-Insua Blanco &#60; anxoportela@gmail.com &#62;
 * @version 1.0
 *
 */
public class Utilidades {

    /**
     * Comprobar si un número es par
     * @param x
     * @return true/false
     */
    public static boolean esPar(int x) {
        return x % 2 == 0;
    }

    /**
     * Comprobar si un año es bisiesto
     * @param x
     * @return true/false
     */
    public static boolean esBisiesto(int x) {
        return (x % 100 != 0 && x % 4 == 0) || (x % 400 == 0);
    }

    /**
     * Tabla de multiplicar de un númoer dado
     * @param x
     * @return Un vector con la tabla de multiplicar
     */
    public static int[] tablaMulti(int x) {
        int tabla[] = new int[10];
        for (int i = 0; i < 10; i++) {
            tabla[i] = x * (i + 1);
        }
        return tabla;
    }

    /**
     * Imprimir valores pares de la serie dada
     * @param x Primer valor de la serie
     * @param y Segundo valor de la serie
     * @return Un String con los números pares de la serie
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
     * Comprobar si un número es positivo/negativo
     * @param x Número entero a comprobar
     * @return (Short) 1:Positivo/0:Cero/-1:Negativo
     */
    public static short signo(int x) {
        return (short) (x < 0 ? -1 : x > 0 ? 1 : 0);
    }

    /**
     * Comprobar si un número es positivo/negativo
     * @param x Número entero a comprobar
     * @return (String) 1:Positivo/0:Cero/-1:Negativo
     */
    public static String signoString(int x) {
        return (x < 0 ? "-1" : x > 0 ? "1" : "0");
    }

    /**
     * Suma de dos números
     * @param x Primer número
     * @param y Segundo número
     * @return Resultado de la suma
     */
    public static int suma(int x, int y) {
        return x + y;
    }

    /**
     * Suma de tres números
     * @param x Primer número
     * @param y Segundo número
     * @param z Tercer número
     * @return Resultado de la suma
     */
    public static int suma(int x, int y, int z) {
        return suma(x, suma(y, z));
    }
    
    /**
     * Número mayor
     * @param x Primer número
     * @param y Segundo número
     * @return Mayor de los dos números introducidos
     */
    public static int max(int x, int y) {
        return x > y ? x : y;
    }
     
    /**   
     * Número menor
     * @param x Primer número
     * @param y Segundo número
     * @return Menor de los dos números introducidos
     */
    public static int min(int x, int y) {
        return x < y ? x : y;
    }
    
    /**
     * Calcular el MCD de dos números
     * @param x Primer número
     * @param y Segundo número
     * @return MCD de los números introducidos
     */
    public static int mcd(int x, int y) {
        return y == 0 ? x : mcd(y, x % y);
    }
    
    /**
     * Calcular el MCM de dos números
     * @param x Primer número
     * @param y Segundo número
     * @return MCM de los números introducidos
     */
    public static int mcm(int x, int y) {
        return (x / mcd(x, y) * y);
    }
    
    /**
     * Indicar el número de días que tiene un mes y el nombre
     * @param x Mes como número
     * @param y Año como número
     * @return Un vector con los días y su mes
     */
    public static String[] diasMes(int x, int y) {
        String[][] vectorMeses = {{"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"},
        {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}};

        String[] res1 = {vectorMeses[0][x - 1], vectorMeses[1][x - 1]};
        String[] res2 = {"29", "Febrero"};

        return (esBisiesto(y) && x == 2) ? res2 : res1;
    }
    
    /**
     * Mostrar número de días trannscurridos desde 1980
     * @param x Día del mes
     * @param y Mes
     * @param z Año
     * @return Número de días transcurridos desde 1980
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
     * Método para pasar una hora dada a segundos
     * @param x Hora
     * @param y Minutos
     * @param z Segundos
     * @return Hora del día en segundos
     */
    public static int horaASegundos(int x, int y, int z){
        if(x>23||x<0||y>59||y<0||z>59||z<0){
            return -1;
        }
        return x*3600+y*60+z;
    }
    
    /**
     * Formatear la hora
     * @param x Hora
     * @param y Minutos
     * @param z Segundos
     * @return Hora en formato legible
     */
    public static String horaBonita(int x, int y, int z){
        String horaError= "00:00:00";
        return x<0||x>23||y<0||y>59||z<0||z>59?horaError:menorDiez(x)+":"+menorDiez(y)+":"+menorDiez(z);
    }
    
    /**
     * Método para añadir un cero por delante si la hora/minutos/segundos son menores de 10
     * @param x Un número entero
     * @return Número formateado para la hora
     */
    public static String menorDiez(int x){
        return x<10?"0"+x:Integer.toString(x);
    }

}
