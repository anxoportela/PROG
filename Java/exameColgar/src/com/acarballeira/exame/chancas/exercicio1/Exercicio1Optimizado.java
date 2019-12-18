/*
 * Documento creado no 2019 por DAWDU1.
 * CIFP A Carballeira. Proxecto exame no 07/12/2019.
 * Contido con licenciamento Creative Commons CC BY-NC-SA
 * Cualificación: 8
 */

package com.acarballeira.exame.chancas.exercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * TODO - Descrición da clase
 * Plantilla de exame
 * @author Julio Mosquera González "julio.mosquera@yahoo.es"
 * @version 1.0
 */
public class Exercicio1Optimizado {

    public static void main(String[] args) {
                
        //Zona de declaración
        //Entrada
        InputStream ip;        
        //Saída
        int numLinhas, numLinhasB, numLetras;
        //Operativa        
        Scanner sc;
        String linha;
        StringBuilder linhaProcesada;
        String [] vectorS;
        String signoPuntuacion;
        
        //Inicialización
        numLinhas = 0;
        numLinhasB = 0;
        numLetras = 0;
        
        //Declaración de obxectos
        ip = Exercicio1Optimizado.class.getResourceAsStream("/com/acarballeira/exame/chancas/recursos/texto.txt");                        
        sc = new Scanner(ip, "ISO-8859-1");
        
        while (sc.hasNext()) {
            linha = sc.nextLine();
            numLinhas++;            
            if (!linha.equals("")){                
                //Saco espazos en branco
                linha = linha.trim();
                vectorS = linha.split("\\s+");
                linhaProcesada = new StringBuilder();
                for (String s : vectorS) {
                    //Por se hai un signo de puntuación
                    if (s.matches(".*[\\.\\,\\;\\:]$")) { //Supoñemos só un signo de puntuación ao final                        
                        signoPuntuacion = s.substring(s.length() - 1);
                        s = s.substring(0, s.length() - 1);
                    } else {
                        signoPuntuacion = "";
                    }
                    numLetras += s.length();//Só conto as letras, sen os signos de puntuación
                    if (s.length() > 1) {
                        linhaProcesada.append(String.valueOf(s.charAt(0)).toUpperCase()).append(s.substring(1, s.length() - 1)).append(String.valueOf(s.charAt(s.length() - 1)).toUpperCase()).append(signoPuntuacion);
                    } else {
                        linhaProcesada.append(String.valueOf(s.charAt(0)).toUpperCase()).append(signoPuntuacion);
                    }
                    linhaProcesada.append(" ");
                }
                System.out.println(linhaProcesada.toString());
            } else {
                numLinhasB++;
            }                        
            
        }//while
        
        System.out.printf("%10s%n","********** Estatísticas ************");
        System.out.printf("|%-30s%4d|%n", "Número de liñas: ", numLinhas);
        System.out.printf("|%-30s%4d|%n", "Número de liñas en branco: ", numLinhasB);
        System.out.printf("|%-30s%4d|%n", "Número de liñas en branco: ", (numLetras / (numLinhas - numLinhasB)));        
        
    } //Fin main
} // Fin Exercicio1
