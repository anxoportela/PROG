package com.acarballeira.Boletin1Objetos.ejercicio6;

import java.time.LocalDate;

public class ArbolesDriver_v3 {
	
	public static void main(String[] args) {
		
		Arbol pino = new Arbol(23.00, 2000, "Ramirás", "Pino", "Pinus Pinaster", Hojas.PERENNE);
		Arbol abeto = new Arbol(23.00, 2000, "Ramirás", "Pino", "Pinus Pinaster", Hojas.PERENNE);
		Arbol roble = new Arbol(23.00, 2000, "Ramirás", "Pino", "Pinus Pinaster", Hojas.PERENNE);
		Arbol sauce = new Arbol(23.00, 2000, "Ramirás", "Pino", "Pinus Pinaster", Hojas.PERENNE);
		
		System.out.println(pino);
		System.out.println(abeto);
		System.out.println(roble);
		System.out.println(sauce);
		
		System.out.println("El número total de árboles es: " + Arbol.getNumArboles());
		
		roble.transplantar(new Coordenada(2, 3));
		pino.transplantar(new Coordenada(4, 9), LocalDate.now());
	}
}
