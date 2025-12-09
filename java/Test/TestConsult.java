package Test;

import java.util.ArrayList;

import Resistencia.Persona;
import Servicies.AdminPer;

public class TestConsult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Persona> personas=AdminPer.buscar("a");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
