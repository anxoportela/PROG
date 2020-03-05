package com.acarballeira.pruebas.examen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dual108
 * @date 28 feb. 2020
 * @version 1.0
 *
 */

public class App {
	
	public static void main(String[] args) {
		
	}
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void generaMenu() {
		int opcion;
		try {
			System.out.printf(
					"\nMenú de opcións\n\n1. Transferencia\n2. Listar tarxetas ordeadas por saldo\n3. Listar contas por cliente\n4. Eliminar tarxeta\n5. Saír\n\nIngrese a opción desexada: ");
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
			generaMenu();
			break;

		case 2:
			generaMenu();
			break;

		case 3:
			generaMenu();
			break;

		case 4:
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
