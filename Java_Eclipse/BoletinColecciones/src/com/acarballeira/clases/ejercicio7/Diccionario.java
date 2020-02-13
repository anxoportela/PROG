package com.acarballeira.clases.ejercicio7;

import java.util.HashMap;

/**
 *
 * @author dual108
 * @date 13 feb. 2020
 * @version 1.0
 *
 */

public class Diccionario {

	private HashMap<String, String> traduccion;
	
	public Diccionario() {
		this.traduccion = new HashMap<String,String>();
	}
	
	public void add(String esp,String ing) {
		this.traduccion.put(esp, ing);
	}

	public void del(String esp) {
		this.traduccion.remove(esp);
	}

	public void trad(String esp) {
		this.traduccion.get(esp);
	}

}
