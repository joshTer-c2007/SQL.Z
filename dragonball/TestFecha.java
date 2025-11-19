package com.dragonball;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fecha1=new Fecha();
		Fecha fecha2= new Fecha(2010,9,12);
		fecha1.setAnio(2000);
		fecha1.setMes(12);
		fecha1.setDia(23);
		System.out.println(fecha1.getAnio());
		
		System.out.println(fecha2.getAnio());
		System.out.println(fecha2.getMes());
		System.out.println(fecha2.getDia());

	}

}
