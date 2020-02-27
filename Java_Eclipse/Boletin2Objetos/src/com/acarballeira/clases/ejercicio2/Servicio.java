package com.acarballeira.clases.ejercicio2;

/**
 *
 * @author dual108
 * @date 28 ene. 2020
 * @version 1.0
 *
 */

public class Servicio extends Empleados {
	
	private int seccion;

	public Servicio(String nombre, String dni, Estado_Civil estadocivil, int ano, int despacho, int seccion) {
		super(nombre, dni, estadocivil, ano, despacho);
		this.seccion = seccion;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return String.format("PAS%nSección: %d%n%s",seccion,super.toString());
	}
	
}
