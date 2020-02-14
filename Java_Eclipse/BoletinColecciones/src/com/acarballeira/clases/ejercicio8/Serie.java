package com.acarballeira.clases.ejercicio8;

import java.util.Objects;

/**
 *
 * @author dual108
 * @date 14 feb. 2020
 * @version 1.0
 *
 */

public class Serie implements Entregable, Comparable<Serie> {

	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		this.numTemporadas = 4;
		this.entregado = false;
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}



	@Override
	public int hashCode() {
		return Objects.hash(creador, entregado, genero, numTemporadas, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(creador, other.creador) && entregado == other.entregado
				&& Objects.equals(genero, other.genero) && numTemporadas == other.numTemporadas
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Serie [" + (titulo != null ? "titulo=" + titulo + ", " : "") + "numTemporadas=" + numTemporadas
				+ ", entregado=" + entregado + ", " + (genero != null ? "genero=" + genero + ", " : "")
				+ (creador != null ? "creador=" + creador : "") + "]";
	}
	
	@Override
	public void entregar() {
		this.entregado = true;
	}
	
	@Override
	public void devolver() {
		this.entregado = false;
	}
	
	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Serie o) {
		return this.numTemporadas - o.numTemporadas;
	}
	
}
