package Servicies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Persistence.BDD;
import Resistencia.Persona;
import Resistencia.Productos;

public class AdminPer {
	
	private static final Logger LOGGER= LogManager.getLogger(AdminPer.class);
	@SuppressWarnings("null")
	public static void insertar(Persona persona) throws Exception{
		Connection con=null;
	PreparedStatement ps;
		 con=BDD.conectar();
		System.out.println("inserta");
		try {
			ps=con.prepareStatement("insert into videojuegos(codigo,nombre,descripcion,valoracion)"
					+ "values(?,?,?,?)");
			ps.setInt(1, persona.getCodigo());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getDescripcion());
			ps.setInt(4, persona.getValoracion());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			LOGGER.error("Error xd",e);
			throw new Exception("Error xd");
	}
		// TODO Auto-generated catch block
}

	public static void insertar1(Productos producto) throws Exception{
		Connection con1=null;
		PreparedStatement ps1;
		con1=BDD.conectar();
		System.out.println("inserta");
		try {
			ps1=con1.prepareStatement("insert into productos(codigo,nombre,precio,stock)"
					+ "Values(?,?,?,?)");
			ps1.setInt(1, producto.getCodigo());
			ps1.setString(2, producto.getNombre());
			ps1.setBigDecimal(3, producto.getPrecio());
			ps1.setInt(4, producto.getStock());
			
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error("Error xd 1",e);
			throw new Exception("Error xd 1");
		}
	}

}
