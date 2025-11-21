package com.dragonZ;

import com.dragonball2.AdminTelef;
import com.dragonball2.Telefono;

public class TestTelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono tf1;
		Telefono telf1= new Telefono();
		Telefono telf=new Telefono("Movil", "099873456", 10, true);
		Telefono telf2=new Telefono("Claro", "098637489", 50, true);
		Telefono telf3=new Telefono("Movil", "0945367", 10, true);
		AdminTelef tf=new AdminTelef();
		AdminTelef admin=new AdminTelef();
		 System.out.println("Operadora: "+telf.getOperadora());
		 System.out.println("Telefono: "+telf.getNumero());
		 System.out.println("Codigo: "+telf.getCodigo());
		 
		 System.out.println("Operadora: "+telf2.getOperadora());
		 System.out.println("Telefono: "+telf2.getNumero());
		 System.out.println("Codigo: "+telf2.getCodigo());
		 
		 tf1=tf.activarMensaje(telf);
		 
		 int tf21=admin.contarMovil(telf, telf2, telf3);
		 
		 System.out.println("Tiene wasap?: "+tf1.isTieneWhatsapp());
		 
		 System.out.println("Cantidad de telefono: "+ tf21);
	}

}
