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
public class PuntoFlotante {
    
    public static void main(String[] args) {
        System.out.printf( "%e\n", 12345678.9 );
        System.out.printf( "%e\n", +12345678.9 );
        System.out.printf( "%e\n", -12345678.9 );
        System.out.printf( "%E\n", 12345678.9 );
        System.out.printf( "%f\n", 12345678.9 );
        System.out.printf( "%g\n", 12345678.9 );
        System.out.printf( "%G\n", 12345678.9 );
    }
    
}
