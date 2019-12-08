/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer_151;

import java.util.Scanner;

/**
 *
 * @author anxo
 */
public class AeR_151 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        int x = entrada.nextInt();
        int arreglo[][] = new int[x][x];
        boolean respuesta = true;

        while (x != 0) {
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++) {
                    arreglo[i][j] = entrada.nextInt();
                }
            }

            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++) {
                    if (i == j) {
                        if (arreglo[i][j] != 1) {
                            respuesta = false;
                        }
                    } else {
                        if (arreglo[i][j] != 0) {
                            respuesta = false;
                        }
                    }
                }
            }

            if (respuesta) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            
            x = entrada.nextInt();
            arreglo = new int[x][x];
            respuesta = true;
        }
    }

}
