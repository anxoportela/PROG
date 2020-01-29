package com.acarballeira.clases.ejercicio4;

/**
 *
 * @author dual108
 * @date 29 ene. 2020
 * @version 1.0
 *
 */

public class Cilindro extends Figura{
	
	private double radio;
	private double altura;

	public Cilindro(String nombre, double radio, double altura) {
		super(nombre);
		this.radio = radio;
		this.altura = altura;
	}

	@Override
	public double obtenerArea() {
		return 2*Math.PI*radio*(radio+altura);
	}

	@Override
	public double obtenerVolumen() {
		return Math.PI*Math.pow(radio, 2)*altura;
	}

}
