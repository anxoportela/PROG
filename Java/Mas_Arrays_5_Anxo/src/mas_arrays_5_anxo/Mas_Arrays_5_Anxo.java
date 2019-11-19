/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_arrays_5_anxo;

import java.util.Scanner;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Mas_Arrays_5_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in, "ISO-8859-1");

        String[] abcd = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "u", "v", "w", "x", "y", "z"};
        String cadena = "";
        int posicion;

        System.out.print("Introduzca la posicion del abecedario: ");
        posicion = entrada.nextInt();

        while (posicion > 0) {
            cadena += abcd[posicion - 1].toUpperCase();
            System.out.print("Introduzca la posicion del abecedario: ");
            posicion = entrada.nextInt();
        }

        System.out.println(cadena);

    }

}
