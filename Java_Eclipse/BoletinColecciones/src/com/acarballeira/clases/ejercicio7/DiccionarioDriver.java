package com.acarballeira.clases.ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author dual108
 * @date 13 feb. 2020
 * @version 1.0
 *
 */

public class DiccionarioDriver {
	
	private Diccionario d;
	
	public static void main(String[] args) {
		
		
	}
	
	public void menu() {
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String opcion;
		
		System.out.println("DICCIONARIO\n-----------\n1. Consultar traducción\n2. Añadir traducción\n3. Vaciar diccionario\n4. Añadir datos de prueba\n5. Salir");
		System.out.print("Introduzca la opcion a usar: ");
		
		try {
			opcion = bReader.readLine();
			return Integer.parseInt(opcion);
		} catch (IOException e) {
			System.out.println("Opción no válida");
			return 0;
		} catch (NumberFormatException e) {
			System.out.println("Error indicando opción");
			return 0;
		}
		
		
		
	}
}
