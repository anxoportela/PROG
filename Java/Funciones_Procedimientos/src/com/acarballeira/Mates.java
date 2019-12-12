/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acarballeira;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 *
 */
public class Mates {

    public static boolean esPrimo(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int x) {

        while (!esPrimo(x)) {
            ++x;
        }
        return x;
    }
    
    public static int digitos(int x){
        
        return Integer.toString(x).length();
    }
    
    public static int volteaS(int x){
        
        StringBuilder reves = new StringBuilder("");
        String num = Integer.toString(x);
        int resultado;
        
        for (int i=0; i<num.length();i++){
            reves.insert(0, num.charAt(i));
        }
        
        return Integer.parseInt(reves.toString());
        
    }
    
    public static int volteaS2(int x){
        
        StringBuilder num = new StringBuilder();
        return Integer.parseInt(num.append(x).reverse().toString());

    }
    
    public static int posicionDeDigito(int x, int y){
        
        int contador=0;
        
        while(Integer.toString(x).indexOf(Integer.toString(y))>-1){
            
        }
        
    }

}
