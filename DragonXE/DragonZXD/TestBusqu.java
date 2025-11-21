package com.DragonZXD;

import com.DragonXE.Celad;
import com.DragonXE.MaquinaDulces;

public class TestBusqu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maq1=new MaquinaDulces();
		maq1.configurarMaquina("A1", "A2", "A3", "A4");
		Celad cel=maq1.buscarCelda("A3");
		System.out.println("Celda encontrada: "+cel.getCodigo());
		Celad cel2=maq1.buscarCelda("A2");
		if(cel2==null) {
			System.out.println("No existe la celda");
		}

	}

}
