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

public class AeR_157 {

    public static void main(String[] args) {
        
        int casos,dia,mes,contador,resultado,ANO;
        ANO = 365;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        casos = entrada.nextInt();
        
        for (contador = 0; contador<casos; contador++){
            
            dia = entrada.nextInt();
            mes = entrada.nextInt();
            
            switch (mes){
                
                case 1:
                    resultado = ANO - dia;
                    System.out.println(resultado);
                    break;
                case 2:
                    resultado = ANO - 31 - dia;
                    System.out.println(resultado);
                    break;
                case 3:
                    resultado = ANO - 31 - 28 - dia;
                    System.out.println(resultado);
                    break;
                case 4:
                    resultado = ANO - 31*2 - 28 - dia;
                    System.out.println(resultado);
                    break;
                case 5:
                    resultado = ANO - 31*2 - 30 - 28 - dia;
                    System.out.println(resultado);
                    break;
                case 6:
                    resultado = ANO - 31*3 - 30 - 28 - dia;
                    System.out.println(resultado);
                    break;
                case 7:
                    resultado = ANO - 31*3 - 30*2 - 28 - dia;
                    System.out.println(resultado);
                    break;
                case 8:
                    resultado = ANO - 31*4 - 30*2 - 28 - dia;
                    System.out.println(resultado);
                    break;
                case 9:
                    resultado = ANO - 31*5 - 30*2 - 28 - dia;
                    System.out.println(resultado);
                    break;
                case 10:
                    resultado = ANO - 31*5 - 30*3 - 28 - dia;
                    System.out.println(resultado);
                    break;
                case 11:
                    resultado = ANO - 31*6 - 30*3 - 28 - dia;
                    System.out.println(resultado);
                    break;
                case 12:
                    resultado = ANO - 31*6 - 30*4 - 28 - dia;
                    System.out.println(resultado);
                    break;    
            }
            
            
        }
    }
    
}
