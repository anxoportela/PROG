/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author ex
 */
public class ExamenPSeInt_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        int num,aux;

        System.out.print("Introduzca un número entre 3 y 10: ");
        num = entrada.nextInt();
        
        while (num < 3 || num > 10) {
            System.out.println("El número debe estar comprendido entre 3 y 10\n");
            System.out.print("Introduzca un número entre 3 y 10: ");
            num = entrada.nextInt();
        }
        
        aux=2*num;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            for (int k = aux-(2*i); k >= 0; k--) {
                System.out.print("  ");
            }

            for (int l = 0; l<i; l++) {
                System.out.print("* ");
            }
            aux-=2;
            System.out.println("");
        }

    }

}
