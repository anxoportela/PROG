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
        
        int casos,patas,anillos;
        int acumulador,contador1,contador2;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        casos = entrada.nextInt();
        
        acumulador=0;
        contador2=1;
        
        for(contador1=1;contador1<=casos;contador1++){
            if (contador2==1){
                patas = entrada.nextInt();
                acumulador+=patas*6;
                contador2+=1;
            } else if (contador2>0 && contador2<2){
                patas = entrada.nextInt();
                acumulador+=patas*8;
                contador2+=1;
            } else if (contador2>1 && contador2<3){
                patas = entrada.nextInt();
                acumulador+=patas*8;
                contador2+=1;
            } else {
                patas = entrada.nextInt();
                anillos = entrada.nextInt();
                acumulador+=patas*anillos*2;
            }
            System.out.println(acumulador);
        }
        
    }
    
}
