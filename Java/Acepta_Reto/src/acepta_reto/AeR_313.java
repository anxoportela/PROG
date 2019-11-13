/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_reto;

/**
 *
 * @author anxo
 */

import java.util.Scanner;

public class AeR_313 {
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        int casos, saldoInicio, resto, contador;
        boolean beneficios;
        
        casos = entrada.nextInt();
        
        for (contador=0; contador<casos; contador ++){
            
            saldoInicio = entrada.nextInt();
            resto = entrada.nextInt();
            beneficios = false;
            
            if (saldoInicio+resto >= 0){
                beneficios = true;
            }
            
            if (beneficios){
                System.out.println("Si");
            } else {
                System.out.println("No");
            }
            
            
        }
        
    }
    
}
