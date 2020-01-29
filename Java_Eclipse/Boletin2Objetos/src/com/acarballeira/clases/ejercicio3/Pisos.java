package com.acarballeira.clases.ejercicio3;

/**
 *
 * @author dual108
 * @date 29 ene. 2020
 * @version 1.0
 *
 */

public class Pisos extends Inmobiliaria {
	
	private int numPiso;

	public Pisos(String direccion, float metrosCuadrados, Estado estadoInmueble, float precioBase, int anos,
			int numPiso) {
		super(direccion, metrosCuadrados, estadoInmueble, precioBase, anos);
		numPiso = numPiso;
	}

	public int getNumPiso() {
		return numPiso;
	}

	public void setNumPiso(int numPiso) {
		numPiso = numPiso;
	}
	
	public double precioFinal() {
		double res = super.precioFinal();
		if (numPiso>=3) {
			res+=res*=0.03;
		}
		return res;
	}

	@Override
	public String toString() {
		return "Pisos [" + (getDireccion() != null ? "getDireccion()=" + getDireccion() + ", " : "")
				+ (getEstadoInmueble() != null ? "getEstadoInmueble()=" + getEstadoInmueble() + ", " : "")
				+ "getPrecioBase()=" + getPrecioBase() + ", getAnos()=" + getAnos() + "]";
	}
	
	

}
