/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acarballeria.exame.Anxo.exercicio2;

import static com.acarballeira.exame.Utilidades.*;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Procesado de DNIs dentro de un txt
 * @author Anxo Portela-Insua Blanco
 * @version 1.0
 */
public class ProcesadoTexto {

    public static void main(String[] args) {

        InputStream texto = ProcesadoTexto.class.getResourceAsStream("texto.txt");
        Scanner entrada = new Scanner(texto, "ISO-8859-1");
        String linea;
        String lineaFinal = "";
        String[] vectorLinea;

        while (entrada.hasNext()) {
            linea = entrada.nextLine();
            vectorLinea = linea.split("\\s+");
            String simbolo;

            for (String s : vectorLinea) {
                if (String.valueOf(s.charAt(0)).matches("[0-9]")) {
                    if (String.valueOf(s.charAt(s.length() - 1)).matches("[\\.\\,\\:\\;]")) {
                        simbolo = String.valueOf(s.charAt(s.length() - 1));
                        s = s.substring(0, s.length() - 1);
                        if (!dniCorrecto(Integer.parseInt(s.substring(0, s.length() - 1)), s.charAt(s.length() - 1))) {
                            if (simbolo.length() > 0) {
                                s = "*" + s + "*" + simbolo;
                            } else {
                                s = "*" + s + "*";
                            }
                        }
                    } else {
                        if (!dniCorrecto(Integer.parseInt(s.substring(0, s.length() - 1)), s.charAt(s.length() - 1))) {
                            s = "*" + s + "*";
                        }
                    }
                }
                System.out.print(s + " ");
            }
            System.out.println("");
        }
    }
}
