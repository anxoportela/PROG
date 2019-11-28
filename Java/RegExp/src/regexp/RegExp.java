/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexp;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class RegExp {

    public static void main(String[] args) {
        
        String texto = "Anxo";
        
        if (texto.matches("")){
            System.out.println("Coincide");
        } else {
            System.out.println("No coincide");
        }
    }
    
}
