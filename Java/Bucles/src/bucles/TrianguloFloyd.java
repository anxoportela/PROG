/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

/**
 *
 * @author anxo
 */
import java.util.Scanner;

public class TrianguloFloyd {

    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);

        int filas, num;

        filas = entrada.nextInt();
        num = 1;

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
