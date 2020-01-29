package com.acarballeira.clases.ejercicio4;

/**
 *
 * @author dual108
 * @date 29 ene. 2020
 * @version 1.0
 *
 */

public class Triangulo extends Figura {
	
	public double base;
	public double altura;

	public Triangulo(String nombre, double base, double altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double obtenerArea() {
		return (base*altura)/2;
	}

	@Override
	public double obtenerVolumen() {
		return 0;
	}

}
