package com.acarballeira.bd.ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author dual108
 * @date 18 feb. 2020
 * @version 1.0
 *
 */

public class App {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		
		generaMenu();
		
	}
	
	public static void generaMenu() {
		
		int opcion;

		try {
			System.out.printf("\nMenú de opcións\n\n1. Listado\n2. Novo cliente\n3. Modificar\n4. Borrar\n5. Saír\n\nIngrese a opción desexada: ");
			opcion = Integer.parseInt(br.readLine());
			if (opcion == 5) {
				br.close();
				opcionesMenu(opcion);
			} else {
				opcionesMenu(opcion);
			}
		} catch (NumberFormatException e) {
			System.out.println("\nProducíuse un erro: " + e.getMessage());
			generaMenu();
		} catch (IOException e) {
			System.out.println("\nProducíuse un erro: " + e.getMessage());
			generaMenu();
		}
	}
	
	public static void opcionesMenu(int opcion) {

		switch (opcion) {
		case 1:
			Cliente c1 = new Cliente();
			ArrayList<Cliente> l = (ArrayList<Cliente>) c1.obter();
			l.forEach(p -> System.out.println(p));
			generaMenu();
			break;

		case 2:
			Cliente c2 = new Cliente();
			System.out.println(c2.obter(2));
			generaMenu();
			break;

		case 3:
			//listarContasPorCliente();
			generaMenu();
			break;

		case 4:
			//iniciaBorrado();
			generaMenu();
			break;

		case 5:
			System.out.println("\n\nGracias por usar os nosos servicios\n");
			break;

		default:
			generaMenu();
			break;
		}

	}
}
