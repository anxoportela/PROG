/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex1_anxo;

import java.util.Scanner;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Regex1_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        System.out.print("Introduzca la frase a comprobar: ");
        String frase = entrada.nextLine();
        String vacio = cadenaVacia(frase) ? "Es una cadena vacía" : "No es una cadena vacía";
        String tamano = alfaNum(frase) ? "Tiene entre 8-12 caracteres alfanuméricos" : "No cumple con las restricciones aplicadas";
        String unica = unaPalabra(frase) ? "Es una palabra" : "Es más de una palabra";
        String dos = dosPalabra(frase) ? "Son dos palabras" : "No son dos palabras";
        String numPosi = numPos2d(frase) ? "Tiene dos decimales" : "No tiene dos decimales";
        String numPosiOp = numPos2dOp(frase) ? "El número valida" : "El número no valida";
        String numPosiOpSig = numPos2dOpSigno(frase) ? "El número valida" : "El número no valida";
        String validaFecha = fecha(frase) ? "La fecha valida" : "La fecha no valida";
        String validaTelefono = validaTlf(frase) ? "El teléfono valida" : "El teléfono no valida";
        String validaVocales = vocales(frase) ? "La cadena de vocales sin acento es válida" : "La cadena de vocales sin acento no es válida";
        String validaIban = iban(frase) ? "El IBAN es válido" : "El IBAN no es válido";
        String validaCodPostal = codPostal(frase) ? "El código postal es válido" : "El código postal no es válido";
        String validaFactura = factura(frase) ? "La factura es válida" : "La factura no es válida";

        System.out.println(vacio);
        System.out.println(tamano);
        System.out.println(unica);
        System.out.println(dos);
        System.out.println(numPosi);
        System.out.println(numPosiOp);
        System.out.println(numPosiOpSig);
        System.out.println(validaFecha);
        System.out.println(validaTelefono);
        System.out.println(validaVocales);
        System.out.println(validaIban);
        System.out.println(validaCodPostal);
        System.out.println(validaFactura);
    }

    static boolean cadenaVacia(String x) {
        String patron = "^$";
        return x.matches(patron);
    }

    static boolean alfaNum(String x) {
        String patron = "[A-z0-9]{8,12}";
        return x.matches(patron);
    }

    static boolean unaPalabra(String x) {
        String patron = "^[A-z]+$";
        return x.matches(patron);
    }

    static boolean dosPalabra(String x) {
        String patron = "[A-z]+\\s[A-z]+";
        return x.matches(patron);
    }

    static boolean numPos2d(String x) {
        String patron = "\\d*.\\d{2}";
        return x.matches(patron);
    }

    static boolean numPos2dOp(String x) {
        String patron = "\\d*.\\d{1,2}?$";
        return x.matches(patron);
    }

    static boolean numPos2dOpSigno(String x) {
        String patron = "^[+-]?\\d*.\\d{1,2}?$";
        return x.matches(patron);
    }

    static boolean fecha(String x) {
        String patron = "\\d{2}\\-\\d{2}\\-\\d{4}";
        return x.matches(patron);
    }

    static boolean validaTlf(String x) {
        String patron = "\\+(34|351)?\\d{9,10}";
        return x.matches(patron);
    }

    static boolean vocales(String x) {
        String patron = "[aeiou]{2,}";
        return x.toLowerCase().matches(patron);
    }

    static boolean iban(String x) {
        String patron = "^ES\\d{2}(\\-\\d{4}){5}";
        return x.matches(patron);
    }

    static boolean codPostal(String x) {
        String patron = "^(32|15|36|27)\\d{3}";
        return x.matches(patron);
    }

    static boolean factura(String x) {
        String patron = "^(P|G|H)\\-\\d{4}";
        return x.matches(patron);
    }

}
