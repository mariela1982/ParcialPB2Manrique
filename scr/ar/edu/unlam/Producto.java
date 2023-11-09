package ar.edu.unlam;

public class Producto implements Vendible {
	private String codigo;
	private String nombre;
	private Double precio;


	public Producto(String codigo, String nombre, Double precio) {
		this.setCodigo(codigo);
		this.nombre = nombre;
		this.precio = precio;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}


	
	
	

}
