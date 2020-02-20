package com.acarballeira.pruebas.examen1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {

		lista.add(new Persona("ddfdsf", "adfgdfg", 23, "2345345f"));
		lista.add(new Persona("sdfdsf", "ddfgdfg", 27, "2345345f"));
		lista.add(new Persona("adfdsf", "sdfgdfg", 23, "2345345f"));
		lista.add(new Persona("fdfdsf", "sdfgdfg", 22, "2345345f"));
		lista.add(new Persona("gdfdsf", "sdfgdfg", 30, "2345345f"));
		generaMenu();

	}

	public static ArrayList<Persona> lista = new ArrayList<Persona>();

	public static void generaMenu() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String opcion;
		System.out.printf(
				"Opciones\n\n1. Listar personas\n2. Añadir personas\n3. Borrar personas\n4. Filtrar personas\n5. Guarda txt\n6. Listar por edad\n7. Borrar por edad\n0. Salir\n\nIntroduzca la opción deseada: ");
		try {
			opcion = br.readLine();
			opcionesMenu(opcion);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void opcionesMenu(String x) throws NumberFormatException, IOException {

		int opcion = Integer.parseInt(x);
		switch (opcion) {
		case 1:
			listarPersonas();
			generaMenu();
			break;

		case 2:
			anadirPersonas();
			generaMenu();
			break;

		case 3:
			borraPersonas();
			generaMenu();
			break;

		case 4:
			filtraPersonas();
			generaMenu();
			break;

		case 5:
			guardarTxT();
			generaMenu();
			break;

		case 6:
			listarPorEdad();
			generaMenu();
			break;

		case 7:
			borrarPorEdad();
			generaMenu();
			break;

		case 0:
			break;

		default:
			generaMenu();
			break;

		}
	}

	public static void anadirPersonas() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Introduzca el nombre: ");
			String nombre = br.readLine();
			System.out.print("Introduzca los apellidos: ");
			String apellidos = br.readLine();
			System.out.print("Introduzca la edad: ");
			int edad = Integer.parseInt(br.readLine());
			System.out.print("Introduzca el dni: ");
			String dni = br.readLine();
			lista.add(new Persona(nombre, apellidos, edad, dni));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void listarPersonas() {
		lista.forEach((p) -> System.out.println(p));
	}

	public static void borraPersonas() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Introduzca el index de la persona a borrar: ");
			int index = Integer.parseInt(br.readLine());
			lista.remove(index);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void filtraPersonas() {
		Collections.sort(lista, new ComparaEdad().thenComparing(new ComparaNombre()));
		lista.forEach((p) -> System.out.println(p));

	}

	public static void guardarTxT() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("texto.txt", true));
			lista.forEach((p) -> {
				String salida = "";
				salida += "Nombre: " + p.getNombre() + "\r\n";
				salida += "Apellidos: " + p.getApellidos() + "\r\n";
				salida += "Edad: " + p.getEdad() + "\r\n";
				salida += "Dni: " + p.getDni() + "\r\n";
				salida += "\r\n";
				try {
					bw.write(salida);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			bw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void listarPorEdad() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca la edad a buscar: ");
		int edad;
		try {
			edad = Integer.parseInt(br.readLine());
			lista.forEach((p) -> {
				if (p.getEdad() == edad) {
					System.out.println(p);
				}
			});
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void borrarPorEdad() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca la edad a buscar: ");
		int edad;
		edad = Integer.parseInt(br.readLine());		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getEdad() == edad) {
				lista.remove(i);
			}
		}

	}

}
