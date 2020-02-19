package com.acarballeira.bd.ejercicio4;

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

public class Cliente {

	public static int obtenerNumClientes() {

		int res = 0;

		try {
			Connection con = ConexionPool.obtenerConexion();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT count(*) FROM clientes");
			rs.next();
			res = Integer.parseInt(rs.getString(1));
			//con.close();
			ConexionPool.devolverConexion(con);
		} catch (SQLException e) {
			System.out.println("Error SQL: " + e.getMessage());
		}
		return res;
	}
}
