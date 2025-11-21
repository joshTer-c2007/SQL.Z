package com.dragonZ;

import com.dragonball2.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p=new Producto();
		Producto p1=new Producto("Leche", 10.00);
		Producto p2=new Producto("Manzanas", 2.00);
		
		p.nombre="Paquete de Tallarin";
		double porcentaje;
		porcentaje=p.porcent(7.00);
		
		System.out.println("Nombre: "+p.nombre);
		System.out.println("Precio: "+porcentaje);
		
		System.out.println("Nombre: "+p1.nombre);
		System.out.println("Nombre: "+p1.precio);
		
		System.out.println("Nombre: "+p2.nombre);
		System.out.println("Nombre: "+p2.precio);

	}

}
