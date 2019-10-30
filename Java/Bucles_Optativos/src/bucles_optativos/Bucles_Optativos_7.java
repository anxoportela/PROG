/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles_optativos;

/**
 *
 * @author dual108
 */

import java.util.Scanner;

public class Bucles_Optativos_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num,baseX,dividendo,resto,conversion,posicion;
        
        Scanner entrada;
        
        entrada = new Scanner(System.in);
        
        num = entrada.nextInt();
        baseX = entrada.nextInt();
        
        dividendo = num;
        posicion = 0;
        conversion = 0;
        
        while (dividendo != 0 && baseX<=10) {
            resto = dividendo % baseX;
            dividendo /= baseX;
            conversion += Math.pow((resto * 10),posicion);
            posicion += 1;
        }
        
        if (conversion != 0){
        System.out.println(conversion);
        }
        
    }
    
}
