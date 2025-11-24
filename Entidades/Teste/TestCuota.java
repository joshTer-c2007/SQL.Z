package Teste;

import Entidades.CalculadoraAmortizacion;
import Entidades.Prestamo;

public class TestCuota {
    public static void main(String[] args) {
        Prestamo prestamo = new Prestamo(5000, 12, 12);
        CalculadoraAmortizacion calculadora = new CalculadoraAmortizacion();
        
        double cuota = calculadora.calcularCuota(prestamo);
        
        System.out.println("Cuota: " + cuota);
    }
}
