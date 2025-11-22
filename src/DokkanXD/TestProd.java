package DokkanXD;

import Evaluacion1.Producto;

public class TestProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto pro=new Producto("KE34", 0.85, "Papitas");
		System.out.println("Codigo: "+pro.getCodigo());
		System.out.println("Nombre: "+pro.getNombre());
		System.out.println("Precio: "+pro.getPrecio());
		
		System.out.println("******************************");
		
		pro.setPrecio(0.90);
		System.out.println("Nuevo Precio: "+pro.getPrecio());
		pro.incrementar(50);
		System.out.println("Precio incrementado: "+pro.getPrecio());
		pro.disminuir(0.35);
		System.out.println("Precio incrementado: "+pro.getPrecio());

	}

}
