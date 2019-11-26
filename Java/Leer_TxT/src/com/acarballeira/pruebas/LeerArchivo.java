/*
 * Documento creado en 2019 por DAWDU1
 * CIFP A Carballeira. Proyecto Leer_TxT el 15 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.acarballeira.pruebas;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 *
 */
public class LeerArchivo {

    public static void main(String[] args) {

        InputStream ficheiro = LeerArchivo.class.getResourceAsStream("texto.txt");
        Scanner entrada = new Scanner(ficheiro);

        while (entrada.hasNext()) {
            System.out.println(entrada.nextLine());
        }
        entrada.close();
    }
}
