package com.dragonZ;

import com.dragonball2.Composicion;
import com.dragonball2.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona();
		Persona p2=new Persona();
		p1.setNombre("Oscar");
		p1.setApellido("Sandoval");
		
		Composicion dir=new Composicion();
		dir.setCallePrincipal("La Peaña");
		dir.setCalleSecundaria("Pallatanga");
		dir.setNumero("N-34");
		p1.setComposicion(dir);
		
		String nombre=p1.getNombre();
		Composicion d3=new Composicion("Av.Shyris", "Eloy Alfaro", "S/N", 3456, 2345); 
		Composicion d1=p1.getComposicion();
		System.out.println("Nombre: "+nombre);
		System.out.println(d1.getCallePrincipal());
		p1.imprimir();
		p2.setComposicion(d3);
		p2.imprimir();	}

}
