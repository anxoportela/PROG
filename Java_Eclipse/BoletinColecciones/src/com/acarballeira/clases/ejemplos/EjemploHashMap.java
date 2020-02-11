package com.acarballeira.clases.ejemplos;

import java.util.HashMap;

/**
 *
 * @author dual108
 * @date 11 feb. 2020
 * @version 1.0
 *
 */

public class EjemploHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> mapa = new HashMap<Integer,String>();
		
		mapa.put(0, "Luis");
		mapa.put(1, "Pepe");
		mapa.put(2, "Jose");
		mapa.put(0, "is");
		
		for (Integer i: mapa.keySet()) {
			System.out.println(mapa.get(i));
		}
	}

}
