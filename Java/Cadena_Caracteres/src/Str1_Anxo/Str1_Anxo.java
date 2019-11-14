/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Str1_Anxo;

/**
 *
 * @author dual108
 */
import java.util.Scanner;

public class Str1_Anxo {

    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);
        String cadena;

        System.out.print("Introduzca una cadena de carácteres: ");
        cadena = entrada.nextLine();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }

        System.out.println("");

    }
}
