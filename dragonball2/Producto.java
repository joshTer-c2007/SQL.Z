package com.dragonball2;

public class Producto {
	public String nombre;
	public double precio;
	
	public Producto() {
		System.out.println("Lista");
	}
	public Producto(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	public void setPrecio(){
		if(precio>0) {
			System.out.println("Precio registrados");
		}else {
			System.out.println("Mami/Papi el precio en negativo no exste eh, aguas");
		}
	}
	public double porcent(double valor1){
		double resultado;
		resultado=valor1*20/100;
		return resultado;
		
	}

}
