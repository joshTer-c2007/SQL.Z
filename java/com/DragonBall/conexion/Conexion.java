package com.DragonBall.conexion;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement ps=null ;
		PreparedStatement ps1=null ;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","jh.txx4$w");
			System.out.println("conexion exitosa");
			ps=connection.prepareStatement("insert into videojuegos(codigo,nombre,descripcion,valoracion)"
					+ "values(?,?,?,?)");
			ps1=connection.prepareStatement("insert into productos(codigo,nombre,precio,stock)"
					+ "Values(?,?,?,?)");
			
			ps.setInt(1, 28934);
			ps.setString(2, "Dragon ball Legends");
			ps.setString(3, "Pelea y destreza");
			ps.setInt(4, 10);
			
			ps1.setInt(1, 10);
			ps1.setString(2, "Coca Cola");
			ps1.setBigDecimal(3, new BigDecimal("3.50"));
			ps1.setInt(4, 300);
			
			ps.executeUpdate();
			ps1.executeUpdate();
			System.out.println("Juegos xd");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
