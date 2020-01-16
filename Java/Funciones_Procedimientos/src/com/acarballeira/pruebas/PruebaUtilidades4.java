/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acarballeira.pruebas;

/**
 *
 * @author Anxo Portela-Insua Blanco &#60; anxoportela@gmail.com &#62;
 * @version 1.0
 *
 */

import static com.acarballeira.ArUtilidades.*;
import java.util.Arrays;
        
public class PruebaUtilidades4 {
    
    public static void main(String[] args) {
        int [] vector = {2,3,4,5,6};
        //System.out.println(Arrays.toString(generaVector(5,3,9)));
        //muestraVector(generaVector(5,3,9),"-");
        System.out.println(Arrays.toString(rotaDerechaVector(vector,4)));
        //System.out.println(rotaDerechaVector(vector,8));
    }

}
