/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acarballeira;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Anxo Portela-Insua Blanco &#60; anxoportela@gmail.com &#62;
 * @version 1.0
 *
 */
public class ArUtilidades {

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

    public static int minVectorI(int[] x) {

        Arrays.sort(x);
        return x[0];

    }

    public static int maxVectorI(int[] x) {

        Arrays.sort(x);
        return x[x.length - 1];

    }

    public static int[] rotaDerechaVector(int[] x, int y) {

        String aux = "";
        int numAux = 0;
        int charInicio = 0;
        int[] vector = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            aux += x[i];
        }

        while (y / x.length >= 1) {
            numAux = y;
            y /= x.length;
        }

        for (int i = Math.abs(numAux - y) - 1; i < x.length - 1; i++) {
            int aux2 = Integer.parseInt(String.valueOf(aux.charAt(charInicio)));
            vector[i] = aux2;
            charInicio++;
        }

        for (int i = 0; i < Math.abs(numAux - y) - 1; i++) {
            int aux2 = Integer.parseInt(String.valueOf(aux.charAt(charInicio)));
            vector[i] = aux2;
            charInicio++;
        }

        return vector;

    }

}
