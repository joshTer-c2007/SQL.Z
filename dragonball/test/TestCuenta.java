package com.dragonball.test;

import com.dragonball.Cuentas;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuentas c1= new Cuentas();
		Cuentas c2=new Cuentas("25689", "C", 700);
		Cuentas c3=new Cuentas("15789", "C", 120);
		c1.setSaldo(675);
		c1.setId("236890");
		c1.setTipo("D");
		System.out.println("Saldo cuenta: "+c1.getSaldo());
		System.out.println("Id cuenta: "+c1.getId());
		System.out.println("Tipo Cuenta: "+c1.getTipo());
		
		System.out.println("*******************");
		
		System.out.println("Saldo cuenta: "+c2.getSaldo());
		System.out.println("Id cuenta: "+c2.getId());
		System.out.println("Tipo Cuenta: "+c2.getTipo());
		
		System.out.println("********************");
		
		System.out.println("Saldo cuenta: "+c3.getSaldo());
		System.out.println("Id cuenta: "+c3.getId());
		System.out.println("Tipo Cuenta: "+c3.getTipo());
		
	}

}
