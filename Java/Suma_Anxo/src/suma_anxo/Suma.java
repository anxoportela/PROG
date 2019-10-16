/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_anxo;

/**
 *
 * @author dual108
 */

// Programa para mostrar la suma de dos números
import java.util.Scanner;


public class Suma {

    /**
     * @param args the command line arguments
     */
    
    // El método main empieza la ejecución de la aplicación en Java
    public static void main(String[] args) {
        // Creamos un objeto Scanner para obtener la entrada en lña ventada de comandos
        Scanner entrada = new Scanner( System.in );
        
        int numero1, // Primer número a sumar
            numero2, // Segundo número a sumar
            suma; // Suma de numero1 y numero2
        
        System.out.print( "Escriba el primer entero: " ); //Indicador
        numero1 = entrada.nextInt(); // Leemos el primer número
        
        System.out.print( "Escriba el segundo entero: " ); //Indicador
        numero2 = entrada.nextInt(); // Leemos el segundo número
        
        suma = numero1 + numero2; // Sumamos y almacenamos los numeros en la variable "suma"
        
        System.out.printf( "La suma es %d\n", suma ); // Mostramos la salida
    } //Fin main
} // Fin clase