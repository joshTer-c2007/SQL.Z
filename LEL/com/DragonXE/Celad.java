package com.DragonXE;

public class Celad {
	private Producto producto;
	private int stock;
	private String codigo;
	
	public Celad() {
		
	}
	
	public Celad(String codigoCelda) {
		this.codigo=codigoCelda;
	}
	
	public Celad(Celad otro) {
		this.codigo=otro.codigo;
	}
	
	public Celad(Producto producto, int stock, String codigo,String nombre) {
		super();
		this.producto = producto;
		this.stock = stock;
		this.codigo = codigo;
		
	}
	
	public void disminuirStock(int cantidad) {
		if(cantidad <= stock) {
			stock -= cantidad;
		}
	}

	public void ingresarProducto(Producto producto,int stock) {
		this.producto=producto;
		this.stock=stock;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	

}
