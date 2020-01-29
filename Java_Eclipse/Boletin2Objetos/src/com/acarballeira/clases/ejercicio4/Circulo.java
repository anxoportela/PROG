package com.acarballeira.clases.ejercicio4;

/**
 *
 * @author dual108
 * @date 29 ene. 2020
 * @version 1.0
 *
 */

public class Circulo extends Figura {
	
	public double radio;

	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}

	@Override
	public double obtenerArea() {
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public double obtenerVolumen() {
		return 0;
	}

}
