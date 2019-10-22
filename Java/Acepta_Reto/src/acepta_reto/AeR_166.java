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

public class AeR_166 {
    public static void main(String[] args) {
        
        int canalActual, canalDestino, pasoCanal;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        canalActual = entrada.nextInt();
        canalDestino = entrada.nextInt();
        
        while (canalActual != 0 || canalDestino != 0) {
        if (Math.abs(canalDestino - canalActual)>=50) {
            if (canalDestino>canalActual){
                pasoCanal = Math.abs(canalActual+99-canalDestino);
            } else {
                pasoCanal = Math.abs(canalDestino+99-canalActual);
            }
        } else {
            pasoCanal = Math.abs(canalDestino - canalActual);
        }
        System.out.println(pasoCanal);
        canalActual = entrada.nextInt();
        canalDestino = entrada.nextInt();
        } 
    }
}