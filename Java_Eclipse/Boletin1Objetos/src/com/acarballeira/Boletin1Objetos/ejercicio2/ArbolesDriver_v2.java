package com.acarballeira.Boletin1Objetos.ejercicio2;

public class ArbolesDriver_v2 {
	
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
	}
}
