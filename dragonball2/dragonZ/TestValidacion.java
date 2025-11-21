package com.dragonZ;

import com.dragonball2.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion xd=new Validacion();
		xd.validarMonto(100.00);
		xd.validarMonto(-1);
		xd.validarMonto(190.00);
		xd.validarMonto(200.00);

	}

}
