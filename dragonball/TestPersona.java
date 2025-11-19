package com.dragonball;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goku g;
		Goku g2=new Goku();
		g=new Goku();//instancia un objeto
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
