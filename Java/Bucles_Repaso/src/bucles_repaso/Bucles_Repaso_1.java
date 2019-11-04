/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles_repaso;

/**
 *
 * @author dual108
 */

import java.util.Scanner;

public class Bucles_Repaso_1 {
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        int nota,aprobados,suspensos,contador,CONTADOR_MAX;
        CONTADOR_MAX=30;
        aprobados = 0;
        suspensos = 0;
        
        for (contador=0; contador<CONTADOR_MAX; contador++){
            nota = entrada.nextInt();
            if (nota < 5){
                suspensos+=1;
            } else {
                aprobados+=1;
            }
        }
        
        System.out.println("Hay " + aprobados + " aprobados");
        System.out.println("Hay " + suspensos + " suspensos");
        
        
        
    }
    
}
