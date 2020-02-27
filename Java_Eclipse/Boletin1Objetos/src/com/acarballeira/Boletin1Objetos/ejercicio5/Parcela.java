package com.acarballeira.Boletin1Objetos.ejercicio5;

/**
 *
 * @author dual108
 * @date 24 ene. 2020
 * @version 1.0
 *
 */

public class Parcela {
	
	private double metros;
	private Coordenada puntoRef1;
	private Coordenada puntoRef2;
	
	public Parcela(double metros, Coordenada puntoRef1, Coordenada puntoRef2) {
		super();
		this.metros = metros;
		this.puntoRef1 = puntoRef1;
		this.puntoRef2 = puntoRef2;
	}

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public Coordenada getPuntoRef1() {
		return puntoRef1;
	}

	public void setPuntoRef1(Coordenada puntoRef1) {
		this.puntoRef1 = puntoRef1;
	}

	public Coordenada getPuntoRef2() {
		return puntoRef2;
	}

	public void setPuntoRef2(Coordenada puntoRef2) {
		this.puntoRef2 = puntoRef2;
	}

	@Override
	public String toString() {
		return "Parcela [metros=" + metros + ", puntoRef1=" + puntoRef1 + ", puntoRef2=" + puntoRef2 + "]";
	}
	
	

	
}
