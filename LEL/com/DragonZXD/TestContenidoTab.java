package com.DragonZXD;

import com.DragonXE.Celad;
import com.DragonXE.Producto;

public class TestContenidoTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Celad cel=new Celad("A1");
		Producto p1=new Producto("KE34", 0.85, "Papitas");
		cel.ingresarProducto(p1, 5);
		
		System.out.println("CELDA: "+cel.getCodigo());
		System.out.println("**********************************");
		
		System.out.println("Nombre Producto: "+cel.getProducto().getNombre());
		System.out.println("Precio Producto: "+cel.getProducto().getPrecio());
		System.out.println("Codigo Producto: "+cel.getProducto().getCodigo());
		System.out.println("Stock: "+cel.getStock());

	}

}
