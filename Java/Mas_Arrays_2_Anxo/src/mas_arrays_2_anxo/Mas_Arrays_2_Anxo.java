/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_arrays_2_anxo;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */

import java.util.Scanner;

public class Mas_Arrays_2_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada;
        entrada = new Scanner(System.in);
        String[] vectorMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciewmbre"};
        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        int mesBuscar;
        
        System.out.print("Introduzca el número de mes: ");
        mesBuscar = entrada.nextInt();
        mesBuscar--;
        
        System.out.printf("El mes es %s y tiene %d dias.\n", vectorMeses[mesBuscar], diasMes[mesBuscar]);
        
        
    }
    
}
