package com.acarballeira.exame.Anxo.exercicio1;

/**
 *
 * @author dual108
 * @date 28 feb. 2020
 * @version 1.0
 *
 */

public class Participante extends Carreira {
	
	protected String nome;
	protected String apelidos;
	protected String nick;
	protected int idade;
	protected char sexo;
	protected char categoria;
	protected int dorsal;
	private static int num_dorsal = 1;
	
	public Participante(String nome, String apelidos, String nick) {
		this.nome = nome;
		this.apelidos = apelidos;
		this.nick = nick;
		this.sexo = 'H';
		this.dorsal = num_dorsal++;
	}
	
	public Participante(String nome, String apelidos, String nick, char categoria) {
		this.nome = nome;
		this.apelidos = apelidos;
		this.nick = nick;
		this.categoria = categoria;
		this.sexo = 'H';
		this.dorsal = num_dorsal++;
	}
	
	public Participante(String nome, String apelidos, String nick, int idade) {
		this.nome = nome;
		this.apelidos = apelidos;
		this.nick = nick;
		this.idade = idade;
		this.sexo = 'H';
		this.categoria = calcularCategoria(this.idade);
		this.dorsal = num_dorsal++;
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

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade <= 0 || idade > 150) {
			this.idade = 18;
		} else {
			this.idade = idade;
		}
	}

	public String getSexo() {
		String salida = null; 
		if (this.sexo == 'H') {
			salida = "Home";
		} else {
			salida = "Muller";
		}
		return salida;
	}

	public void setSexo(char s) {
		if(s == 'h' || s == 'H') {
			this.sexo = 'H';
		} else if (s == 'm' || s == 'M') {
			this.sexo = 'M';
		} else {
			this.sexo = 'H';
		}
	}
	
	public void setSexo(String s) {
		if (s.equalsIgnoreCase("mujer") || s.equalsIgnoreCase("woman") || s.equalsIgnoreCase("muller")) {
			this.sexo = 'M';
		} else {
			this.sexo = 'H';
		}
	}

	public String getCategoria() {
		String salida = null;
		if (this.categoria == 'A') {
			salida = "Benxamín";
		} else if (this.categoria == 'B') {
			salida = "Alevín";
		} else if (this.categoria == 'C') {
			salida = "Infantil";
		}else if (this.categoria == 'D') {
			salida = "Cadete";
		}else if (this.categoria == 'E') {
			salida = "Xuvenil";
		}else if (this.categoria == 'F') {
			salida = "Senior";
		}else{
			salida = "Veterano";
		}
		return salida;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	public int getDorsal() {
		return dorsal;
	}
	
	private static char calcularCategoria(int idade) {
		char categoria = 0;
		if (idade<8) {
			categoria = 'A';
		} else if (idade>=8 && idade<11) {
			categoria = 'B';
		} else if (idade>=11 && idade<13) {
			categoria = 'C';
		}else if (idade>=13 && idade<15) {
			categoria = 'D';
		}else if (idade>=15 && idade<19) {
			categoria = 'E';
		}else if (idade>=19 && idade<30) {
			categoria = 'F';
		}else{
			categoria = 'G';
		}
		return categoria;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		if (apelidos == null) {
			if (other.apelidos != null)
				return false;
		} else if (!apelidos.equals(other.apelidos))
			return false;
		if (nick == null) {
			if (other.nick != null)
				return false;
		} else if (!nick.equals(other.nick))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Participante [" + (nome != null ? "nome=" + nome + ", " : "")
				+ (apelidos != null ? "apelidos=" + apelidos + ", " : "") + (nick != null ? "nick=" + nick + ", " : "")
				+ "idade=" + idade + ", sexo=" + sexo + ", categoria=" + categoria + ", dorsal=" + dorsal + "]";
	}	

}
