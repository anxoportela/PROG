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

public class AeR_148 {
    
    public static void main(String[] args) {
    
    String horaCompleta;
    String hora,min;
    int horaTotal,minTotal,restoDia;
    int dia = 1440;
    
    Scanner entrada;
    entrada = new Scanner(System.in);
    
        do {
            horaCompleta = entrada.next();
            hora = horaCompleta.substring(0, 2);
            min = horaCompleta.substring(3);
    
            horaTotal = Integer.parseInt(hora)*60;
            minTotal = Integer.parseInt(min);
            restoDia = dia - (horaTotal+minTotal);
                if (horaTotal>0 || minTotal>0){
                    System.out.println(restoDia);
                }
        } while (horaTotal>0 || minTotal>0); 
    }
}
