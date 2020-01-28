package com.acarballeira.clases.ejercicio2;

/**
 *
 * @author dual108
 * @date 28 ene. 2020
 * @version 1.0
 *
 */

public class Estudiantes extends Personas {
	
	private int curso;

	public Estudiantes(String nombre, String dni, Estado_Civil estadocivil, int curso) {
		super(nombre, dni, estadocivil);
		this.curso = curso;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return String.format("Estudiante%nCurso: %d%n%s",curso,super.toString());
	}
	
}
