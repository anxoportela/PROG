/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author dual108
 */
public class CalcDescuento {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        int unidades;
        double precio;
        double DES1 = 0.1;
        double DES2 = 0.05;
        
        System.out.print("Introduzca el precio unitario: ");
        precio = entrada.nextInt();
        System.out.print("Introduzca la cantidad de unidades: ");
        unidades = entrada.nextInt();
        
        if (unidades>20){
            precio-=(precio*DES1);
            precio*=unidades;
        } else if (unidades>=10 && unidades<=20){
            precio-=(precio*DES2);
            precio*=unidades;
        } else {
            precio*=unidades;
        }
   
        System.out.printf( "Precio final %,.2f\n", precio);
    }
}