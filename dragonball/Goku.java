package com.dragonball;

public class Goku {
	private String nombre;
	private int edad;
	private double estatura;
	
	public Goku() {
		System.out.println("HOLA XD");
	}

	public Goku(String nombre,int edad,double estatura) {
		this.nombre=nombre;
		this.edad=edad;
		this.estatura=estatura;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
}
