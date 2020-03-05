package com.acarballeira.exame.Anxo.exercicio1;

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

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Carreira c1 = new Carreira();

	public static void main(String[] args) {
		
		menu();

	}
	
	public static void crearDatosProba() {
		
		Participante p1 = new Participante("Luis", "Perez", "Luison", 45);
		Participante p2 = new Participante("Maria", "Perez", "Mary", 7);
		Participante p3 = new Participante("Rosa", "Perez", "Rosy", 16);
		Participante p4 = new Participante("Marcos", "Perez", "Mark", 14);
		Intolerante i1 = new Intolerante("Alejandro", "Rodriguez", "Alex", 15, "Lactosa");
		Discapacitado d1 = new Discapacitado("manuel", "Rodriguez", "Manu", 22, "Lactosa");
		
		c1.engadirParticipante(p1);
		c1.engadirParticipante(p2);
		c1.engadirParticipante(p3);
		c1.engadirParticipante(p4);
		c1.engadirParticipante(i1);
		c1.engadirParticipante(d1);
				
	}

	public static void menu() {
		char opcion;
		try {
			System.out.printf("\nMenú de opcións\n\na. Crear carreira e datos de proba\nb. Amosar corredores\nc. Ordenar carreira\nd. Engadir corredor\ne. Eliminar corredor\nf. Exportar carreira\ng. Saír\n\nIngrese a opción desexada: ");
			opcion = br.readLine().charAt(0);
			opcionesMenu(opcion);
		} catch (NumberFormatException e) {
			System.out.println("\nProducíuse un erro: " + e.getMessage());
			menu();
		} catch (IOException e) {
			System.out.println("\nProducíuse un erro: " + e.getMessage());
			menu();
		}

	}

	public static void opcionesMenu(char opcion) {

		switch (opcion) {
		case 'a':
			crearDatosProba();
			menu();
			break;

		case 'b':
			System.out.println(c1);
			menu();
			break;

		case 'c':
			menu();
			break;

		case 'd':
			try {
				System.out.print("Introduzca Nome: ");
				String nomString = br.readLine();
				System.out.print("Introduzca Apelidos: ");
				String apeString = br.readLine();
				System.out.print("Introduzca Nick: ");
				String nickString = br.readLine();
				System.out.print("Introduzca Idade: ");
				int edadInt = Integer.parseInt(br.readLine());
				c1.engadirParticipante(new Participante(nomString, apeString, nickString, edadInt));
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
				menu();
			} catch (IOException e1) {
				e1.printStackTrace();
				menu();
			}			
			menu();
			break;

		case 'e':
			try {
				System.out.print("Introduzca Nome do corredor a borrar: ");
				String nomBorrar = br.readLine();
								
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
				menu();
			} catch (IOException e1) {
				e1.printStackTrace();
				menu();
			}			
			menu();
			break;
			
		case 'f':
			menu();
			break;
			
		case 'g':
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		default:
			menu();
			break;
		}

	}

}
