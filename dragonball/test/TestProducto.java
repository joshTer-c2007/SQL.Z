package com.dragonball.test;

import com.dragonball.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p;
		p = new Producto();
		System.out.println("nombre" + p.nombre);
		System.out.println("descripcion" + p.descripcion);
		System.out.println("precio" + p.precio);
		System.out.println("stockActual" + p.stockActual);

		p.nombre = "Leche";
		p.descripcion = "Bebida";
		p.precio = 10;
		p.stockActual = 20;

		System.out.println("nombre: " + p.nombre);
		System.out.println("descripcion: " + p.descripcion);
		System.out.println("precio: " + p.precio);
		System.out.println("stockActual: " + p.stockActual);
		
		Producto p2;
		p2 = new Producto();
		System.out.println("nombre" + p2.nombre);
		System.out.println("descripcion" + p2.descripcion);
		System.out.println("precio" + p2.precio);
		System.out.println("stockActual" + p2.stockActual);

		p2.nombre = "Manzana";
		p2.descripcion = "Fruta";
		p2.precio = 2;
		p2.stockActual = 100;

		System.out.println("nombre: " + p2.nombre);
		System.out.println("descripcion: " + p2.descripcion);
		System.out.println("precio: " + p2.precio);
		System.out.println("stockActual: " + p2.stockActual);

	}

}
