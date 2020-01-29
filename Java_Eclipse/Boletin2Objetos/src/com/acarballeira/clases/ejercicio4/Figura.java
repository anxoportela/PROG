package com.acarballeira.clases.ejercicio4;

/**
 *
 * @author dual108
 * @date 29 ene. 2020
 * @version 1.0
 *
 */

public abstract class Figura {
	
	private String nombre;
	public abstract double obtenerArea();
	public abstract double obtenerVolumen();
	
	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

}
