/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_arrays_6_anxo;

import java.util.Random;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Mas_Arrays_6_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int vector1 = 8;
        int vector2 = 12;
        int vector3 = vector1 + vector2;
        int i,j;
        double[] v1 = new double[vector1];
        double[] v2 = new double[vector2];
        double[] v3 = new double[vector3];

        for (i=0, j=0; i < v1.length || j < v2.length; i++, j++){
            v1[i] = aleatorio.nextDouble() * 99 + 1;
            v2[j] = aleatorio.nextDouble() * 99 + 1;
            v3[i] = v1[i];
        }

        for (double x : v1) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (double x : v2) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (double x : v3) {
            System.out.print(x + " ");
        }
        System.out.println("");

    }

}
