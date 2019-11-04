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

public class Bucles_Repaso_3 {

    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        double nota;
        
        nota = entrada.nextDouble();
        
        if(nota >=0 && nota<5){
            System.out.println("Suspenso");
        } else if(nota>=5 && nota<6){
            System.out.println("Suficiente");
        } else if(nota>=6 && nota<7){
            System.out.println("Bien");
        } else if(nota>=7 && nota<9){
            System.out.println("Notable");
        } else if(nota>=9 && nota<=10){
            System.out.println("Sobresaliente");
        } else {
            System.out.println("La nota introducida no es válida");
        }
    }
}
