package com.dragonball2;

public class Estudiante {
	public String nombre;
	public double nota;
	public String resultado;
	
	public Estudiante(){
		System.out.println("RESULTADOS");
	}
	public Estudiante(String nombre) {
		this.nombre=nombre;
	}
	
	public Estudiante(double nota) {
		this.nota=nota;
	}
	
	public void validarNota() {
		if (nota<8){
			System.out.println("F");
		}else if(nota>=8) {
			System.out.println("A");
		}
	}
	
}
