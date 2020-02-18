package com.acarballeira.bd.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dual108
 * @date 18 feb. 2020
 * @version 1.0
 *
 */

public class App {
	
	private final static String HOST = "10.10.33.12";
	private final static String PORT = "3306";
	private final static String DB = "bombones";
	private final static String USER = "root";
	private final static String PASSWORD = "Abc123..";
	
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			String cadenaConexion = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?serverTimeZone=Europe/Madrid";
			
			con = DriverManager.getConnection(cadenaConexion, USER, PASSWORD);
			Statement stmt = con.createStatement();
			//System.out.println("Conexión creada");
			
			ResultSet rs = stmt.executeQuery("SELECT Nombre, Apellidos, Ciudad, Telefono FROM clientes ORDER BY Apellidos, Nombre");
			
			while (rs.next()) {				
				System.out.printf("%-20s%-20s%20s%20s%n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		/*} catch (ClassNotFoundException e) {
			e.printStackTrace();*/
		} catch (SQLException e) {
			System.out.println("Error SQL: " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {}
		}
	}
}
