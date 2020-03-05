package com.acarballeira.pruebas.examen2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author dual108
 * @date 28 feb. 2020
 * @version 1.0
 *
 */

public class App {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Luis", "Pérez", 25, "44455566A");
		Persona p2 = new Persona("María", "Pérez", 21, "44455577A");
		Persona p3 = new Persona("Marcos", "Pérez", 29, "44488866A");
		
		HashMap<Integer, Persona> personaHashMap = new HashMap<>();
		
		personaHashMap.put(p1.getId(), p1);
		personaHashMap.put(p2.getId(), p2);
		personaHashMap.put(p3.getId(), p3);
		
		String file = "C:\\Users\\dual108\\Documents\\GitHub\\PROG\\Archivos\\prueba.dat";
		String entradaString = "";
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));		
			
			for (int i = 1; i <= personaHashMap.size(); i++) {
				entradaString += personaHashMap.get(i) + "\r\n";
			}
			bw.write(entradaString);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String salidaString = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while ((salidaString = br.readLine()) != null) {
				System.out.println(salidaString);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
