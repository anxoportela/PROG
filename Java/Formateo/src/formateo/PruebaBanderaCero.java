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
public class PruebaBanderaCero {
    
    public static void main(String[] args) {
        System.out.printf( "%+09d\n", 452);
        System.out.printf( "%09d\n", 452);
        System.out.printf( "% 09d\n", 452);
    }
    
}
