package com.acarballeira.clases.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author dual108
 * @date 11 feb. 2020
 * @version 1.0
 *
 */

class Jugador implements Comparable<Jugador> {
	
	String nombre;
	int dorsal;
	
	public Jugador(String nombre, int dorsal) {
		this.nombre = nombre;
		this.dorsal = dorsal;
	}

	@Override
	public int compareTo(Jugador o) {		
		if(this.dorsal<o.dorsal) {
			return -1;
		} else if (this.dorsal>o.dorsal) {
			return 1;
		} else {
			return this.nombre.compareTo(o.nombre);
		}
	}

	@Override
	public String toString() {
		return "Jugador [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "dorsal=" + dorsal + "]";
	}	
}

//class ComparaJugador implements Comparator<Jugador>{
//
//	@Override
//	public int compare(Jugador o1, Jugador o2) {
//		return o1.dorsal - o2.dorsal;
//	}
//	
//}

public class Ejemplos {

	public static void main(String[] args) {

		//ArrayList<Integer> lista = new ArrayList<Integer>();

		//lista.add(5);
		//lista.add(2);
		//lista.add(6);
		//lista.add(4);
		//lista.add(1);

		//Collections.sort(lista);
		
		//System.out.println(lista.size());

		//for (Integer integer : lista) {
		//	System.out.println(integer);
		//}
		
		//for (int i = 0; i < lista.size(); i++) {
		//	System.out.println(lista.get(i));
		//}

		//Iterator<Integer> iterador = lista.iterator();
		//while (iterador.hasNext()) {
		//	System.out.println(iterador.next());
		//}

		//lista.forEach(valor -> System.out.println(valor));
		
		ArrayList<Jugador> lista = new ArrayList<Jugador>();
		
		lista.add(new Jugador("Manuel",17));
		lista.add(new Jugador("Luis",7));
		lista.add(new Jugador("Pedro",27));
		lista.add(new Jugador("Roberto",7));
		
		//Collections.sort(lista);
		lista.sort(new Comparator<Jugador>() {
			public int compare(Jugador o1, Jugador o2) {
				if(o1.dorsal==o2.dorsal) {
					return o1.nombre.compareTo(o2.nombre);
				} else {
					return o1.dorsal - o2.dorsal;
				}
			}
		});
		
		for (Jugador jugador : lista) {
			System.out.println(jugador);
		}

	}

}
