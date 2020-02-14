package com.acarballeira.clases.ejercicio8;

import java.util.ArrayList;

/**
 *
 * @author dual108
 * @date 14 feb. 2020
 * @version 1.0
 *
 */

public class AlquileresDriver {

	private static ArrayList<Entregable> videoteca = new ArrayList<Entregable>();
	
	public static void main(String[] args) {
		
		videoteca.add(new VideoJuego("Prueba", 10, false, "Accion", "Activision"));
		videoteca.add(new VideoJuego("Prueba2", 30, false, "Accion", "Activision"));
		videoteca.add(new VideoJuego("Prueba3", 10, false, "Accion", "Activision"));
		videoteca.add(new Serie("Prueba", 10, "Accion", "Activision"));
		videoteca.add(new Serie("Prueba2", 10, "Accion", "Activision"));
		
		for (Entregable string : videoteca) {
			System.out.println(string);
		}
		
		videoteca.get(1).entregar();
		videoteca.get(3).entregar();
		
		for (Entregable string : videoteca) {
			System.out.println(string);
		}

	}

}
