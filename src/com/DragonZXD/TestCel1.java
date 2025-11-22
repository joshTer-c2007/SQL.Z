package com.DragonZXD;

import com.DragonXE.Celad;
import com.DragonXE.MaquinaDulces;

public class TestCel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maq=new MaquinaDulces();
		maq.AgregarCelda(new Celad("A"));
		maq.AgregarCelda(new Celad("B"));
		maq.AgregarCelda(new Celad("C"));
		maq.AgregarCelda(new Celad("D"));
		maq.mostrarConfig();
		
	}

}
