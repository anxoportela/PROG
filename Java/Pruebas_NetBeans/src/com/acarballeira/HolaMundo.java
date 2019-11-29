/* 
 * Documento creado en 2019 por DAWDU1
 * CIFP A Carballeira. Proyecto Pruebas_NetBeans_Generacion_Jars
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.acarballeira;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 *
 */

public class HolaMundo {
    public static void main(String[] args) {
        
        for(int i = 0; i<args.length;i++){
            System.out.println("Hola Mundo" + algo());
        }
        
    }
    
    static String algo(){
        String respuesta = "algo";
        return respuesta;
    }

}
