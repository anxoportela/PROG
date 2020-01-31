package com.acarballeira.clases.ejercicio5;

public abstract class Persona {
	
	protected String nome;
	protected String apelidos;
	
	public Persona(String nome, String apelidos) {
		super();
		this.nome = nome;
		this.apelidos = apelidos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelidos() {
		return apelidos;
	}

	public void setApelidos(String apelidos) {
		this.apelidos = apelidos;
	}

}
