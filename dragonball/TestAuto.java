package com.dragonball;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a;
		a=new Auto();
		Auto a2;
		a2= new Auto();
		
		System.out.println("marca"+ a.marca);
		System.out.println("anio"+ a.anio);
		System.out.println("precio"+ a.precio);
		
		a.marca="PBD-2378";
		a.anio=2010;
		a.precio=10.000;
		
		System.out.println("marca"+ a.marca);
		System.out.println("anio"+ a.anio);
		System.out.println("precio"+ a.precio);
		
		
		a2.marca="PWA-4378";
		a2.anio=2013;
		a2.precio=20.000;
		
		System.out.println("marca"+ a2.marca);
		System.out.println("anio"+ a2.anio);
		System.out.println("precio"+ a2.precio);

	}

}
