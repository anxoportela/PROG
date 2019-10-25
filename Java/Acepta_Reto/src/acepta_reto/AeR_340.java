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

public class AeR_340 {
    
    public static void main(String[] args) {
        
        int cuadHoriz,cuadVert,casos;
        int acumulador,contador;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        casos = entrada.nextInt();
        
        for(contador=1;contador<=casos;contador++){
            
            cuadHoriz = entrada.nextInt();
            cuadVert = entrada.nextInt();
            
            acumulador = (cuadVert+cuadHoriz) + (cuadHoriz*(cuadVert*2));
            
            System.out.println(acumulador);
        }
    }
    
}
