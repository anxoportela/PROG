package com.acarballeira.clases.ejercicio1;

/**
 *
 * @author dual108
 * @date 27 ene. 2020
 * @version 1.0
 *
 */

public class Cubotes {
	
	int capacidad;
	int contenido;	
	
	public Cubotes(int capacidad) {
		super();
		this.capacidad = capacidad;
	}
	
	public int getCapacidad() {
		return capacidad;
	}

	public int getContenido() {
		return contenido;
	}
	
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
	public void vacia() {
		this.contenido=0;
	}
	
	public void llena() {
		this.contenido = this.capacidad;
	}
	
	public void pinta() {
		for (int nivel = this.capacidad; nivel > 0; nivel--) {
			if(this.contenido>=nivel) {
				System.out.println("#~~~~#");
			} else {
				System.out.println("#    #");
			}
		}
		System.out.println("######");
	}
	
	public void vuelcaEn(Cubotes destino) {
		int libres = destino.getCapacidad()-destino.getContenido();
		
		if(libres!=0) {
			if (this.contenido<=libres) {
				destino.setContenido(destino.getContenido()+this.contenido);
				this.vacia();
			} else {
				this.contenido-=libres;
				destino.llena();
			}
		}
	}
	
}
