package com.acarballeira.bd.ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dual108
 * @date 18 feb. 2020
 * @version 1.0
 *
 */

public class Conexion {

	private final static String HOST = "10.10.33.12";
	private final static String PORT = "3306";
	private final static String DB = "bombones";
	private final static String USER = "root";
	private final static String PASSWORD = "Abc123..";
	private static Connection con = null;

	private Conexion() {
	}

	public static Connection obtenerConexion() {
		//Connection con = null;
		if (con == null) {
			String cadenaConexion = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?serverTimeZone=Europe/Madrid";
			try {
				con = DriverManager.getConnection(cadenaConexion, USER, PASSWORD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
}
