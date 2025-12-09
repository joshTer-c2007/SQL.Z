package Resistencia;

public class Persona {
	private int codigo;
	private String nombre;
	private String descripcion;
	private int valoracion;
	private Plataforma plataforma;
	
	public Persona() {
		
	}
	
	
	public Persona(int codigo, String nombre, String descripcion, int valoracion, Plataforma plataforma) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.valoracion = valoracion;
		this.plataforma = plataforma;
	}
	 
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getValoracion() {
		return valoracion;
	}
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	public Plataforma getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}


	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", valoracion="
				+ valoracion + ", plataforma=" + plataforma + "]";
	}
	
	
	
	

}
