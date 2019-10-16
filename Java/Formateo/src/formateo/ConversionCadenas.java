/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formateo;

/**
 *
 * @author dual108
 */
public class ConversionCadenas {
    
    public static void main(String[] args) {
        char caracter = 'A';
        String cadena = "Esta es también una cadena";
        Integer entero = 1234;
        
        System.out.printf( "%c\n", caracter );
        System.out.printf( "%s\n", "Esta es una cadena" );
        System.out.printf( "%s\n", cadena );
        System.out.printf( "%S\n", cadena );
        System.out.printf( "%s\n", entero );
    }
    
}
