package com.acarballeira.Boletin1Objetos.ejercicio6;

import java.time.LocalDate;

public class Arbol {
	
	private double altura;
	private int ano;
	private String concello;
	private String nombreComun;
	private String nombreLatino;
	private Hojas hojas;
	private static int numArboles = 0;
	private Coordenada posicion;

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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getConcello() {
		return concello;
	}

	public void setConcello(String concello) {
		this.concello = concello;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreLatino() {
		return nombreLatino;
	}

	public void setNombreLatino(String nombreLatino) {
		this.nombreLatino = nombreLatino;
	}

	public Hojas getHojas() {
		return hojas;
	}

	public void setHojas(Hojas hojas) {
		this.hojas = hojas;
	}

	public static int getNumArboles() {
		return numArboles;
	}

	public Coordenada getPosicion() {
		return posicion;
	}

	public void setPosicion(Coordenada posicion) {
		this.posicion = posicion;
	}
	
	public void transplantar (Coordenada x) {
        setPosicion(x);
        System.out.println("La posición nueva del arbol es: " + x);
    }
	
	public void transplantar (Coordenada x, LocalDate y) {
        setPosicion(x);
        System.out.println("La posición nueva del arbol es: " + x + "\nLa fecha de transplantado es: " + y);
    }

	public String toString() {
		return String.format("------------------------------%n|Nombre: %s%n|Nombre Latino: %s%n|Tipo de Hoja: %s%n|Altura: %f%n|Ayuntamiento: %s%n|Año nacimiento: %d%n------------------------------", this.nombreComun, this.nombreLatino,this.hojas,this.altura,this.concello,this.ano);
	}	
	
}
