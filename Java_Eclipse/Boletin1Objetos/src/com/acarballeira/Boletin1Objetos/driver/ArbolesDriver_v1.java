package com.acarballeira.Boletin1Objetos.driver;

import com.acarballeira.Boletin1Objetos.ejercicio1.Arbol;
import com.acarballeira.Boletin1Objetos.ejercicio1.Hojas;

/**
 *
 * @author dual108
 * @date 24 ene. 2020
 * @version 1.0
 *
 */

public class ArbolesDriver_v1 {
	
	public static void main(String[] args) {
		
		Arbol pino = new Arbol();
		
		pino.nombreLatino = "Pinus Pinaster";
		pino.nombreComun = "Pino";
		pino.hojas = Hojas.PERENNE;
		pino.concello ="Ramirás";
		pino.ano = 1998;
		pino.altura = 23.25;
		
		System.out.println(pino);
		
	}

}
