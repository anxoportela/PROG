/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author dual108
 */

import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        int dias,mes,ano;
        boolean bisiesto;
        dias=0;
        
        
        System.out.print("Introduzca un número de mes válido: ");
        mes = entrada.nextInt();
        System.out.print("Introduzca un número de año válido: ");
        ano = entrada.nextInt();
        bisiesto = false;
        
        if (ano%4==0 && (ano%100!=0 || ano%400==0)){
            bisiesto = true;
        }
        
        if (mes < 1 || mes > 12) {
            System.out.println("Introduzca un valor de mes válido");
        } else {
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10: 
                case 12:
                    dias+=31;
                    break;
                case 4: 
                case 6: 
                case 9: 
                case 11:
                    dias+=30;
                    break;
                case 2:
                    if (bisiesto) {
                        dias+=29;
                    } else {
                        dias+=28;
                    }
            }
        }
        System.out.println("El mes escogido tiene " + dias + " días.");
    }
}
