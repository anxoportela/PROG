package com.acarballeira.clases.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> vectorAleatorios = new ArrayList<Integer>();
		
		for (int i = 0; i < tamanoVector(); i++) {
			vectorAleatorios.add(numAleatorio());
		}
		
		System.out.print("El vector generado es: ");
		for (Integer integer : vectorAleatorios) {			
			System.out.print(integer + " ");
		}
		
		System.out.printf("%nEl número máximo del ArrayList es: %d",Collections.max(vectorAleatorios));
		System.out.printf("%nEl número mínimo del ArrayList es: %d",Collections.min(vectorAleatorios));
		System.out.printf("%nLa suma del ArrayList es: %d",vectorAleatorios.stream().mapToInt(Integer::intValue).sum());
		System.out.printf("%nLa media del ArrayList es: %d",vectorAleatorios.stream().mapToInt(Integer::intValue).sum()/vectorAleatorios.size());

	}

	public static int numAleatorio() {
		final int MAX = 100;
		final int MIN = 0;
		return (int) Math.round((Math.random() * ((MAX - MIN) + 1)) + MIN);
	}
	
	public static int tamanoVector() {
		final int MAX = 20;
		final int MIN = 10;
		return (int) Math.round((Math.random() * ((MAX - MIN) + 1)) + MIN);
	}

}
