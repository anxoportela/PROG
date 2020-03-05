package com.acarballeira.exame.Anxo.exercicio1;

/**
 *
 * @author dual108
 * @date 28 feb. 2020
 * @version 1.0
 *
 */

public class Discapacitado extends Participante {

	private String discapacidade;

	public Discapacitado(String nome, String apelidos, String nick, char categoria, String discapacidade) {
		super(nome, apelidos, nick, categoria);
		this.discapacidade = discapacidade;
	}

	public Discapacitado(String nome, String apelidos, String nick, int idade, String discapacidade) {
		super(nome, apelidos, nick, idade);
		this.discapacidade = discapacidade;
	}

	public String getDiscapacidade() {
		return discapacidade;
	}

	public void setDiscapacidade(String discapacidade) {
		this.discapacidade = discapacidade;
	}
	
	
	
}
