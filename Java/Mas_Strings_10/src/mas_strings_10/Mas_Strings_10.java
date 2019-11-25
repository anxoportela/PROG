/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_10;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
import java.util.Scanner;

public class Mas_Strings_10 {

    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in, "ISO-8859-1");

        String password;

        password = entrada.next();
    }

    public static boolean compruebaTamano(String x) {
        if (x.length() > 8) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean comprobacion(String x) {
        char[] minus = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] mayus = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        
        int contadorMinus,contadorMayus,contadorNums;
        contadorMinus=contadorMayus=contadorNums=0;
        
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < minus.length; j++) {
                if (nums[j] == x.charAt(i)){
                    contadorMinus++;
                    break;
            }
        }
    }
        if (contadorMinus>1){
            return true;
        } else {
            return false;
        }
        
}

}
