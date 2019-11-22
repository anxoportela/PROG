/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_8;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class Mas_Strings_8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase, palabra;
        System.out.print("Introduce una frase: ");
        frase = entrada.nextLine().trim();
        StringTokenizer st = new StringTokenizer(frase);

        while (st.hasMoreTokens()) {
            palabra = st.nextElement().toString();
            System.out.printf("%-20s %4d\n", palabra, palabra.length());
        }
    }

}
