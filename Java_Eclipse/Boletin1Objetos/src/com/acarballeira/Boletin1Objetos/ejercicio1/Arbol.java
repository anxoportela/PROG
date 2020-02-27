package com.acarballeira.Boletin1Objetos.ejercicio1;

import com.acarballeira.Boletin1Objetos.ejercicio1.Hojas;

/**
 *
 * @author dual108
 * @date 24 ene. 2020
 * @version 1.0
 *
 */

public class Arbol {
	
	public double altura;
	public int ano;
	public String concello;
	public String nombreComun;
	public String nombreLatino;
	public Hojas hojas;
	
	public String toString() {
		return String.format("------------------------------%n|Nombre: %s%n|Nombre Latino: %s%n|Tipo de Hoja: %s%n|Altura: %.2f%n|Ayuntamiento: %s%n|A�o nacimiento: %d%n------------------------------", this.nombreComun, this.nombreLatino,this.hojas,this.altura,this.concello,this.ano);
	}

}
