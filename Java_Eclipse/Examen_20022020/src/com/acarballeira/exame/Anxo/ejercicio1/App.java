package com.acarballeira.exame.Anxo.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;


/**
 *
 * @author dual108
 * @date 20 feb. 2020
 * @version 1.0
 *
 */

public class App {
	
	public static ArrayList<ContaBancaria> lista = new ArrayList<ContaBancaria>();
	
	public static void main(String[] args) {
		
		crearDatosProba();
		generaMenu();
		
	}
	
	public static void crearDatosProba() {
		lista.add(new Tarxeta("Luis", "1", 2.5, 1200, "1", "Visa", TipoTarxeta.CREDITO));
		lista.add(new Tarxeta("Manuel", "2", 2.5, 1300, "2", "Visa", TipoTarxeta.DEBITO));
		lista.add(new Tarxeta("Maria", "3", 2.5, 200, "3", "4B", TipoTarxeta.MONEDEIRO));
		lista.add(new Tarxeta("Jose", "4", 2.5, 300, "4", "Visa", TipoTarxeta.CREDITO));
		lista.add(new Tarxeta("Rosa", "5", 2.5, 600, "5", "Mastercard", TipoTarxeta.CREDITO));
		lista.add(new Tarxeta("Pepe", "6", 2.5, 100, "6", "Visa", TipoTarxeta.DEBITO));
		lista.add(new Tarxeta("Alejandro", "7", 2.5, 25, "7", "4B", TipoTarxeta.MONEDEIRO));
		lista.add(new ContaBancaria("Carlos", "8", 2.5, 2200));
		lista.add(new ContaBancaria("Jesús", "9", 2.5, 2000));
		lista.add(new ContaBancaria("Iria", "10", 2.5, 1900));
	}
	
	public static void generaMenu() {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int opcion;
		try {
			System.out.printf("Menú de opcións\n\n1. Transferencia\n2. Listar tarxetas ordeadas por saldo\n3. Listar tarxetas por cliente\n4. Eliminar tarxeta\n5. Saír\n\nIngrese a opción desexada: ");
			opcion = Integer.parseInt(br.readLine());
			opcionesMenu(opcion);
		} catch (NumberFormatException e) {
			System.out.println("Se ha producido un error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Se ha producido un error: " + e.getMessage());
		}
		
	}

	public static void opcionesMenu(int opcion) {
		
		switch (opcion) {
		case 1:
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			System.out.print("Introduzca a conta de orixe: ");
//			ContaBancaria numContaOrixe = br.readLine();
//			System.out.print("Introduzca a conta de destino: ");
//			ContaBancaria numContaDestino = br.readLine();
//			System.out.print("Introduzca a cantidade a traspasar: ");
//			double cantidade = (double) Integer.parseInt(br.readLine());
//			transferencia(numContaOrixe,numContaDestino,cantidade);
			generaMenu();
			break;
			
		case 2:
			listartarxetasPorSaldo();
			generaMenu();
			break;
			
		case 3:
			listarContasPorCliente();
			generaMenu();
			break;
			
		case 4:
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.print("Introduzca o numero de tarxeta: ");
				String numTarxetaString = br.readLine();
				eliminarTarxeta(numTarxetaString);
			} catch (IOException e) {
				System.out.println("Se ha producido un error: " + e.getMessage());
			}
			generaMenu();
			break;
			
		case 5:
			System.out.println("Gracias por usar os nosos servicios");
			break;
			
		default:
			generaMenu();
			break;
		}
		
	}


	public static void eliminarTarxeta(String numTarxeta) {
		
		for (int i = 0; i < lista.size(); i++) {
			
			if (lista.get(i).getNumeroConta() == numTarxeta) {
				lista.remove(i);
			}
			
		}
	}


	public static void listarContasPorCliente() {
		Collections.sort(lista, new ComparaCliente());
		lista.forEach(p -> System.out.println(p));
		
	}

	
	public static void listartarxetasPorSaldo() {
		
		Collections.sort(lista, new ComparaSaldo());
		lista.forEach(p -> System.out.println(p));
		
		
	}


	public static void transferencia(ContaBancaria cargo, ContaBancaria abono, double cantidade) {
		
	}

}
