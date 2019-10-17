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
public class PruebaIndiceArgumento {

       public static void main(String[] args) {
        System.out.printf(
            "Lista de parametros sin reordenar: %s %s %s %s\n",
             "primero", "segundo", "tercero", "cuarto");
        System.out.printf(
            "Lista de parametros despues de reordenar: %4$s %3$s %2$s %1$s\n",
             "primero", "segundo", "tercero", "cuarto");
    }
    
}
