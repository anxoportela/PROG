package com.acarballeira.excepciones.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

import excepciones.ExcepcionPropia;

/**
 *
 * @author dual108
 * @date 18 feb. 2020
 * @version 1.0
 *
 */

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
			try {
				throw new ExcepcionPropia("Fallo propio");
			} catch (ExcepcionPropia e) {
				System.out.println(e.getMessage());
			}		
		
	}

}
