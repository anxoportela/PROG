package com.acarballeira.Boletin1Objetos.ejercicio2;

public class Arbol {
	
	public double altura;
	public int ano;
	public String concello;
	public String nombreComun;
	public String nombreLatino;
	public Hojas hojas;
	private static int numArboles = 0;	

	protected Arbol(double altura, int ano, String concello, String nombreComun, String nombreLatino, Hojas hojas) {
		super();
		this.altura = altura;
		this.ano = ano;
		this.concello = concello;
		this.nombreComun = nombreComun;
		this.nombreLatino = nombreLatino;
		this.hojas = hojas;
		numArboles++;
	}

	public static int getNumArboles() {
		return numArboles;
	}

	public String toString() {
		return String.format("------------------------------%n|Nombre: %s%n|Nombre Latino: %s%n|Tipo de Hoja: %s%n|Altura: %f%n|Ayuntamiento: %s%n|Año nacimiento: %d%n------------------------------", this.nombreComun, this.nombreLatino,this.hojas,this.altura,this.concello,this.ano);
	}	
	
}
