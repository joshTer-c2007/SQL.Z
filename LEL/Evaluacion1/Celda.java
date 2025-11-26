package Evaluacion1;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	
	public Celda(String Codigo) {
		this.codigo=Codigo;
	}
	
	public void ingresar (Producto producto,int stock) {
		this.producto=producto;
		this.stock=stock;
		
	}
	public Celda(Producto producto, int stock, String codigo) {
		super();
		this.producto = producto;
		this.stock = stock;
		this.codigo = codigo;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

}
