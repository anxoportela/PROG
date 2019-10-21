/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_reto;

/**
 *
 * @author dual108
 */

import java.util.Scanner;

public class AeR_164 {
    
    public static void main(String[] args) {
        
        int A1,A2,B1,B2;
        int base,altura,resultado;
        
        Scanner entrada;    
        entrada = new Scanner(System.in);
        
        do {            
            A1 = entrada.nextInt();
            A2 = entrada.nextInt();
            B1 = entrada.nextInt();
            B2 = entrada.nextInt();
            base = B1-A1;
            altura = B2-A2;
            resultado = base * altura;
            if ((A1<=B1) && (A2<=B2)) {
                System.out.println(resultado);
            }
        } while ((A1<=B1) && (A2<=B2));    
    }
}