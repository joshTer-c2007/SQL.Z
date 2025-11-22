package Entidades;

import java.util.ArrayList;

public class Curso {
	ArrayList<Estudiante>estudiantes;
	
	public Curso(){
		this.estudiantes=new ArrayList<Estudiante>();
	}
	
	public String buscarEstuXCedula(Estudiante estudiante) {
		String cedulaBuscar=estudiante.getCedula();
		for(Estudiante est:estudiantes) {
			if (est.getCedula().equals(cedulaBuscar)) {
				return "El estudiante con cedula "+cedulaBuscar+" ya esta registrado";
			}
		}
		return null;
	}
	
	public void matriculaEst(Estudiante estudiante) {
		String resultadoBusque=buscarEstuXCedula(estudiante);
		if(resultadoBusque==null) {
			estudiantes.add(estudiante);
			System.out.println("Estudiante con cedula "+estudiante.getCedula());
		}else {
			System.out.println("No se pudo matricular "+resultadoBusque);
		}
	}
	public double calcular() {
		if(estudiantes.isEmpty()) {
			return 0.0;
		}
		double sumaPromedio=0.0;
		for(Estudiante est: estudiantes) {
			double sumaPromedio2 = sumaPromedio;
		}
		double promedioClase=sumaPromedio/estudiantes.size();
		return promedioClase;
		
	}

}
