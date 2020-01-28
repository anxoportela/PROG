package com.acarballeira.clases.ejercicio2;

/**
 *
 * @author dual108
 * @date 28 ene. 2020
 * @version 1.0
 *
 */

public class Profesores extends Empleados {
	
	private String departamento;

	public Profesores(String nombre, String dni, Estado_Civil estadocivil, int ano, int despacho,
			String departamento) {
		super(nombre, dni, estadocivil, ano, despacho);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return String.format("Profesor de: %s%n%s",departamento,super.toString());
	}

}
