package com.acarballeira.clases.ejercicio2;

/**
 *
 * @author dual108
 * @date 28 ene. 2020
 * @version 1.0
 *
 */

public class Empleados extends Personas {
	
	private int ano;
	private int despacho;
	
	public Empleados(String nombre, String dni, Estado_Civil estadocivil, int ano, int despacho) {
		super(nombre, dni, estadocivil);
		this.ano = ano;
		this.despacho = despacho;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getDespacho() {
		return despacho;
	}

	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}
	
	@Override
	public String toString() {
		return String.format("Empleado%nAño de incorporacion: %d%nDespacho: %d%n%s",ano,despacho,super.toString());
	}

}
