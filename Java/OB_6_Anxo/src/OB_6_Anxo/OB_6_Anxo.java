/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OB_6_Anxo;

/**
 *
 * @author dual108
 */
import java.util.Scanner;

public class OB_6_Anxo {

    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);

        int[] vector = new int[10];
        int contPositivo, contNegativo, contCero;
        contPositivo = contNegativo = contCero = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = entrada.nextInt();
        }

        for (int x : vector) {
            if (x > 0) {
                contPositivo += 1;
            } else if (x < 0) {
                contNegativo += 1;
            } else {
                contCero += 1;
            }
        }

        System.out.printf("Menor de cero: %d\tMayor de cero: %d\tIgual a cero: %d\n", contNegativo, contPositivo, contCero);

    }
}
