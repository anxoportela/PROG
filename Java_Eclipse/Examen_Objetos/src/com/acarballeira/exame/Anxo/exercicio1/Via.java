package com.acarballeira.exame.Anxo.exercicio1;

/**
 *
 * @author dual108
 * @date 31 ene. 2020
 * @version 1.0
 *
 */

public abstract class Via {

	protected String codigo;
	protected TipoTitularidade titular = TipoTitularidade.LOCAL;
	protected double numKM;
	protected double numKmDeficientes;
	protected int ancho;

	public Via() {
		super();
	}

	public Via(String codigo, TipoTitularidade titular, double numKM, double numKmDeficientes, int ancho) {
		super();
		this.codigo = codigo;
		this.titular = titular;
		this.numKM = numKM;
		this.numKmDeficientes = numKmDeficientes;
		this.ancho = ancho;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public TipoTitularidade getTitular() {
		return titular;
	}

	public void setTitular(TipoTitularidade titular) {
		this.titular = titular;
	}

	public double getNumKM() {
		return numKM;
	}

	public void setNumKM(double numKM) {
		if (numKM < 0) {
			System.out.println("El valor introducido tiene que ser mayor que cero");
		}
		this.numKM = numKM;
	}

	public double getNumKmDeficientes() {
		return numKmDeficientes;
	}

	public void setNumKmDeficientes(double numKmDeficientes) {
		if (numKmDeficientes < 0) {
			System.out.println("El valor introducido tiene que ser mayor que cero");
		}
		this.numKmDeficientes = numKmDeficientes;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if (ancho < 0) {
			System.out.println("El valor introducido tiene que ser mayor que cero");
		}
		this.ancho = ancho;
	}

	public abstract double costeMantemento();

	public double arranxar(double x) {
		if (x < 0) {
			System.out.println("El valor introducido debe ser mayor de cero");
		}
		if (this.numKmDeficientes - x < 0) {
				System.out.println("Los KM deficientes restantes no pueden quedar por debajo de cero");
				return 0;
		}
		return this.numKmDeficientes - x;
	}
	
	public double comunicarDeficiencia(double x) {
		if (x < 0) {
			System.out.println("El valor introducido debe ser mayor de cero");
		}
		if (this.numKmDeficientes + x > this.numKM) {
				System.out.println("Los KM deficientes no pueden ser mayores de los totales");
				return this.numKM;
		}
		return this.numKmDeficientes + x;
	}

	@Override
	public String toString() {
		return String.format("DATOS DE LA VIA%n---------------%nCódigo: %s%nTitular: %s%nNumKilómetros: %.2f%nNumKmDeficientes: %.2f%nAncho: %d%n", codigo,titular,numKM,numKmDeficientes,ancho);

	}

}
