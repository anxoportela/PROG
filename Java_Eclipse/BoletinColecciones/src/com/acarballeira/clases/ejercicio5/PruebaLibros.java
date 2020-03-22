package com.acarballeira.clases.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

import com.acarballeira.clases.ejercicio6.*;

/**
 *
 * @author dual108
 * @date 31 ene. 2020
 * @version 1.0
 *
 */

public class PruebaLibros {

	private static final byte INCREMENTO_CODIGO = 5;

	public static void main(String[] args) {

		ArrayList<Libro> biblioteca = new ArrayList<Libro>();
		int opcion;
		int contador = 0;
		int contadorCodigo = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print(
					"\nBIBLIOTECA DA CARBALLEIRA\n=========================\n1. Listado\n2. Novo libro\n3. Modificar\n4. Borrar\n5. Sair\nIntroduzca unha opción: ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				listar(biblioteca);
				break;
			case 2:
				contadorCodigo += INCREMENTO_CODIGO;
				nuevoLibro(biblioteca, contador, contadorCodigo);
				contador++;
				break;
			case 3:
				System.out.print("Introduzca el código del libro a editar: ");
				editarLibro(biblioteca, sc.nextInt());
				break;
			case 4:
				System.out.print("Introduzca el código del libro a borrar: ");
				borrarLibro(biblioteca, sc.nextInt());
				break;
			default:
				break;
			}

		} while (opcion != 5);

		sc.close();

	}

	public static void listar(ArrayList<Libro> biblioteca) {

		System.out.println("\nLISTADO\n========");
		for (Libro x : biblioteca) {
			System.out.println(x);
		}

	}

	public static void nuevoLibro(ArrayList<Libro> biblioteca, int contador, int contadorCodigo) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nLIBRO NUEVO\n===========\nIntroduzca los datos del libro.\nTítulo: ");
		String titulo = sc.nextLine();
		System.out.print("Autor: ");
		String autor = sc.nextLine();
		System.out.print("Editorial: ");
		String editorial = sc.nextLine();
		System.out.print("Número de páginas: ");
		int numPax = sc.nextInt();

		biblioteca.add(new Libro(titulo, autor, numPax, editorial, contadorCodigo));

	}

	public static void editarLibro(ArrayList<Libro> biblioteca, int codigo) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < biblioteca.size(); i++) {
			if (biblioteca.get(i).codigo == codigo) {
				System.out.print("\nEDITAR LIBRO\n===========\nIntroduzca los datos del libro.\nTítulo: ");
				String titulo = sc.nextLine();
				System.out.print("Autor: ");
				String autor = sc.nextLine();
				System.out.print("Editorial: ");
				String editorial = sc.nextLine();
				System.out.print("Número de páginas: ");
				int numPax = sc.nextInt();
				if (!titulo.equals("")) {
					biblioteca.get(i).titulo = titulo;
				}
				if (!autor.equals("")) {
					biblioteca.get(i).autor = autor;
				}
				if (!editorial.equals("")) {
					biblioteca.get(i).editorial = editorial;
				}
				if (numPax != 0) {
					biblioteca.get(i).numPaginas = numPax;
				}

				break;
			}
		}
	}

	public static void borrarLibro(ArrayList<Libro> biblioteca, int codigo) {
		for (int i = 0; i < biblioteca.size(); i++) {
			if (biblioteca.get(i).codigo == codigo) {
				biblioteca.remove(i);
			}
		}
	}

}
