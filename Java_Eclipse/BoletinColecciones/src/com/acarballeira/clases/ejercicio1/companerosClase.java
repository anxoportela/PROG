package com.acarballeira.clases.ejercicio1;

import java.util.ArrayList;

public class companerosClase {

	public static void main(String[] args) {
		ArrayList<String> companeros = new ArrayList<String>();
		companeros.add("Pablo");
		companeros.add("Jose Manuel");
		companeros.add("Aaron");
		companeros.add("Ivan");
		companeros.add("Daniel");
		companeros.add("Pacetti");
		
		for (String i : companeros) {
			System.out.println(i);
		}
	}

}
