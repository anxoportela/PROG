/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_3;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class Mas_Strings_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        StringTokenizer st = new StringTokenizer(frase);
        System.out.println("Número de palabras: " + st.countTokens());
    }

}
