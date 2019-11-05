/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles_repaso;

/**
 *
 * @author anxo
 */

import java.util.Scanner;

public class Bucles_Repaso_12 {
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        int num,alto,lado,espacios,contador,contadorAux;
        
        num = entrada.nextInt();
        contador = 1;
        for (alto=1;alto<=num;alto+=1){
            contadorAux = contador;
            for (espacios=(num-alto);espacios>0;espacios--){
                System.out.print(" ");
            }
            for (lado=1;lado<=contador;lado++){
                if (contadorAux>=10){
                    contadorAux=0;
                }
                System.out.print(contadorAux);
                contadorAux++;
            }
            contadorAux=contadorAux-2;
            for (lado=(contador-1);lado>0;lado--){
                System.out.print(contadorAux);
                contadorAux--;
                if (contadorAux<0){
                    contadorAux=9;
                }
            }
            System.out.println("");
            contador+=1;
        }
        
    }
    
}
