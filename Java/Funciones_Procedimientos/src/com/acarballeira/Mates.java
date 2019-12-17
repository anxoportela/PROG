/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acarballeira;

import java.util.Arrays;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 *
 */
public class Mates {

    public static final double E = 2.718281;
    public static final double PI = 3.141592;
    public static final double PHI = 1.618033;

    public static boolean esPrimo(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int x) {

        while (!esPrimo(x)) {
            ++x;
        }
        return x;
    }

    public static int digitos(int x) {

        return Integer.toString(x).length();
    }

    public static int volteaS(int x) {

        StringBuilder reves = new StringBuilder("");
        String num = Integer.toString(x);
        int resultado;

        for (int i = 0; i < num.length(); i++) {
            reves.insert(0, num.charAt(i));
        }

        return Integer.parseInt(reves.toString());

    }

    public static int volteaS2(int x) {

        StringBuilder num = new StringBuilder();
        return Integer.parseInt(num.append(x).reverse().toString());

    }

    public static int digitoEn(int x, int n) {
        x = volteaS(x);

        while (n-- > 0) {
            x = x / 10;
        }

        return (int) x % 10;
    }

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

    public static int numVariable(int x, int... y) {

        Arrays.sort(y);
        return x > y[y.length - 1] ? x : y[y.length - 1];
    }

}