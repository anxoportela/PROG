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
public class PruebaBanderaParentesis {

    public static void main(String[] args) {
        System.out.printf( "%(d\n", 50 );
        System.out.printf( "%(d\n", -50 );
        System.out.printf( "%(.1e\n", -50.0 );
    }
    
}
