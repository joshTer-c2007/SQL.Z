package com.dragonball;

public class Cuentas {
	private String Id;
	private String Tipo;
	private double Saldo;
	
	public Cuentas() {
		System.out.println("CUENTAS XD");
	}
	
	public Cuentas(String Id) {
		this.Id=Id;
	}
	
	public Cuentas(double Saldo) {
		this.Saldo=Saldo;
	}
	
	public Cuentas(String Id,String Tipo, double Saldo) {
		this.Id=Id;
		this.Tipo=Tipo;
		this.Saldo=Saldo;
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public Double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	

}
