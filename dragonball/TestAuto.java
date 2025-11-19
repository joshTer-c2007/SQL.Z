package com.dragonball;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a;
		a=new Auto();
		Auto a2;
		a2= new Auto();
		
		System.out.println("marca"+ a.getMarca());
		System.out.println("anio"+ a.getAnio());
		System.out.println("precio"+ a.getPrecio());
		
		a.setMarca("PBD-2378");
		a.setAnio(2010);
		a.setPrecio(10.000);
		
		System.out.println("marca"+ a.getMarca());
		System.out.println("anio"+ a.getAnio());
		System.out.println("precio"+ a.getPrecio());
		
		
		a2.setMarca("PXD-3456");
		a2.setAnio(2013);
		a2.setPrecio(20.000);
		
		System.out.println("marca"+ a2.getMarca());
		System.out.println("anio"+ a2.getAnio());
		System.out.println("precio"+ a2.getPrecio());

	}

}
