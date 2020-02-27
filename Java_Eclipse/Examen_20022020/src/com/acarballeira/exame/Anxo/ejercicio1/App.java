package com.acarballeira.exame.Anxo.ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * <p>La clase <b>App</b></p>
 *
 * @author Anxo Portela-Insua Blanco
 * @version 2.0
 * @date 23 feb. 2020
 */

public class App {

	static ArrayList<ContaBancaria> lista = new ArrayList<ContaBancaria>();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
	static String horaFormateada = dtf.format(LocalDateTime.now());

	/**
	 * Método principal.
	 * 
	 * @param args Sen argumentos de entrada
	 */
	public static void main(String[] args) {

		crearDatosProba();
		generaMenu();

	}

	/**
	 * Crear datos de proba.
	 */
	public static void crearDatosProba() {

		lista.add(new Tarxeta("Luis", "1", 2.5, 1200, "1", "Visa", TipoTarxeta.CREDITO));
		lista.add(new Tarxeta("Manuel", "2", 2.5, 1300, "2", "Visa", TipoTarxeta.DEBITO));
		lista.add(new Tarxeta("María", "3", 2.5, 200, "3", "4B", TipoTarxeta.MONEDEIRO));
		lista.add(new Tarxeta("Jose", "4", 2.5, 300, "4", "Visa", TipoTarxeta.CREDITO));
		lista.add(new Tarxeta("Rosa", "5", 2.5, 600, "5", "Mastercard", TipoTarxeta.CREDITO));
		lista.add(new Tarxeta("Pepe", "6", 2.5, 100, "6", "Visa", TipoTarxeta.DEBITO));
		lista.add(new Tarxeta("Alejandro", "7", 2.5, 25, "7", "4B", TipoTarxeta.MONEDEIRO));
		lista.add(new ContaBancaria("Carlos", "8", 2.5, 2200));
		lista.add(new ContaBancaria("Jesús", "9", 2.5, 2000));
		lista.add(new ContaBancaria("Iria", "10", 2.5, 1900));

	}

	/**
	 * Xerar o menú.
	 */
	public static void generaMenu() {

		int opcion;

		try {
			System.out.printf("\nMenú de opcións\n\n1. Transferencia\n2. Listar tarxetas ordeadas por saldo\n3. Listar contas por cliente\n4. Eliminar tarxeta\n5. Saír\n\nIngrese a opción desexada: ");
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

	/**
	 * Opcións do menú.
	 *
	 * @param opcion Número entre 1-5.
	 */
	public static void opcionesMenu(int opcion) {

		switch (opcion) {
		case 1:
			iniciaTransferencia();
			generaMenu();
			break;

		case 2:
			listarTarxetasPorSaldo();
			generaMenu();
			break;

		case 3:
			listarContasPorCliente();
			generaMenu();
			break;

		case 4:
			iniciaBorrado();
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

	/**
	 * Iniciar a transferencia.
	 *
	 */
	public static void iniciaTransferencia() {

		System.out.print("\nTransferencia Bancaria\n----------------------------\nIntroduza a conta de orixe: ");
		ContaBancaria numContaOrixe = null;
		try {
			String contaOrixe = br.readLine();

			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getNumeroConta().equals(contaOrixe)) {
					numContaOrixe = lista.get(i);
				}
			}
		} catch (IOException e) {
			System.out.println("\nProducíuse un erro: " + e.getMessage());
			generaMenu();
		}

		System.out.print("Introduza a conta de destino: ");
		ContaBancaria numContaDestino = null;
		try {
			String contaDestino = br.readLine();
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getNumeroConta().equals(contaDestino)) {
					numContaDestino = lista.get(i);
				}
			}
		} catch (IOException e) {
			System.out.println("\nProducíuse un erro: " + e.getMessage());
			generaMenu();
		}

		System.out.print("Introduza a cantidade a traspasar: ");
		double cantidade = 0;
		try {
			cantidade = (double) Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("\nProducíuse un erro: " + e.getMessage());
			generaMenu();
		} catch (IOException e) {
			System.out.println("\nProducíuse un erro: " + e.getMessage());
			generaMenu();
		}
		
		if(!numContaOrixe.equals(numContaDestino) && cantidade > 0) {
			transferencia(numContaOrixe, numContaDestino, cantidade);
		} else {
			System.out.println("Producíuse un erro na transferencia.");
			generaMenu();
		}

	}

	/**
	 * Método para realizar a transferencia.
	 *
	 * @param cargo     Conta de orixe.
	 * @param abono     Conta destino.
	 * @param cantidade Importe da transferencia.
	 */
	public static void transferencia(ContaBancaria cargo, ContaBancaria abono, double cantidade) {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("/home/anxo/GitHub/PROG/Archivos/transferencias.dat", true));
			String salida = horaFormateada + " Conta Cargo: " + cargo.numeroConta + " - Conta Abono: " + abono.numeroConta + ". Cantidade: " + cantidade;
			if (cargo.reintegro(cantidade) && abono.ingreso(cantidade)) {
				System.out.println("\nOperación correcta.\n");
				salida += " - Resultado operación: Correcto\r\n";
			} else {
				System.out.println("\nProducíuse un erro.\n");
				salida += " - Resultado operación: Incorrecto. Non hai saldo suficiente.\r\n";
			}
			bw.write(salida);
			bw.close();
		} catch (IOException e) {
			System.out.println("\nProducíuse un erro: " + e.getMessage());
			generaMenu();
		}

		generaMenu();

	}

	/**
	 * Listar as tarxetas por saldo.
	 */
	public static void listarTarxetasPorSaldo() {

		Collections.sort(lista, new ComparaSaldo());
		System.out.println("\nTarxetas ordeadas por saldo\n----------------------------");
		lista.forEach(p -> {
			if (p.getClass().equals(Tarxeta.class)) {
				System.out.println(p);
			}
		});

	}

	/**
	 * Listar as contas por cliente.
	 */
	public static void listarContasPorCliente() {

		Collections.sort(lista, new ComparaCliente());
		System.out.println("\nContas ordeadas por cliente\n----------------------------");
		lista.forEach(p -> System.out.println(p));

	}

	/**
	 * Inicio do borrado de tarxetas.
	 */
	public static void iniciaBorrado() {

		try {
			System.out.print("\nBorrado de tarxetas\n----------------------------\nIntroduza o número de tarxeta: ");
			String numTarxetaString = br.readLine();
			eliminarTarxeta(numTarxetaString);
		} catch (IOException e) {
			System.out.println("\nProducíuse un erro: " + e.getMessage());
			generaMenu();
		}

	}

	/**
	 * Método para borrar tarxeta.
	 *
	 * @param numTarxeta Número da tarxeta de crédito.
	 */
	public static void eliminarTarxeta(String numTarxeta) {

		boolean operacion = false;

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getClass().equals(Tarxeta.class)) {
				Tarxeta aux = (Tarxeta) lista.get(i);
				if (aux.getNumero().equalsIgnoreCase(numTarxeta)) {
					operacion = true;
					lista.remove(i);
				}
			}
		}

		System.out.println(operacion ? "\nResultado operación: Correcto." : "\nResultado operación: Incorrecto. A tarxeta non existe.");

	}

}
