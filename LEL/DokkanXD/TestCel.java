package DokkanXD;

import Evaluacion1.Celda;

public class TestCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre());
		
		System.out.println("CELDA: "+celda.getProducto());
		System.out.println("Nombre Producto: "+celda.getProducto().getNombre());
		System.out.println("Precio Producto: "+celda.getProducto().getPrecio());
		System.out.println("Codigo Producto: "+celda.getProducto().getCodigo());
		System.out.println("Stock: "+celda.getStock());
		System.out.println("***********************************");

	}

}
