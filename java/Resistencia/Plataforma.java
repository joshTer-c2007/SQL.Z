package Resistencia;

public class Plataforma {
	private int id_plataforma;
	private String nombre_plataforma;
	private int codigo_videojuego;
	
	public Plataforma() {
		
	}
	
	public Plataforma(int id_plataforma, String nombre_plataforma, int codigo_videojuego) {
		super();
		this.id_plataforma = id_plataforma;
		this.nombre_plataforma = nombre_plataforma;
		this.codigo_videojuego = codigo_videojuego;
	}

	public int getId_plataforma() {
		return id_plataforma;
	}

	public void setId_plataforma(int id_plataforma) {
		this.id_plataforma = id_plataforma;
	}

	public String getNombre_plataforma() {
		return nombre_plataforma;
	}

	public void setNombre_plataforma(String nombre_plataforma) {
		this.nombre_plataforma = nombre_plataforma;
	}

	public int getCodigo_videojuego() {
		return codigo_videojuego;
	}

	public void setCodigo_videojuego(int codigo_videojuego) {
		this.codigo_videojuego = codigo_videojuego;
	}

	@Override
	public String toString() {
		return "Plataforma [id_plataforma=" + id_plataforma + ", nombre_plataforma=" + nombre_plataforma
				+ ", codigo_videojuego=" + codigo_videojuego + "]";
	}
	

}
