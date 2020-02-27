package com.acarballeira.Boletin1Objetos.ejercicio4;

/**
 *
 * @author dual108
 * @date 24 ene. 2020
 * @version 1.0
 *
 */

public class Tiempo {

	private int horas;
	private int minutos;
	private int segundos;

	public Tiempo() {};

	public Tiempo(int horas) {
		this();
		if (horas < 0 || horas > 23) {
			System.out.println("Hora errónea");
		} else {
			this.horas = horas;
		}
	}

	public Tiempo(int horas, int minutos) {
		this(horas);
		if (minutos < 0 || minutos > 59) {
			System.out.println("Minutos erróneos");
		} else {
			this.minutos = minutos;
		}
	}

	public Tiempo(int horas, int minutos, int segundos) {
		this(horas, minutos);
		if (segundos < 0 || segundos > 60) {
			System.out.println("Segundos erróneos");
		} else {
			this.segundos = segundos;
		}
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void sumaSeg() {
		if (this.segundos == 60) {
			this.segundos = 0;
			if (this.minutos == 60) {
				this.minutos = 0;
				if (this.horas == 24) {
					this.horas = 0;
				} else {
					this.horas++;
				}
			} else {
				this.minutos++;
			}
		} else {
			this.segundos++;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tiempo other = (Tiempo) obj;
		if (horas != other.horas)
			return false;
		if (minutos != other.minutos)
			return false;
		if (segundos != other.segundos)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", horas, minutos, segundos);
	}

}
