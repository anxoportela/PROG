package com.acarballeira.Boletin1Objetos.driver;

import com.acarballeira.Boletin1Objetos.ejercicio4.Tiempo;

/**
 *
 * @author dual108
 * @date 24 ene. 2020
 * @version 1.0
 *
 */

public class PruebaHora {


	public static void main(String[] args) throws InterruptedException {
		
		Tiempo t3 = new Tiempo(23,5,25);
		Tiempo t4 = new Tiempo(23,5,45);
		
		while (!t3.equals(t4)) {
			t3.sumaSeg();
			System.out.println(t3);
			Thread.sleep(1000);
		}
		
		
	}

}
