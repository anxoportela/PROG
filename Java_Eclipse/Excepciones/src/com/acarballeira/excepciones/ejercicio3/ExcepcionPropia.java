package com.acarballeira.excepciones.ejercicio3;

/**
 *
 * @author dual108
 * @date 14 feb. 2020
 * @version 1.0
 *
 */

public class ExcepcionPropia extends Exception{
	
	private String mensaje;

	public ExcepcionPropia(String mensaje) {
		super(mensaje);
		this.mensaje = mensaje;
	}

}
