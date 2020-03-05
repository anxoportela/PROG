package com.acarballeira.exame.Anxo.exercicio1;

/**
 *
 * @author dual108
 * @date 28 feb. 2020
 * @version 1.0
 *
 */

public class Intolerante extends Participante {
	
	private String intolerancia;

	public Intolerante(String nome, String apelidos, String nick, char categoria, String intolerancia) {
		super(nome, apelidos, nick, categoria);
		this.intolerancia = intolerancia;
	}

	public Intolerante(String nome, String apelidos, String nick, int idade, String intolerancia) {
		super(nome, apelidos, nick, idade);
		this.intolerancia = intolerancia;
	}

	public String getIntolerancia() {
		return intolerancia;
	}

	public void setIntolerancia(String intolerancia) {
		this.intolerancia = intolerancia;
	}
	
}
