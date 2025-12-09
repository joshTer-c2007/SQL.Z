package Test;

import java.math.BigDecimal;

import Resistencia.Persona;
import Resistencia.Productos;
import Servicies.AdminPer;

public class AdmPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p=new Persona(34578, "Dragon ball KAI", "Violencia", 10, null);
		try {
			AdminPer.insertar(new Persona(12345,"Dragon ball legends","Accion y pelea",10,null));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Productos pr=new Productos(12567, "Leche", "Bebida",new BigDecimal("34.21"), 34);
		try {
			AdminPer.insertar1(new Productos(23896, "Manzanas", "Frutas", new BigDecimal("10.00"), 100));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
