/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_14;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
import java.util.Scanner;

public class Mas_Strings_14 {

    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in, "ISO-8859-1");

        System.out.print("Introduzca la cadena a comprobar: ");
        String frase = entrada.nextLine();

        if (esPalindromo(frase)) {
            System.out.println("La cadena es un palíndromo");
        } else {
            System.out.println("La cadena no es un palidromo");
        }
    }

    public static boolean esPalindromo(String x) {

        String cadenaInversa = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            cadenaInversa += x.charAt(i);
        }
        return cadenaInversa.equals(x);
    }

}
