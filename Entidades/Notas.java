package Entidades;

public class Notas {
	private String materia;
	private double calificacion;
	
	
	public Notas(String materia, double calificacion) {
		super();
		this.materia = materia;
		this.calificacion = calificacion;
	}



	public String getMateria() {
		return materia;
	}



	public void setMateria(String materia) {
		this.materia = materia;
	}



	public double getCalificacion() {
		return calificacion;
	}



	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}



	public void mostrar() {
		System.out.println("Materia: "+getMateria()+" "+"Nota obtenida: "+getCalificacion());
	}

}
