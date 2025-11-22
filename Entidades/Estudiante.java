package Entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Double>notas;
	private ArrayList<String>codigosMaterias;
	
	public Estudiante(String nombre, String apellido, String cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.notas = new ArrayList<Double>();
		this.codigosMaterias=new ArrayList<String>();
	}
	
	public ArrayList<String> getCodigosMaterias() {
		return codigosMaterias;
	}

	public void setCodigosMaterias(ArrayList<String> codigosMaterias) {
		this.codigosMaterias = codigosMaterias;
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Double> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}
	
	public void agregarNota(double nota) {
		notas.add(nota);
	}
	
	public void modificar(String codigo,double nota) {
		if(nota<0||nota>10) {
			System.out.println("La nota debe ser entre 0 y 10");
			return;
		}
		for (int i=0;i<codigosMaterias.size();i++){
			if(codigosMaterias.get(i).equalsIgnoreCase(codigo)) {
				notas.set(i, nota);
				System.out.println("Nota modificada");
				return;
			}
		}
	}
	public double calcularPromedio() {
		if(notas.isEmpty()) {
			return 0.0;
		}
		double suma=0.0;
		for(int i=0;i<notas.size();i++) {
			suma += notas.get(i);
		}
		return suma/notas.size();
		
	}
	public void mostrar() {
		for (int i=0;i<codigosMaterias.size();i++) {
			System.out.println(codigosMaterias.get(i)+" "+notas.get(i));
		}
	}
	
	

}
