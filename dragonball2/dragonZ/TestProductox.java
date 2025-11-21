package com.dragonZ;

import com.dragonball2.AdminProducto;
import com.dragonball2.Productox;

public class TestProductox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productox mc;
		AdminProducto ad=new AdminProducto();
		Productox prodA=new Productox("Manzana", 0.90);
		Productox prodB=new Productox("Papas", 0.50);
		
		mc=ad.buscarCaro(prodA, prodB);
		
		System.out.println("El mas caro es: "+mc.getNombre());

	}

}
