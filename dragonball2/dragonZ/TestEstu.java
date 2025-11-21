package com.dragonZ;

import com.dragonball2.Estudiante;

public class TestEstu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante est=new Estudiante();
		Estudiante est1=new Estudiante("Carlos");
		Estudiante est2=new Estudiante(9);
		
		est.nombre="Mark";
		est.nota=5;
		est.resultado="F";
		est2.resultado="A";
		
		System.out.println("Nombre: "+est.nombre);
		System.out.println("Nota: "+est.nota);
		System.out.println("Resultado: "+est.resultado);
		
		System.out.println("*********************");
		
		System.out.println("Nombre: "+est1.nombre);
		System.out.println("Nota: "+est2.nota);
		System.out.println("Resultado: "+est2.resultado);


	}

}
