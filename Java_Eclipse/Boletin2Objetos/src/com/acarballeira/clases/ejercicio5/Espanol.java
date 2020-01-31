package com.acarballeira.clases.ejercicio5;

public class Espanol extends Persona implements Hablador {

	public Espanol(String nome, String apelidos) {
		super(nome, apelidos);
	}

	@Override
	public void saluda() {
		System.out.println("Hola");	
	}
}
