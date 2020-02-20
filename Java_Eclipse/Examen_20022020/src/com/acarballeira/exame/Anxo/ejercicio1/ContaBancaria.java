package com.acarballeira.exame.Anxo.ejercicio1;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author dual108
 * @date 20 feb. 2020
 * @version 1.0
 *
 */

public class ContaBancaria {
	
	protected String nomeCliente;
	protected String numeroConta;
	private double tipoInterese;
	protected double saldo;
	private static int numContas;
	
	public ContaBancaria() {
		super();
	}
	
	public ContaBancaria(String nomeCliente, String numeroConta, double tipoInterese, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.tipoInterese = tipoInterese;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getTipoInterese() {
		return tipoInterese;
	}

	public void setTipoInterese(double tipoInterese) {
		this.tipoInterese = tipoInterese;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static int getNumContas() {
		return numContas;
	}
	
	public boolean ingreso(double x) {
		if(x<0) {
			return false;
		} else {
			this.saldo += x;
			return true;
		}
	}
	
	public boolean reintegro(double x) {
		if(x<0) {
			return false;
		} else {
			if ((this.getSaldo()-x)<0) {
				return false;
			} else {
				this.saldo-=x;
				return true;
			}
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		return Objects.equals(nomeCliente, other.nomeCliente) && Objects.equals(numeroConta, other.numeroConta)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo)
				&& Double.doubleToLongBits(tipoInterese) == Double.doubleToLongBits(other.tipoInterese);
	}

	@Override
	public String toString() {
		return String.format("Número de conta: %s%nSaldo: %.2f%nCliente: %s%n", numeroConta,saldo,nomeCliente);

	}

}

class ComparaCliente implements Comparator<ContaBancaria>{

	@Override
	public int compare(ContaBancaria o1, ContaBancaria o2) {
		return o1.nomeCliente.compareTo(o2.nomeCliente);
	}
	
}

class ComparaSaldo implements Comparator<ContaBancaria>{

	@Override
	public int compare(ContaBancaria o1, ContaBancaria o2) {
		return (o1.saldo>o2.saldo) ? -1 : (o1.saldo<o2.saldo) ? 1 : 0;
	}
	
}