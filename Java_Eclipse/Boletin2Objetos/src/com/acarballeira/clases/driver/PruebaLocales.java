package com.acarballeira.clases.driver;

import com.acarballeira.clases.ejercicio3.*;

/**
 *
 * @author dual108
 * @date 29 ene. 2020
 * @version 1.0
 *
 */

public class PruebaLocales {
	
	public static void main(String[] args) {
		
		Pisos p1 = new Pisos("Prueba1", 25, Estado.NUEVO, 25000, 5, 3);
		Pisos p2 = new Pisos("Prueba2", 55, Estado.NUEVO, 55000, 10, 5);
		
		Locales l1 = new Locales("Prueba3", 120, Estado.SEGUNDA_MANO, 150000, 10, 1);
		Locales l2 = new Locales("Prueba2", 150, Estado.SEGUNDA_MANO, 250000, 5, 5);
		
		System.out.println(p1);
		System.out.println(p1.precioFinal());
		System.out.println(p2);
		System.out.println(p2.precioFinal());
		//System.out.println(l1);
		//System.out.println(l2);
	}

}
