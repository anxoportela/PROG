/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_7;

import java.util.Scanner;

/**
 *
 * @author anxo
 */
public class Mas_Strings_7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        int numeroDni;
        String letra;

        System.out.print("Introduzca su número de DNI: ");
        numeroDni = entrada.nextInt();
        System.out.print("Introduzca su letra del DNI: ");
        letra = entrada.next().toUpperCase();

        String msgDni = (numeroDni < 0 || numeroDni > 99999999) ? "Número de DNI incorrecto"
                : letrasDni.charAt(numeroDni % 23) == letra.charAt(0) ? "Número y letra de DNI correctos" : "Letra de DNI incorrecta";

        System.out.println(msgDni);

    }

}
