package com.dragonball2;

public class AdminTelef {
	public Telefono activarMensaje(Telefono n1) {
		if(n1.getNumero().equalsIgnoreCase("movil")) {
			n1.setTieneWhatsapp(true);
		}
		return n1;
	}
	public int contarMovil(Telefono m1,Telefono m2,Telefono m3) {
		int contador=0;
		
		if(m1.getOperadora().equalsIgnoreCase("movil"))contador ++;
		if(m2.getOperadora().equalsIgnoreCase("movil"))contador ++;
		if(m3.getOperadora().equalsIgnoreCase("movil"))contador ++;
		
		return contador;
	}
	public int contarMovil1(Telefono m1,Telefono m2,Telefono m3) {
		int contador=0;
		
		if(m1.getOperadora().equalsIgnoreCase("claro"))contador ++;
		if(m2.getOperadora().equalsIgnoreCase("claro"))contador ++;
		if(m3.getOperadora().equalsIgnoreCase("claro"))contador ++;
		
		return contador;
	}

}
