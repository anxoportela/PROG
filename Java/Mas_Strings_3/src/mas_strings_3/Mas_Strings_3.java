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
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       String frase;
//       System.out.print("Introduce una frase: ");
//       frase = sc.nextLine();
//       StringTokenizer st = new StringTokenizer(frase);
//       System.out.println("Número de palabras: " + st.countTokens());
//    }    
    public static void main(String s) {
        int contador = 1, pos;
        s = s.trim(); //eliminar los posibles espacios en blanco al principio y al final
        if (s.isEmpty()) { //si la cadena está vacía
            contador = 0;
        } else {
            pos = s.indexOf(" "); //se busca el primer espacio en blanco
            while (pos != -1) { //mientras que se encuentre un espacio en blanco
                contador++; //se cuenta una palabra
                pos = s.indexOf(" ", pos + 1); //se busca el siguiente espacio en blanco
            }                                               //a continuación del actual
        }
        return contador;
    }
}
