package com.dragonball;

public class TestRectan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo r3=new Rectangulo();
		int area;
		int area2;
		double Perimetro;
		
		r1.base=10;
		r1.altura=5;
		r2.base=8;
		r2.altura=3;
		
		r3.base1=4;
		r3.base2=4;
		r3.altura1=2;
		r3.altura2=2;
		
		area=r1.calcularArea();
		area2=r2.calcularArea();
		Perimetro=r3.Perimetro();
		
		System.out.println("Area de r1 "+area);
		System.out.println("Area de r2 "+area2);
		System.out.println("Perimetro de r3 "+Perimetro);

	}

}
