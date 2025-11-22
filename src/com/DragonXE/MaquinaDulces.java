package com.DragonXE;

import java.util.ArrayList;

public class MaquinaDulces {
	private Celad celda1;
	private Celad celda2;
	private Celad celda3;
	private Celad celda4;
	private double saldo;
	private ArrayList<Celad> celdas;
	
	public ArrayList<Celad> getCeldas() {
		return celdas;
	}
	
	public MaquinaDulces(ArrayList<Celad> celdas,double saldo) {
		celdas=new ArrayList<Celad>();
		saldo=0;
	}
	

	public void setCeldas(ArrayList<Celad> celdas) {
		this.celdas = celdas;
	}

	public MaquinaDulces(Celad celda1, Celad celda2, Celad celda3, Celad celda4, double saldo) {
		super();
		this.celda1 = celda1;
		this.celda2 = celda2;
		this.celda3 = celda3;
		this.celda4 = celda4;
		this.saldo = saldo;
	}
	
	 public MaquinaDulces() {
	        celda1 = new Celad("");
	        celda2 = new Celad("");
	        celda3 = new Celad("");
	        celda4 = new Celad("");
	        saldo = 0;
	    }
	

	public Celad getCelda1() {
		return celda1;
	}
	public void setCelda1(Celad celda1) {
		this.celda1 = celda1;
	}
	public Celad getCelda2() {
		return celda2;
	}
	public void setCelda2(Celad celda2) {
		this.celda2 = celda2;
	}
	public Celad getCelda3() {
		return celda3;
	}
	public void setCelda3(Celad celda3) {
		this.celda3 = celda3;
	}
	public Celad getCelda4() {
		return celda4;
	}
	public void setCelda4(Celad celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void configurarMaquina(String c1,String c2,String c3,String c4) {
		celda1.setCodigo(c1);
		celda2.setCodigo(c2);
		celda3.setCodigo(c3);
		celda4.setCodigo(c4);
	}
	
	public Celad buscarCelda(String codigoCelda) {
		if(celda1.getCodigo().equals(codigoCelda))return celda1;
		if(celda2.getCodigo().equals(codigoCelda))return celda2;
		if(celda3.getCodigo().equals(codigoCelda))return celda3;
		if(celda4.getCodigo().equals(codigoCelda))return celda4;
		
		return null;
	}
	public void cargarProducto(Producto producto,String codigoCelda, int cantidad) {
		Celad celdaRecuperada=buscarCelda(codigoCelda);
		if(celdaRecuperada !=null) {
			celdaRecuperada.ingresarProducto(producto, cantidad);
		}
	}
	private void mostrarInfoCelda(Celad celda) {
		System.out.println("----------------------");
		System.out.println("Celda: "+celda.getCodigo());
		System.out.println("Stock: "+celda.getStock());
		if(celda.getProducto()!=null) {
			System.out.println("Producto: "+celda.getProducto().getNombre());
			System.out.println("Precio: "+celda.getProducto().getPrecio());
		}else {
			System.out.println("Producto: (Vacio XD)");
		}
	}
	public void mostrarProducto() {
		mostrarInfoCelda(celda1);
		mostrarInfoCelda(celda2);
		mostrarInfoCelda(celda3);
		mostrarInfoCelda(celda4);
	}
	public Celad buscarCeldaProducto(Producto producto){
		if(celda1.getProducto()==producto)return celda1;
		if(celda2.getProducto()==producto)return celda2;
		if(celda3.getProducto()==producto)return celda3;
		if(celda2.getProducto()==producto)return celda4;
		
		return null;
	}
	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celad c=buscarCelda(codigoCelda);
		if (c!=null) {
			return c.getProducto();
		}else {
			return null;
		}
	}
	public double consultarPrecio(String codigoCelda) {
		Producto p=buscarProductoEnCelda(codigoCelda);
		if(p!=null) {
			return p.getPrecio();
		}else {
			return 0;
		}
	}
	public void incrementarProductos(String codigoProducto,int cantidad) {
		Celad celdaEncontrada=buscarCeldaProducto(new Producto(codigoProducto, 0, codigoProducto));
		if(celdaEncontrada!=null) {
		int NuevoStock=celdaEncontrada.getStock()+cantidad;
		celdaEncontrada.ingresarProducto(celdaEncontrada.getProducto(), NuevoStock);
		}
	}
	public void Vender(String codigoCelda) {
		Celad celda=buscarCelda(codigoCelda);
		if(celda !=null && celda.getStock()>0){
			celda.disminuirStock(1);
			double precio=celda.getProducto().getPrecio();
			saldo+=precio;
			mostrarProducto();
		}
	}
	public double venderConCambio(String codigoCelda,double dineroCliente) {
		Celad celda=buscarCelda(codigoCelda);
		if(celda != null && celda.getStock()>0) {
			double precio=celda.getProducto().getPrecio();
			if(dineroCliente>=precio) {
				celda.disminuirStock(1);
				saldo +=precio;
				double vuelto=dineroCliente-precio;
				return vuelto;
			}
		}
		return dineroCliente;
	}
	public void AgregarCelda(Celad codigoCelda) {
		Celad nuevaCel=new Celad(codigoCelda.getCodigo());
		celdas.add(nuevaCel);
	}
	public void mostrarConfig() {
		System.out.println("Configuracion de la maquina: ");
		for(Celad celda : celdas) {
			System.out.println("Codigo de celda: "+celda.getCodigo());
		}
	}

}
