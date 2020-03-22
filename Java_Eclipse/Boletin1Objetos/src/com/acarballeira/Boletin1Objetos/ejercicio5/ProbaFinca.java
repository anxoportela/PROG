package com.acarballeira.Boletin1Objetos.ejercicio5;

/**
 *
 * @author dual108
 * @date 27 ene. 2020
 * @version 1.0
 *
 */

public class ProbaFinca {

	public static void main(String[] args) {
		
		Parcela p = new Parcela(250, new Coordenada(4, 5), new Coordenada(8, 9));
		Finca f = new Finca(250.0, new Coordenada(4, 5), new Coordenada(8, 9), p, "Prueba", TipoCultivo.CULTIVO, true, 100.0);
		
		System.out.println(f);


	}

}
