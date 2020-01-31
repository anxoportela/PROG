package com.acarballeira.exame.Anxo.exercicio1;

/**
 *
 * @author dual108
 * @date 31 ene. 2020
 * @version 1.0
 *
 */

public class Sendero extends Via {

	private boolean estaPavimentada = false;

	public Sendero() {
		super();
	}

	public Sendero(String codigo, TipoTitularidade titular, double numKM, double numKmDeficientes, int ancho, boolean estaPavimentada) {
		super(codigo, titular, numKM, numKmDeficientes, ancho);
		this.estaPavimentada = estaPavimentada;
	}
	
	public boolean isEstaPavimentada() {
		return estaPavimentada;
	}

	public void setEstaPavimentada(boolean estaPavimentada) {
		this.estaPavimentada = estaPavimentada;
	}

	@Override
	public double costeMantemento() {
		if(estaPavimentada) {
			return numKM*110.15;
		} else {
			return numKM*145.45;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%sTipo de via: Sendero%nPavimentada: %s%nPrecio Mantenimiento: %.2f%n", super.toString(),estaPavimentada,costeMantemento());
	}

}
