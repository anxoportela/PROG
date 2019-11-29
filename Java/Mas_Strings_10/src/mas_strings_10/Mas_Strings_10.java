/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_10;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
import java.util.Scanner;

public class Mas_Strings_10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        String password;

        System.out.print("Introduzca la contraseña a evaluar: ");
        password = entrada.next();
        String respuesta = (compruebaTamano(password) && comprobacion(password)) ? "Contraseña fuerte" : "Contraseña débil";
        System.out.println(respuesta);

    }

    public static boolean compruebaTamano(String x) {

        if (x.length() > 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean comprobacion(String x) {

        String minus = "abcdefghijklmnñopqrstuvwxyz";
        String mayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String nums = "0123456789";

        int contadorMinus, contadorMayus, contadorNums;
        contadorMinus = contadorMayus = contadorNums = 0;

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < minus.length(); j++) {
                if (minus.charAt(j) == x.charAt(i)) {
                    contadorMinus++;
                    break;
                }
            }
        }

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < mayus.length(); j++) {
                if (mayus.charAt(j) == x.charAt(i)) {
                    contadorMayus++;
                    break;
                }
            }
        }

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < nums.length(); j++) {
                if (nums.charAt(j) == x.charAt(i)) {
                    contadorNums++;
                    break;
                }
            }
        }

        if (contadorMinus >= 1 && contadorMayus >= 2 && contadorNums > 5) {
            return true;
        } else {
            return false;
        }
    }

}
