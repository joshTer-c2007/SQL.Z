package Testes;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono>telefonos;
	
	public Contacto(String cedula, String nombre, String apellido, Direccion direccion, ArrayList<Telefono> telefonos) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefonos = new ArrayList<Telefono>();
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	public void Imprimir() {
		System.out.println("*** "+nombre+" "+apellido+" ***");
		if(direccion !=null) {
			System.out.println("Direccion: "+direccion.getCallePrincipal());
		}else {
			System.out.println("No tiene asociada una direccion");
		}
	}
	
	public void agregarTelefono(Telefono telefono) {
		if(telefono !=null) {
			telefonos.add(telefono);
		}
	}
	
	public void mostrarTelefonos() {
		System.out.println("Telefonos con estado C: ");
		for(Telefono tel: telefonos) {
			if(tel.getEstado().equals("C")) {
				System.out.println("- "+tel.getNumero()+" - "+tel.getTipo()+" - "+tel.getEstado());
			}
		}
	}
	
	

}
