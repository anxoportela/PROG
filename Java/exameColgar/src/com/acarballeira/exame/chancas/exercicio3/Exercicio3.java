/*
 * Documento creado no 2019 por DAWDU1.
 * CIFP A Carballeira. Proxecto exame no 08/12/2019.
 * Contido con licenciamento Creative Commons CC BY-NC-SA
 * Cualificación: 8
 */

package com.acarballeira.exame.chancas.exercicio3;

import java.util.Random;

/**
 * TODO - Descrición da clase
 * Plantilla de exame
 * @author Julio Mosquera González "julio.mosquera@yahoo.es"
 * @version 1.0
 */
public class Exercicio3 {
    
    static final int MAX = 50;
    static final int MIN = 10;

    public static void main(String[] args) {
    
        //Zona de declaración
        //Entradas
        //Saídas
        //Constantes
        int NUM;
        //Operativa
        double[] vector;
        
        //Inicialización
        NUM = 5;
        
        vector = xeneraVector(NUM);
        amosaVector(vector);
        System.out.println(tipoOrde(vector));
    }
    
    /**
     * 
     * @param v
     * @return. Se todos son iguais devolve Crecente 
     */
    static String tipoOrde(double[] v) {
        int numCrecente;
        int numDecrecente;
        
        numCrecente = numDecrecente = 0;
        
        for (int i = 1; i < v.length; i++) {
            if(v[i-1] >= v[i]) {
                numDecrecente++;
            }
            if(v[i-1] <= v[i]) {
                numCrecente++;
            }
        } //for
        
        if (numCrecente == v.length - 1) {
            return "Crecente";
        } else if (numDecrecente == v.length - 1) {
            return "Decrecente";
        } else {
            return "Sen orde";
        }
        
    }
    
    static double[] xeneraVector(int tamanho) {
        
        
        double[] v = new double[tamanho];
        Random aleatorio = new Random();
        
        for (int i = 0; i < tamanho; i++) {            
            v[i] = aleatorio.nextDouble() * (MAX - MIN) + MIN;
        } //for
        
        return v;
    }
    
    static void amosaVector(double[] v) {
        
        for( double d : v) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
