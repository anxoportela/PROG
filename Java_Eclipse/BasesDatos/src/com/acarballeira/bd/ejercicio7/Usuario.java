package com.acarballeira.bd.ejercicio7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.acarballeira.bd.ejercicio4.ConexionPool;

/**
 *
 * @author dual108
 * @date 18 feb. 2020
 * @version 1.0
 *
 */

public class Usuario {
	
	private int idCliente;
	private String nome;
	private String apellidos;
	
	public Usuario() {
	}
	
	public Usuario(String nome, String apellidos) {
		this();
		this.nome = nome;
		this.apellidos = apellidos;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", " + (nome != null ? "nome=" + nome + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos : "") + "]";
	}
	
}


