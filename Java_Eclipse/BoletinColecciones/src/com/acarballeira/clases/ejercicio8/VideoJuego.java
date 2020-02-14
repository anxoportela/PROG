package com.acarballeira.clases.ejercicio8;

import java.util.Objects;

/**
 *
 * @author dual108
 * @date 14 feb. 2020
 * @version 1.0
 *
 */

public class VideoJuego implements Entregable, Comparable<VideoJuego> {
	
	private String titulo;
	private int horasEst;
	private boolean entregado;
	private String genero;
	private String compania;
	
	public VideoJuego() {
		this.horasEst = 10;
		this.entregado = false;
	}

	public VideoJuego(String titulo, int horasEst) {
		this.titulo = titulo;
		this.horasEst = horasEst;
	}

	public VideoJuego(String titulo, int horasEst, boolean entregado, String genero, String compania) {
		this.titulo = titulo;
		this.horasEst = horasEst;
		this.entregado = entregado;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEst() {
		return horasEst;
	}

	public void setHorasEst(int horasEst) {
		this.horasEst = horasEst;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public int hashCode() {
		return Objects.hash(compania, entregado, genero, horasEst, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VideoJuego other = (VideoJuego) obj;
		return Objects.equals(compania, other.compania) && entregado == other.entregado
				&& Objects.equals(genero, other.genero) && horasEst == other.horasEst
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "VideoJuego [" + (titulo != null ? "titulo=" + titulo + ", " : "") + "horasEst=" + horasEst
				+ ", entregado=" + entregado + ", " + (genero != null ? "genero=" + genero + ", " : "")
				+ (compania != null ? "compania=" + compania : "") + "]";
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
	public int compareTo(VideoJuego o) {
		return this.horasEst - o.horasEst;
	}

}
