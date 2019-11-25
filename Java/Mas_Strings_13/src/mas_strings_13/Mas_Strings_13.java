/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_13;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
import java.util.Scanner;

public class Mas_Strings_13 {

    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in, "ISO-8859-1");
        
        System.out.print("Introduzca la frase para contar sus vocales: ");
        String frase = entrada.nextLine();
        
        System.out.println("La frase tiene " + numeroVocales(frase) + " vocales");

    }

    public static int numeroVocales(String x) {
        int numVocales = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (vocales[j] == x.charAt(i)) {
                    numVocales++;
                }
            }
        }
        
        return numVocales;
        
    }

}
