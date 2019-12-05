/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex3_anxo;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author anxo
 */
public class Regex3_Anxo {

    public static void main(final String[] args) {

        final InputStream ficheiro = Regex3_Anxo.class.getResourceAsStream("texto.txt");
        final Scanner entrada = new Scanner(ficheiro);
        final String patronPuntos = "[.]";
        final String patronComas = "[,]";
        
        while (entrada.hasNext()) {
            System.out.println(entrada.nextLine().replaceAll(patronPuntos, ". ").replaceAll(patronComas, ", "));
        }
        entrada.close();
    }
    
}
