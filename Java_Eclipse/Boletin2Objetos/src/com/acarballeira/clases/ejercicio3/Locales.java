package com.acarballeira.clases.ejercicio3;

/**
 *
 * @author dual108
 * @date 29 ene. 2020
 * @version 1.0
 *
 */

public class Locales extends Inmobiliaria {
	
	private int numVentanas;

	public Locales(String direccion, float metrosCuadrados, Estado estadoInmueble, float precioBase, int anos,
			int numVentanas) {
		super(direccion, metrosCuadrados, estadoInmueble, precioBase, anos);
	    numVentanas = numVentanas;
	}

	public int getNumVentanas() {
		return numVentanas;
	}

	public void setNumVentanas(int numVentanas) {
		numVentanas = numVentanas;
	}
	
	public double precioFinal() {
		double res = super.precioFinal();
		if (getMetrosCuadrados()>50) {
			res+=res*=0.01;
		}
		if (getNumVentanas()<=1) {
			res-=res*=0.02;
		}
		if (getNumVentanas()>4) {
			res+=res*=0.04;
		}
		return res;
	}

	
}
