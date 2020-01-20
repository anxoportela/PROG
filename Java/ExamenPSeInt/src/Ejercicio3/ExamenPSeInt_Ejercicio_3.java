/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ex
 */
public class ExamenPSeInt_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        int dinero, resto, contador;

        final int BILL1 = 100;
        final int BILL2 = 50;
        final int BILL3 = 20;
        final int BILL4 = 10;
        final int BILL5 = 5;
        final int MON1 = 2;
        final int MON2 = 1;

        System.out.println("Introduzca la cantidad de dinero a descomponer en billetes: ");
        dinero = entrada.nextInt();
        resto = dinero;

        contador = 0;
        if (resto >= BILL1) {
            contador = (int) resto / BILL1;
            System.out.println(contador + " billetes de 100 euros");
        }
        resto = resto - (contador * BILL1);
        contador = 0;
        if (resto >= BILL2) {
            contador = (int) resto / BILL2;
            System.out.println(contador + " billetes de 50 euros");
        }
        resto = resto - (contador * BILL2);
        contador = 0;
        if (resto >= BILL3) {
            contador = (int) resto / BILL3;
            System.out.println(contador + " billetes de 20 euros");
        }
        resto = resto - (contador * BILL3);
        contador = 0;
        if (resto >= BILL4) {
            contador = (int) resto / BILL4;
            System.out.println(contador + " billetes de 10 euros");
        }
        resto = resto - (contador * BILL4);
        contador = 0;
        if (resto >= BILL5) {
            contador = (int) resto / BILL5;
            System.out.println(contador + " billetes de 5 euros");
        }
        resto = resto - (contador * BILL5);
        contador = 0;
        if (resto >= MON1) {
            contador = (int) resto / MON1;
            System.out.println(contador + " monedas de 2 euros");
        }
        resto = resto - (contador * MON1);
        contador = 0;
        if (resto >= MON2) {
            contador = (int) resto / MON2;
            System.out.println(contador + " monedas de 1 euro");
        }

    }
}
