package com.acarballeira.bd.ejercicio3;

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

	public static int obtenerNumBombones() {

		int res = 0;

		try {
			Connection con = Conexion.obtenerConexion();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT count(*) FROM bombones");
			rs.next();
			res = Integer.parseInt(rs.getString(1));
			//con.close();
		} catch (SQLException e) {
			System.out.println("Error SQL: " + e.getMessage());
		}
		return res;
	}
}
