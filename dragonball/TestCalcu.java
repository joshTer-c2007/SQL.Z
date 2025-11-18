package com.dragonball;

public class TestCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;
		
		calcu=new Calculadora();
		resultadoSuma=calcu.sumar(5, 8);
		resultadoResta=calcu.restar(10,3);
		resultadoMultiplicacion=calcu.multiplicar(10, 5);
		resultadoDivision=calcu.dividir(10, 2);
		resultadoPromedio=calcu.promediar(10,8 ,9 );
		
		System.out.println("RESULTADO "+resultadoSuma);
		System.out.println("RESULTADO "+resultadoResta);
		System.out.println("RESULTADO "+resultadoMultiplicacion);
		System.out.println("RESULTADO "+resultadoDivision);
		System.out.println("RESULTADO "+resultadoPromedio);
	}

}
