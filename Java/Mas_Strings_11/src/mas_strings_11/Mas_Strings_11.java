/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_11;

import java.util.Scanner;

/**
 *
 * @author anxo
 */
public class Mas_Strings_11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        String texto, textoCodificado;
        String voc = "AEIOUaeiou";
        String vocRplc = "0123401234";
        String nums = "0123456789";
        String numsRplc = "=¡-¨$%&/()";
        String cons = " BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";

        System.out.print("Introduzca el texto a codificar: ");
        texto = entrada.nextLine();

        textoCodificado = "";

        for (int i = 0; i < texto.length(); i++) {
            int contador = 0;
            for (int j = 0; j < cons.length(); j++) {
                if (texto.charAt(i) == cons.charAt(j)) {
                    if (texto.charAt(i) == ' ') {
                        textoCodificado += " ";
                    } else if (texto.charAt(i) == 'Z') {
                        textoCodificado += 'B';
                    } else if (texto.charAt(i) == 'z') {
                        textoCodificado += 'b';
                    } else {
                        textoCodificado += cons.charAt(j + 1);
                    }
                } else if (contador < 10) {
                    if (texto.charAt(i) == voc.charAt(contador)) {
                        textoCodificado += vocRplc.charAt(contador);
                    } else if (texto.charAt(i) == nums.charAt(contador)) {
                        textoCodificado += numsRplc.charAt(contador);
                    }
                }
                contador++;
            }
        }
        System.out.println(textoCodificado);

    }

}
