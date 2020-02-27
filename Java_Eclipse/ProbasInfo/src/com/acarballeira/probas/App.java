package com.acarballeira.probas;

import java.util.HashSet;

/**
 *
 * @author dual108
 * @date 27 feb. 2020
 * @version 1.0
 *
 */

class Persona {

	private int idade;
	private String nomeCompleto;

	public Persona(String nomeCompleto, int idade) {
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Persona [idade=" + idade + ", " + (nomeCompleto != null ? "nomeCompleto=" + nomeCompleto : "") + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return this.nomeCompleto.equals(other.nomeCompleto);
	}	

}

public class App {
	
	//static ArrayList<Persona> lista;
	static HashSet<Persona> lista;
	
	public static void main(String[] args) {

		//lista = new ArrayList<Persona>();
		lista = new HashSet<Persona>();
		
		lista.add(new Persona("Luis", 23));
		lista.add(new Persona("María", 25));
		lista.add(new Persona("José", 21));
		lista.add(new Persona("Iria", 29));
		lista.add(new Persona("Luis", 23));
		
		//lista.remove(new Persona("María", 25));
		//ArrayList<Persona> lista2 = new ArrayList(lista);
		//lista2.addAll(lista);
		
		Object[] p = devolverArray();
		
		for (Object o : p) {
			System.out.println(o);
		}

	}
	
	public static Object[] devolverArray() {
		
		return lista.toArray();
		
	}

}
