/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formateo;

import java.util.Calendar;

/**
 *
 * @author dual108
 */
public class PruebaFechaHora {
    
    public static void main(String[] args) {
        Calendar fechaHora = Calendar.getInstance();
        
        System.out.printf( "%tc\n", fechaHora );
        System.out.printf( "%tF\n", fechaHora );
        System.out.printf( "%tD\n", fechaHora );
        System.out.printf( "%tr\n", fechaHora );
        System.out.printf( "%tT\n", fechaHora );
        
        System.out.printf( "%1$tA, %1$tB %1$td, %1$tY\n", fechaHora );
        System.out.printf( "%1$TA, %1$TB %1$Td, %1$TY\n", fechaHora );
        System.out.printf( "%1$ta, %1$tb %1$te, %1$ty\n", fechaHora );
        
        System.out.printf("%1$tH:%1$tM:%1$tS\n", fechaHora);
        System.out.printf("%1$tZ %1$tI:%1$tM:%1$tS %tp\n", fechaHora);
    }
    
}
