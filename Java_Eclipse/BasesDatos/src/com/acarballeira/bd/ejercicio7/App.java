package com.acarballeira.bd.ejercicio7;

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
		
		ClienteDAO c;
		c= new ClienteDAO();

		switch (opcion) {
		case 1:
			ArrayList<Usuario> l = (ArrayList<Usuario>) c.obter();
			l.forEach(p -> System.out.println(p));
			generaMenu();
			break;

		case 2:
			try {
				System.out.print("Introduzca el nombre del cliente: ");
				String nom = br.readLine();
				System.out.print("Introduzca los apellidos del cliente: ");
				String ape = br.readLine();
				Usuario c2 = new Usuario(nom,ape);
				c.rexistrar(c2);
			} catch (IOException e) {
				e.printStackTrace();
				generaMenu();
			}
			generaMenu();
			break;

		case 3:
			try {
				System.out.print("Introduzca el id del cliente: ");
				int id = Integer.parseInt(br.readLine());
				System.out.print("Introduzca el nuevo nombre del cliente: ");
				String nom = br.readLine();
				System.out.print("Introduzca el nuevo apellido del cliente: ");
				String ape = br.readLine();
				Usuario c3 = new Usuario(nom,ape);
				c3.setIdCliente(id);
				c.actualizar(c3);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				generaMenu();
			} catch (IOException e) {
				e.printStackTrace();
				generaMenu();
			}
			generaMenu();
			break;

		case 4:
			try {
				System.out.print("Introduzca el id del cliente: ");
				int id = Integer.parseInt(br.readLine());
				Usuario c4 = new Usuario();
				c4.setIdCliente(id);
				c.eliminar(c4);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				generaMenu();
			} catch (IOException e) {
				e.printStackTrace();
				generaMenu();
			}
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
