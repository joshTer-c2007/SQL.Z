package Teste;

import Entidades.Cuota;

public class TestImpresion {
    public static void main(String[] args) {
        Cuota cuotaPrueba = new Cuota(1);
        cuotaPrueba.setCuota(444.24394339170806); 
        cuotaPrueba.setInicio(5000.0);
        cuotaPrueba.setInteres(50.0);
        cuotaPrueba.setAbonoCapital(394.24394339170806);
        cuotaPrueba.setSaldo(4605.756056608292);
        
        System.out.println(cuotaPrueba.mostrarPrestamo());
    }
}
