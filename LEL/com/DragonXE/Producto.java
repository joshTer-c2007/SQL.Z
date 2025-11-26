package com.DragonXE;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	public Producto() {
		
	}
	
public Producto(String nombre, double precio, String codigo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
public double incrementarPrecio(double precio,double porcentaje) {
	double resultado;
	resultado=precio+porcentaje*0.10;
	return resultado;
}
public double disminuirPrecio(double precio,double porcentaje) {
	double resultado;
	resultado=precio-porcentaje*0.10;
	return resultado;
}

}
