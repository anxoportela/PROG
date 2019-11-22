/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_2;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class Mas_Strings_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String resultado;
        int numeros;
        resultado = "";
        
        numeros = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
        
        for (int i = 0; i<numeros; i++){
            resultado+=args[2];
        }
        
        System.out.println(resultado);
        
    }
    
}
