package Teste;

import java.util.ArrayList;

import Entidades.Banco;
import Entidades.CalculadoraAmortizacion;
import Entidades.Cliente;
import Entidades.Prestamo;

public class TestPrestamos {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        Cliente c1 = new Cliente("12345", "Juan", "Perez");
        Cliente c2 = new Cliente("67890", "Ana", "Gomez");
        banco.registrarCliente(c1);
        banco.registrarCliente(c2);
        
        Prestamo p1 = new Prestamo(5000, 12, 12);
        Prestamo p2 = new Prestamo(10000, 8, 24);
        
        System.out.println("--- Asignación de Préstamos ---");
        banco.asignarPrestamo("12345", p1);
        banco.asignarPrestamo("99999", p2); 
        banco.asignarPrestamo("67890", p2);
        
        new CalculadoraAmortizacion().mostrarTabla(p1);
        
        System.out.println("\n--- Búsqueda de Préstamos ---");
        
        ArrayList<Prestamo> prestamosJuan = banco.buscarPrestamos("12345");
        if (prestamosJuan != null) {
            System.out.println("Préstamos de Juan: " + prestamosJuan.size());
        } else {
            System.out.println("Juan no tiene préstamos.");
        }
        
        ArrayList<Prestamo> prestamosInexistente = banco.buscarPrestamos("00000");
        if (prestamosInexistente == null) {
            System.out.println("Búsqueda de 00000 retorna null (Cliente no encontrado).");
        }
    }
}
