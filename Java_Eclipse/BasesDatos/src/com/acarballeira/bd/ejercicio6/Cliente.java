package com.acarballeira.bd.ejercicio6;

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

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String apellidos;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String apellidos) {
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

	public static List<Cliente> obter(){
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		
		try {
			int aux = 0;
			Connection con = ConexionPool.obtenerConexion();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT IdCliente, Nombre, Apellidos FROM clientes");			
			while (rs.next()) {
				lista.add(new Cliente(rs.getString(2), rs.getString(3)));
				lista.get(aux).setIdCliente(rs.getInt(1));
				aux++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	
	}
	
	public static Cliente obter(int id) {
		
		Cliente aux = new Cliente();
		
		try {
			Connection con = ConexionPool.obtenerConexion();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT Nombre, Apellidos FROM clientes WHERE idCliente=" + id + ";");			
			if (rs.next()) {
				aux.setIdCliente(id);
				aux.setNome(rs.getString(1));
				aux.setApellidos(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return aux;
		
	}
	
	public static boolean rexistrar(Cliente cliente) {
        boolean rs = false;
        try {
            Connection con = ConexionPool.obtenerConexion();
            Statement st = con.createStatement();
            rs = st.execute("INSERT INTO clientes (Nombre, Apellidos) VALUES ('" + cliente.getNome() + "', '" + cliente.getApellidos() + "');");
           
            ConexionPool.devolverConexion(con);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return rs;
    }
	
	public static boolean eliminar(Cliente cliente) {
		boolean rs = false;
        try {
            Connection con = ConexionPool.obtenerConexion();
            Statement st = con.createStatement();
            rs = st.execute("DELETE FROM clientes WHERE idCliente = " + cliente.getIdCliente() + ";");
           
            ConexionPool.devolverConexion(con);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return rs;
    }
	
	public static boolean actualizar(Cliente cliente) {
		boolean rs = false;
        try {
            Connection con = ConexionPool.obtenerConexion();
            Statement st = con.createStatement();
            rs = st.execute("UPDATE clientes SET Nombre = '" + cliente.getNome() + "', Apellidos = '" + cliente.getApellidos() + "' WHERE idCliente = " +  cliente.getIdCliente() + ";");
           
            ConexionPool.devolverConexion(con);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return rs;
    }
	
}


