package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Prestamo> prestamos;
    private List<Cliente> clientes;
    
    private CalculadoraAmortizacion calculadora = new CalculadoraAmortizacion();

    public Banco() {
        this.prestamos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }

    public void registrarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getCedula()) == null) {
            clientes.add(cliente);
        }
    }
    
    public void asignarPrestamo(String cedulaCliente, Prestamo prestamo) {
        Cliente cliente = buscarCliente(cedulaCliente);
        
        if (cliente == null) {
            System.out.println("No es cliente del banco");
            return;
        }
        
        calculadora.generarTabla(prestamo);
        this.prestamos.add(prestamo); 
    }
    
    public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente) {
        Cliente cliente = buscarCliente(cedulaCliente);
        
        if (cliente == null) {
            return null;
        }
        
        if (this.prestamos.isEmpty()) {
             return null;
        }
        
        return new ArrayList<>(this.prestamos); 
    }
}
