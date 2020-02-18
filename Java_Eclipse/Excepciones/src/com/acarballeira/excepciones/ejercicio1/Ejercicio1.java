package com.acarballeira.excepciones.ejercicio1;

/**
 *
 * @author dual108
 * @date 18 feb. 2020
 * @version 1.0
 *
 */

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		try {
			throw new Exception("Va a romper");
		} catch (Exception e) {
			System.out.println("Tenemos una excepcion: " + e.getMessage());
		} finally {
			System.out.println("Esto se ejecuta siempre");
		}
	}

}
