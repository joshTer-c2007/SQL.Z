package com.dragonball;

public class Rectangulo {
	public int base;
	public int altura;
	
	public int calcularArea(){
		int area;
		area=base*altura;
		return area;
	}
	public double base1;
	public double base2;
	public double altura1;
	public double altura2;
	public double Perimetro(){
		double Perimetro;
		Perimetro= base1+base2+altura1+altura2;
		return Perimetro;
	}
}

