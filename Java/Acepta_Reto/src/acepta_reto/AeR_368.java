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

public class AeR_368 {

    public static void main(String[] args) {
        
        double huevos,capacidad,multi;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        huevos = entrada.nextInt();
        capacidad = entrada.nextInt();
        
        if (huevos>0 || capacidad>0){
            do {
                multi = Math.ceil(huevos/capacidad);
                System.out.println((int) multi*10);
                huevos = entrada.nextInt();
                capacidad = entrada.nextInt();
            } while (huevos!=0 || capacidad!=0);
        }
    }  
}