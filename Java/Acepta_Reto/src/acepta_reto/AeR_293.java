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

public class AeR_293 {

    public static void main(String[] args) {
        
        int casos,insectos,aracnidos,crustaceos,escolopendras,anillos;
        int acumulador,contador;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        casos = entrada.nextInt();
        
        for(contador=1;contador<=casos;contador++){
            insectos = entrada.nextInt();
            aracnidos = entrada.nextInt();
            crustaceos = entrada.nextInt();
            escolopendras = entrada.nextInt();
            anillos = entrada.nextInt();
            
            acumulador = (insectos*6)+(aracnidos*8)+(crustaceos*10)+(escolopendras*anillos*2);
            
            System.out.println(acumulador);
        }
        
    }
    
}
