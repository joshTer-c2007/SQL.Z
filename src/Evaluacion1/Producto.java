package Evaluacion1;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	public Producto(String nombre, double precio, String codigo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void incrementar(int porcentaje) {
		double incremento=(precio*porcentaje)/100.0;
		precio += incremento;
	}
	
	public void disminuir(double descuento) {
		precio -= descuento;
	}
	
	public void mostrarInfo() {
		System.out.println("Producto: "+nombre);
		System.out.println("Precio: "+precio);
		System.out.println("Codigo: "+codigo);
	}

}
