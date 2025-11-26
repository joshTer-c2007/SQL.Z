package DokkanXD;

import Evaluacion1.Celda;
import Evaluacion1.Producto;

public class TestContenidoCelda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Celda cel=new Celda("A1");
		Producto p1=new Producto("KE34", 0.85, "Papitas");
		cel.ingresar(p1, 5);
		
		System.out.println("CELDA: "+cel.getCodigo());
		System.out.println("***************************");
		System.out.println("Nombre: "+cel.getProducto().getNombre());
		System.out.println("Precio: "+cel.getProducto().getPrecio());
		System.out.println("Codigo: "+cel.getProducto().getCodigo());
		System.out.println("STOCK: "+cel.getStock());

	}

}
