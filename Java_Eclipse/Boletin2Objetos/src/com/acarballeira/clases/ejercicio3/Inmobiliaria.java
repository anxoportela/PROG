package com.acarballeira.clases.ejercicio3;

/**
 *
 * @author dual108
 * @date 29 ene. 2020
 * @version 1.0
 *
 */

public class Inmobiliaria {

	private String direccion;
	private static double metrosCuadrados;
	private Estado estadoInmueble;
	protected static double precioBase;
	private static int anos;
	
	public Inmobiliaria(String direccion, float metrosCuadrados, Estado estadoInmueble, float precioBase, int anos) {
		super();
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.estadoInmueble = estadoInmueble;
		this.precioBase = precioBase;
		this.anos = anos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public static double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(float metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public Estado getEstadoInmueble() {
		return estadoInmueble;
	}

	public void setEstadoInmueble(Estado estadoInmueble) {
		this.estadoInmueble = estadoInmueble;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		Inmobiliaria.precioBase = precioBase;
	}

	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		Inmobiliaria.anos = anos;
	}
	
	public double precioFinal() {
		double res = 0;
		if (anos<15) {
			res=precioBase-=precioBase*0.01;
		} else {
			res =precioBase-=precioBase*0.02;
		}
		return res;
	}	
}