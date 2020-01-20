/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acarballeira;

import java.util.Arrays;

/**
 * Métodos con números
 * @author Anxo Portela-Insua Blanco &#60; anxoportela@gmail.com &#62;
 * @version 1.0
 *
 */
public class Mates {

    public static final double E = 2.718281;
    public static final double PI = 3.141592;
    public static final double PHI = 1.618033;

    /**
     * Método para comprobar si un número es primo
     * @param x Número a comprobar
     * @return True/False
     */
    public static boolean esPrimo(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método para devolver el siguiente número primo al dado
     * @param x Número en el que iniciar
     * @return El siguiente número primo
     */
    public static int siguientePrimo(int x) {

        while (!esPrimo(x)) {
            ++x;
        }
        return x;
    }

    /**
     * Devolver el número de dígitos de un número dado
     * @param x Número al que contar dígitos
     * @return Dígitos del número
     */
    public static int digitos(int x) {

        return Integer.toString(x).length();
    }

    /**
     * Voltear con StringBuilder
     * @param x Número al que dar la vuelta
     * @return Número dado la vuelta
     */
    public static int volteaS(int x) {

        StringBuilder reves = new StringBuilder("");
        String num = Integer.toString(x);

        for (int i = 0; i < num.length(); i++) {
            reves.insert(0, num.charAt(i));
        }

        return Integer.parseInt(reves.toString());

    }

    /**
     * Voltear con StringBuilder en una línea
     * @param x Número al que dar la vuelta
     * @return Número dado la vuelta
     */
    public static int volteaS2(int x) {

        StringBuilder num = new StringBuilder();
        return Integer.parseInt(num.append(x).reverse().toString());

    }

    /**
     * Voltear con números
     * @param x Número al que dar la vuelta
     * @return Número dado la vuelta
     */
    public static int volteaL(int x) {

        int r, v = 0;

        while (x > 0) {
            r = x % 10;
            v = v * 10 + r;
            x /= 10;
        }

        return v;
    }

    /**
     * Método para buscar la posición de un dígito
     * @param x Número en el que buscar
     * @param y Dígito a buscar
     * @return Posición del dígito
     */
    public static int posicionDeDigito(int x, int y) {

        int i;

        for (i = 0; (i < digitos(x)) && (digitoEn(x, i) != y); i++) {
        };

        if (i == digitos(x)) {
            return -1;
        } else {
            return ++i;
        }

    }

    /**
     * Dígito en posicion n por detrás
     * @param x Número en el que buscar
     * @param n posicón a usar
     * @return Número en la posición dada
     */
    public static int digitoEn(int x, int n) {
        x = volteaS(x);

        while (n-- > 0) {
            x = x / 10;
        }

        return (int) x % 10;
    }

    /**
     * Quitar dígitos por detras
     * @param x Número que editar
     * @param y Cantidad de dígitos
     * @return Le quita a un número n dígitos por detrás
     */
    public static int quitaPorDetras(int x, int y) {
        return Integer.parseInt(Integer.toString(y).substring(x, Integer.toString(y).length()));
    }

    /**
     * Pegar dígito por detras
     * @param x Número que editar
     * @param y Dígito a añadir
     * @return Le añade a un número un dígito por detrás
     */
    public static int pegaPorDetras(int x, int y) {

        return y * (int) Math.pow(10, Integer.toString(x).length()) + x;
    }

    /**
     * Pegar dígito por delante
     * @param x Número que editar
     * @param y Dígito a añadir
     * @return Le añade a un número un dígito por delante
     */
    public static int pegaPorDelante(int x, int y) {

        return (x * (int) Math.pow(10, Integer.toString(y).length()) + y);
    }

    /**
     * Método para devolver el número máximo de una cantidad indeterminada de enteros
     * @param x Primer valor
     * @param y Número indeterminado de valores
     * @return Valor máximo de los introducidos
     */
    public static int numVariable(int x, int... y) {

        Arrays.sort(y);
        return x > y[y.length - 1] ? x : y[y.length - 1];
    }

}
