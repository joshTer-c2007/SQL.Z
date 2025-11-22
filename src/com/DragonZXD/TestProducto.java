package com.DragonZXD;

import com.DragonXE.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1=new Producto();
		Producto p2=new Producto("KE34", 0.85, "Papitas");
		System.out.println("Codigo: "+p2.getCodigo());
		System.out.println("Nombre: "+p2.getNombre());
		System.out.println("Precio: "+p2.getPrecio());
		
		System.out.println("*************************");
		
		p2.setPrecio(0.90);
		System.out.println("Nuevo precio: "+p2.getPrecio());
		p2.incrementarPrecio(50, 10);
		System.out.println("Precio incrementado: "+p2.getPrecio());
		p2.disminuirPrecio(45, 12);
		System.out.println("Precio incrementado: "+p2.getPrecio());

	}

}
