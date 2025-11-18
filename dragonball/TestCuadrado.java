package com.dragonball;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		double area;
		double perimetro;
		
		c1.lado=4;
		
		c2.lado1=3;
		
		area=c1.calcularArea();
		perimetro=c2.calcularPerimetro();
		
		System.out.println("Area de c1 "+area);
		System.out.println("Area de c2 "+perimetro);

	}

}
