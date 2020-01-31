package com.acarballeira.exame.Anxo.exercicio1;

/**
 *
 * @author dual108
 * @date 31 ene. 2020
 * @version 1.0
 *
 */

public class CicloVia extends Via {
	
	private String color = "#FFFFFF";

	public CicloVia() {
		super();
	}

	public CicloVia(String codigo, TipoTitularidade titular, double numKM, double numKmDeficientes, int ancho, String color) {
		super(codigo, titular, numKM, numKmDeficientes, ancho);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(!color.matches("^[\\#]+[0-9A-Zz-A]{6}")) {
			System.out.println("El color no está en formato Hexadecimal");
		} else {
			this.color = color;
		}
	}

	@Override
	public double costeMantemento() {
		return numKM*308.15;
	}
	
	@Override
	public String toString() {
		return String.format("%sTipo de via: CicloVia%nColor: %s%nPrecio Mantenimiento: %.2f%n", super.toString(),color,costeMantemento());

	}
	
	
	
}
