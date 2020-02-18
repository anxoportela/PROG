package com.acarballeira.excepciones.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dual108
 * @date 18 feb. 2020
 * @version 1.0
 *
 */

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int [] vector = {2,3,4,5};
		int n;
		boolean repetir = false;
		
		do {
			try {
				repetir =false;
				System.out.println("Introduzca un número entero > 0 y < " + vector.length + " ");
				n= entrada.nextInt();
				System.out.println("Valor en la posición " + n + " del array: " + vector[n]);
			} catch (InputMismatchException e) {
				entrada.nextLine();
				n=0;
				System.out.println("Debe introducir un valor entero");
				repetir=true;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Debe ser un número entero > 0 y < " + vector.length + " ");
				repetir=true;
			} catch (Exception e) {
				System.out.println("Error inesperado: " + e.getMessage());
				repetir = true;
			}
			
		} while (repetir);
		
		entrada.close();
		
		
	}

}
