/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Str3_Anxo;

/**
 *
 * @author dual108
 */
import java.util.Scanner;

public class Str3_Anxo {

    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);

        String cadena1, cadena2;
        int posicion, contador;
        System.out.print("Introduzca la cadena principal: ");
        cadena1 = entrada.nextLine();
        System.out.print("Introduzca la cadena a buscar: ");
        cadena2 = entrada.nextLine();
        
        posicion = cadena1.lastIndexOf(cadena2);

    }

}
