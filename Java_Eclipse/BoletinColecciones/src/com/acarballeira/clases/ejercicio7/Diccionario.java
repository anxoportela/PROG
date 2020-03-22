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
		this.traduccion = new HashMap<String, String>();
	}

	public void add(String esp, String ing) {
		this.traduccion.put(esp, ing);
	}

	public void del() {
		this.traduccion.clear();
	}

	public String trad(String esp) {
		String salida;
		if (traduccion.size() == 0) {
			return ("Lista vacía");
		} else {

			if (traduccion.containsKey(esp)) {
				salida = traduccion.get(esp);
				return ("La traducción es: " + salida);
			} else {
				return ("Definición no encontrada.");
			}

		}
	}

}
