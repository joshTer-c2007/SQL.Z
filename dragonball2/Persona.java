package com.dragonball2;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private double estatura;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	private Composicion composicion;

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

	public Composicion getComposicion() {
		return composicion;
	}

	public void setComposicion(Composicion composicion) {
		this.composicion = composicion;
	}

	public void imprimir() {
		System.out.println(
				"nombre " + nombre + " apellido: " + apellido + " direccion: " + composicion.getCallePrincipal() + " "
						+ composicion.getCalleSecundaria() + " " + composicion.getNumero());
	}

}
