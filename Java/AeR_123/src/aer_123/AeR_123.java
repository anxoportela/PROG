/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer_123;

import java.util.Scanner;

/**
 *
 * @author anxo
 */
public class AeR_123 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1");

        String[][] primera = {
            {"o", "as", "a", "amos", "ais", "an"},
            {"e", "aste", "o", "amos", "asteis", "aron"},
            {"are", "aras", "ara", "aremos", "areis", "aran"}
        };

        String segunda[][] = {
            {"o", "es", "e", "emos", "eis", "en"},
            {"i", "iste", "io", "imos", "isteis", "ieron"},
            {"ere", "eras", "era", "eremos", "ereis", "eran"}
        };

        String[][] tercera = {
            {"o", "es", "e", "imos", "is", "en"},
            {"i", "iste", "io", "imos", "isteis", "eron"},
            {"ire", "iras", "ira", "iremos", "ireis", "iran"}
        };

        String pronombres[] = {"yo", "tu", "el", "nosotros", "vosotros", "ellos"};

        String verbo, comando;

        verbo = entrada.next();
        comando = entrada.next().toUpperCase();

        boolean continuar = true;

        while (continuar) {
            switch (comando) {
                case "A":
                    for (int i = 0; i < pronombres.length; i++) {
                        if ("a".equals(verbo.substring(verbo.length() - 2, verbo.length() - 1))) {
                            System.out.println(pronombres[i] + " " + verbo.substring(0, verbo.length() - 2) + primera[0][i]);
                        } else if ("e".equals(verbo.substring(verbo.length() - 2, verbo.length() - 1))) {
                            System.out.println(pronombres[i] + " " + verbo.substring(0, verbo.length() - 2) + segunda[0][i]);
                        } else {
                            System.out.println(pronombres[i] + " " + verbo.substring(0, verbo.length() - 2) + tercera[0][i]);
                        }
                    }
                    break;
                case "P":
                    for (int i = 0; i < pronombres.length; i++) {
                        if ("a".equals(verbo.substring(verbo.length() - 2, verbo.length() - 1))) {
                            System.out.println(pronombres[i] + " " + verbo.substring(0, verbo.length() - 2) + primera[1][i]);
                        } else if ("e".equals(verbo.substring(verbo.length() - 2, verbo.length() - 1))) {
                            System.out.println(pronombres[i] + " " + verbo.substring(0, verbo.length() - 2) + segunda[1][i]);
                        } else {
                            System.out.println(pronombres[i] + " " + verbo.substring(0, verbo.length() - 2) + tercera[1][i]);
                        }
                    }
                    break;
                case "F":
                    for (int i = 0; i < pronombres.length; i++) {
                        if ("a".equals(verbo.substring(verbo.length() - 2, verbo.length() - 1))) {
                            System.out.println(pronombres[i] + " " + verbo.substring(0, verbo.length() - 2) + primera[2][i]);
                        } else if ("e".equals(verbo.substring(verbo.length() - 2, verbo.length() - 1))) {
                            System.out.println(pronombres[i] + " " + verbo.substring(0, verbo.length() - 2) + segunda[2][i]);
                        } else {
                            System.out.println(pronombres[i] + " " + verbo.substring(0, verbo.length() - 2) + tercera[2][i]);
                        }
                    }
                    break;
                case "T":
                    continuar = false;
                    break;
            }
            if (continuar) {
                verbo = entrada.next();
                comando = entrada.next().toUpperCase();
            }
        }
    }

}
