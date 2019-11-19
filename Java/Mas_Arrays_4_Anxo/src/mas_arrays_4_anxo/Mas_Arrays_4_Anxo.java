/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_arrays_4_anxo;

import java.util.Scanner;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Mas_Arrays_4_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);

        String[] nombre = new String[35];
        int[] edad = new int[35];
        int contador = 0;
        int maior = Integer.MIN_VALUE;
        int cuentaMaiores = 0;

        for (int i = 0; i < 35; i++) {
            System.out.print("Introduzca el nombre del alumno: ");
            nombre[i] = entrada.next();
            if (nombre[i].equals("*")) {
                break;
            }
            System.out.print("Introduzca la edad del alumno: ");
            edad[i] = entrada.nextInt();
            contador++;
        }

        for (int j = 0; j < contador; j++) {
            if (edad[j] >= 18) {
                System.out.print(nombre[j] + " ");
            }
        }
        System.out.println("");

        for (int k = 0; k < contador; k++) {
            if (edad[k] >= maior) {
                maior = edad[k];
                cuentaMaiores++;
            }
        }

        String[] maiores = new String[cuentaMaiores - 1];
        int acum = 0;

        for (int l = 0; l < contador; l++) {
            if (edad[l] == maior) {
                maiores[acum] = nombre[l];
                acum++;
            }
        }

        for (String x : maiores) {
            System.out.print(x + " ");
        }
        System.out.println("");

    }
}
