package com.acarballeira.bd.ejercicio2;

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

public class Bombon {

	private final static String HOST = "10.10.33.12";
	private final static String PORT = "3306";
	private final static String DB = "bombones";
	private final static String USER = "root";
	private final static String PASSWORD = "Abc123..";

	public static int obtenerNumBombones() {

		Connection con = null;
		int res = 0;

		try {
			String cadenaConexion = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?serverTimeZone=Europe/Madrid";
			con = DriverManager.getConnection(cadenaConexion, USER, PASSWORD);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT count(*) FROM bombones");
			rs.next();
			res = Integer.parseInt(rs.getString(1));
		} catch (SQLException e) {
			System.out.println("Error SQL: " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}
		return res;
	}
}
