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

public class AeR_191 {

    public static void main(String[] args) {
        
        int casos,compartimentos,litros,diferencia,litrosTotal;
        int contador1,contador2;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        casos = entrada.nextInt();

        
            for (contador1=1;contador1<=casos;contador1++){
                compartimentos = entrada.nextInt();
                litros = entrada.nextInt();
                diferencia = entrada.nextInt();
                litrosTotal=0;
                for (contador2=0;contador2<compartimentos;contador2++){
                    litrosTotal += litros - (diferencia*contador2);
                }
                System.out.println(litrosTotal);
        }
    }
}
