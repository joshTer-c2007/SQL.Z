package com.dragonball;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goku g;
		Goku g2=new Goku();
		g=new Goku();//instancia un objeto
		System.out.print("nombre:"+g.nombre);
		System.out.print("edad:"+g.edad);
		System.out.print("estatura:"+g.estatura);
		
		g.nombre="Josh";
		g.edad=18;
		g.estatura=1.70;
		
		System.out.println("---------------");
		System.out.print("nombre:"+g.nombre);
		System.out.print("edad:"+g.edad);
		System.out.print("estatura:"+g.estatura);
	}

}
