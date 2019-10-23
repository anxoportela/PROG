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

public class AeR_216 {
    
    public static void main(String[] args) {
        
        int casos,gotas,dia;
        int horas,minutos,segundos;
        int contador1;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        casos = entrada.nextInt();

        for (contador1=1;contador1<=casos;contador1++){
            gotas = entrada.nextInt();
            horas = gotas / 3600;
            minutos = (gotas % 3600) / 60;
            segundos = gotas % 60;
            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        }
        
    }
    
}
