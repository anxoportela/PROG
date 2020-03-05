package com.acarballeira.exame.Anxo.exercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author dual108
 * @date 28 feb. 2020
 * @version 1.0
 *
 */

public class App implements Utilidades {

	public static void main(String[] args) {
		
		String s = "C:\\Users\\dual108\\Documents\\GitHub\\PROG\\Archivos\\lectura.txt";
		File f = new File(s);
		
		String prueba[] = palabrasSenRepeticion(f);
		
		for (int i = 0; i < prueba.length; i++) {
			System.out.println(prueba[i]);
		}
		
	}

	public static String [] palabrasSenRepeticion(File f) {
		String salidaString[] = null;
		String salidaStringFinal[] = null;
		String salida;
		HashMap<String, Integer> ordenar = new HashMap<String, Integer>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			while ((salida = br.readLine()) != null) {
				salidaString = salida.split(" ");
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < salidaString.length; i++) {
			ordenar.put(salidaString[i], i);
		}
		
		return ordenar.toString();
	}
	
}
