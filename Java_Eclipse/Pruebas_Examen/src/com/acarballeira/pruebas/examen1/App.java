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

		lista.add(new Persona("sdfdsf","sdfgdfg",23,"2345345f"));
		lista.add(new Persona("sdfdsf","sdfgdfg",27,"2345345f"));
		lista.add(new Persona("sdfdsf","sdfgdfg",21,"2345345f"));
		lista.add(new Persona("sdfdsf","sdfgdfg",22,"2345345f"));
		lista.add(new Persona("sdfdsf","sdfgdfg",30,"2345345f"));
		generaMenu();

	}
	
	public static ArrayList<Persona> lista = new ArrayList<Persona>();
	
	public static void generaMenu() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int opcion;
		System.out.printf("Opciones\n\n1. Listar personas\n2. Añadir personas\n3. Borrar personas\n4. Filtrar personas\n5. Guarda txt\n0. Salir\n\nIntroduzca la opción deseada: ");
		try {
			opcion = br.read();
			opcionesMenu(opcion);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void opcionesMenu(int x) {

		char opcion = (char) x;
		switch (opcion) {
		case '1':
			listarPersonas();
			generaMenu();
			break;

		case '2':
			anadirPersonas();
			generaMenu();
			break;

		case '3':
			borraPersonas();
			generaMenu();
			break;

		case '4':
			filtraPersonas();
			generaMenu();
			break;
			
		case '5':
			guardarTxT();
			generaMenu();
			break;

		case '0':
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
			lista.add(new Persona(nombre,apellidos,edad,dni));
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void listarPersonas() {
		lista.forEach((p) -> System.out.println(p));
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void borraPersonas() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Introduzca el index de la persona a borrar: ");
			String index = br.readLine();
			lista.remove(index);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void filtraPersonas() {		
		Collections.sort(lista, new ComparaEdad());
		lista.forEach((p) -> System.out.println(p));
		
	}
	
	public static void guardarTxT() {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter("texto.txt"));
			lista.forEach((p) -> {
				try {
					bw.write(p.getNombre());
					bw.newLine();
					bw.write(p.getApellidos());
					bw.newLine();
					bw.write(p.getEdad());
					bw.newLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
