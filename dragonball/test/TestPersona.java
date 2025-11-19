package com.dragonball.test;

import com.dragonball.Goku;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goku g;
		Goku g2=new Goku();
		g=new Goku();
		Goku p3=new Goku("Pablo",18,1.71);
		System.out.print("nombre:"+p3.getNombre());
		System.out.print("edad:"+p3.getEdad());
		System.out.print("estatura:"+p3.getEstatura());
		
		System.out.print("nombre:"+g.getNombre());
		System.out.print("edad:"+g.getEdad());
		System.out.print("estatura:"+g.getEstatura());
		
		g.setNombre("Josh");
		g.setEdad(18);;
		g.setEstatura(1.78);
		
		System.out.println("---------------");
		System.out.print("nombre:"+g.getNombre());
		System.out.print("edad:"+g.getEdad());
		System.out.print("estatura:"+g.getEstatura());
	}

}
