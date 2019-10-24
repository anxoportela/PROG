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

public class AeR_239 {
    
    public static void main(String[] args) {
        
        int dias,emisoras,gts;
        int diasSalida,horasSalida,minutosSalida,segundosSalida;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        dias = entrada.nextInt();
        emisoras = entrada.nextInt();
        
        while (dias!=0 || emisoras!=0){
            
            gts = dias*emisoras*24*6;
            
            diasSalida = gts / 86400;
            horasSalida = (gts / 3600) % 24;
            minutosSalida = (gts / 60) % 60;
            segundosSalida = gts % 60;
            
            System.out.printf("%d:%02d:%02d:%02d\n", diasSalida, horasSalida, minutosSalida, segundosSalida);
            
            dias = entrada.nextInt();
            emisoras = entrada.nextInt();
                       
        }
        
    }
    
}
