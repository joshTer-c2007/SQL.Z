package com.dragonball2;

public class AdminProducto {
	public Productox buscarCaro(Productox p1,Productox p2) {
		if(p1.getPrecio()>p2.getPrecio()) {
			return p1;
		}else if(p2.getPrecio()>p1.getPrecio()) {
			return p2;
		}else {
			return null;
		}
	}

}
