package com.acarballeira.exame.Anxo.exercicio1;

/**
 *
 * @author dual108
 * @date 31 ene. 2020
 * @version 1.0
 *
 */

public class Estrada extends Via {
	
	private int numCarriles = 2;

	public Estrada() {
		super();
	}

	public Estrada(String codigo, TipoTitularidade titular, double numKM, double numKmDeficientes, int ancho,
			int numCarriles) {
		super(codigo, titular, numKM, numKmDeficientes, ancho);
		this.numCarriles = numCarriles;
	}

	public int getNumCarriles() {
		return numCarriles;
	}

	public void setNumCarriles(int numCarriles) {
		this.numCarriles = numCarriles;
	}

	@Override
	public double costeMantemento() {
		return numKM*206.03*numCarriles;
	}
	
	@Override
	public String toString() {
		return String.format("%sTipo de via: Estrada%nCarriles: %d%nPrecio Mantenimiento: %.2f%n", super.toString(),numCarriles,costeMantemento());
	}

}
