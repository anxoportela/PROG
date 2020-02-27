package com.acarballeira.exame.Anxo.ejercicio1;

import java.util.Objects;

/**
 * <p>La clase <b>Tarxeta</b></p>
 *
 * @author Anxo Portela-Insua Blanco
 * @version 1.0
 * @date 20 feb. 2020
 */

public class Tarxeta extends ContaBancaria {

	private String numero;
	private String nome;
	private TipoTarxeta tipo;

	public Tarxeta() {
		super();
	}
	
	public Tarxeta(String nomeCliente, String numeroConta, double tipoInterese, double saldo, String numero, String nome, TipoTarxeta tipo) {
		super(nomeCliente, numeroConta, tipoInterese, saldo);
		this.numero = numero;
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoTarxeta getTipo() {
		return tipo;
	}

	public void setTipo(TipoTarxeta tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarxeta other = (Tarxeta) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numero, other.numero) && tipo == other.tipo;
	}

	@Override
	public String toString() {
		return String.format("Tarxeta: %s%nTipo: %s%nNúmero de conta: %s%nCliente: %s%nSaldo: %.2f%n", numero, tipo, numeroConta, nomeCliente, saldo);
	}
}
