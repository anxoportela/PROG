/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_arrays_8_anxo;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
import java.util.Arrays;

public class Mas_Arrays_8_Anxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3, 4};
        int[] arr3 = new int[]{5, 6, 7, 8};
        String[] arr4 = new String[]{"a", "b", "c", "d"};

        for (int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println("");
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son distintos");
        }
        System.out.println("");
        
        for (int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (int x : arr3) {
            System.out.print(x + " ");
        }
        System.out.println("");
        if (Arrays.equals(arr1, arr3)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son distintos");
        }
        System.out.println("");
        
        for (int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (String x : arr4) {
            System.out.print(x + " ");
        }
        System.out.println("");
        if (Arrays.equals(arr1, arr3)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son distintos");
        }

    }

}
