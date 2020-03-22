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
	BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		int opcion = 0;
		DiccionarioDriver d = new DiccionarioDriver();		
		
		do {			
			opcion = d.menu();
			d.procesaOpcion(opcion);			  
		} while (opcion != 5);

	}

	public int menu() {

		String opcion;

		System.out.println(
				"DICCIONARIO\n-----------\n1. Consultar traducci�n\n2. A�adir traducci�n\n3. Vaciar diccionario\n4. A�adir datos de prueba\n5. Salir");
		System.out.print("Introduzca la opcion a usar: ");

		try {
			opcion = bReader.readLine();
			return Integer.parseInt(opcion);
		} catch (IOException e) {
			System.out.println("Opci�n no v�lida");
			return 0;
		} catch (NumberFormatException e) {
			System.out.println("Error indicando opci�n");
			return 0;
		}

	}

	public void crearTerminosPrueba() throws IOException {

		d.add("Blanco", "White");
		d.add("Negro", "Black");
		d.add("Naranja", "Orange");
		d.add("Azul", "Blue");
		d.add("Rojo", "Red");

	}
	
public void procesaOpcion(int opcion) throws IOException {
		
		String esp;
		String ing;
		
		switch(opcion) {
			case 1:
				System.out.print("Introduzca el término que quiera traducir: ");
				esp = bReader.readLine();
				System.out.println(d.trad(esp));
				break;
			case 2:
				System.out.print("Introduzca el término: ");
				esp = bReader.readLine();
				System.out.print("Introduzca la traducción: ");
				ing = bReader.readLine();
				d.add(esp, ing);
				break;
			case 3:
				d.del();
				break;
			case 4:
				crearTerminosPrueba();
				break;
			case 5:
				break;
			default:
				break;
		}
		
	}
	
	
}
