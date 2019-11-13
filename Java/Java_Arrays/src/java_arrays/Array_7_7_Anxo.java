/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_arrays;

/**
 *
 * @author dual108
 */
public class Array_7_7_Anxo {

    public static void main(String[] args) {

        int[][] arreglo1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arreglo2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Los valores en el arreglo1 por fila son");
        imprimirArreglo(arreglo1);
        System.out.println("\nLos valores en el arreglo2 por fila son");
        imprimirArreglo(arreglo2);
    }

    public static void imprimirArreglo(int[][] arreglo) {
        for (int fila = 0; fila < arreglo.length; fila++) {
            for (int columna = 0; columna < arreglo[fila].length; columna++) {
                System.out.printf("%d ", arreglo[fila][columna]);
            }
            System.out.println();
        }

    }

}
