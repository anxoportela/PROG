package app;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
        final Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        System.out.print("Introduzca la frase a comprobar: ");
        final String frase = entrada.nextLine();
        final String vacio = cadenaVacia(frase) ? "Es una cadena vacía" : "No es una cadena vacía";
        final String tamano = alfaNum(frase) ? "Tiene entre 8-12 caracteres alfanuméricos"
                : "No cumple con las restricciones aplicadas";
        final String unica = unaPalabra(frase) ? "Es una palabra" : "Es más de una palabra";
        final String dos = dosPalabra(frase) ? "Son dos palabras" : "No son dos palabras";
        final String numPosi = numPos2d(frase) ? "Tiene dos decimales" : "No tiene dos decimales";
        final String numPosiOp = numPos2dOp(frase) ? "El número valida" : "El número no valida";
        final String numPosiOpSig = numPos2dOpSigno(frase) ? "El número valida" : "El número no valida";
        final String validaFecha = fecha(frase) ? "La fecha valida" : "La fecha no valida";
        final String validaTelefono = validaTlf(frase) ? "El teléfono valida" : "El teléfono no valida";
        final String validaVocales = vocales(frase) ? "La cadena de vocales sin acento es válida"
                : "La cadena de vocales sin acento no es válida";
        final String validaIban = iban(frase) ? "El IBAN es válido" : "El IBAN no es válido";
        final String validaCodPostal = codPostal(frase) ? "El código postal es válido"
                : "El código postal no es válido";
        final String validaFactura = factura(frase) ? "La factura es válida" : "La factura no es válida";

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

        entrada.close();
    }

    static boolean cadenaVacia(final String x) {
        final String patron = "^$";
        return x.matches(patron);
    }

    static boolean alfaNum(final String x) {
        final String patron = "[A-z0-9]{8,12}";
        return x.matches(patron);
    }

    static boolean unaPalabra(final String x) {
        final String patron = "^[A-z]+$";
        return x.matches(patron);
    }

    static boolean dosPalabra(final String x) {
        final String patron = "[A-z]+\\s[A-z]+";
        return x.matches(patron);
    }

    static boolean numPos2d(final String x) {
        final String patron = "\\d*.\\d{2}";
        return x.matches(patron);
    }

    static boolean numPos2dOp(final String x) {
        final String patron = "\\d*.\\d{1,2}?$";
        return x.matches(patron);
    }

    static boolean numPos2dOpSigno(final String x) {
        final String patron = "^[+-]?\\d*.\\d{1,2}?$";
        return x.matches(patron);
    }

    static boolean fecha(final String x) {
        final String patron = "\\d{2}\\-\\d{2}\\-\\d{4}";
        return x.matches(patron);
    }

    static boolean validaTlf(final String x) {
        final String patron = "\\+(34|351)?\\d{9,10}";
        return x.matches(patron);
    }

    static boolean vocales(final String x) {
        final String patron = "[aeiou]{2,}";
        return x.toLowerCase().matches(patron);
    }

    static boolean iban(final String x) {
        final String patron = "^ES\\d{2}(\\-\\d{4}){5}";
        return x.matches(patron);
    }

    static boolean codPostal(final String x) {
        final String patron = "^(32|15|36|27)\\d{3}";
        return x.matches(patron);
    }

    static boolean factura(final String x) {
        final String patron = "^(P|G|H)\\-\\d{4}";
        return x.matches(patron);
    }
    }


