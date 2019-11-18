/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_arrays_1_Anxo;

import java.util.Scanner;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Mas_Arrays_1_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);
        String[] vector1 = new String[5];
        String[] vector2 = new String[5];
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            vector1[i] = entrada.next();
        }

        for (int i = 4; i >= 0; i--) {
            vector2[contador] = vector1[i];
            contador++;
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%s\t", vector1[i]);
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%s\t", vector2[i]);
        }
    }

}
