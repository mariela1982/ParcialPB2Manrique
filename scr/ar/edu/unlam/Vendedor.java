package ar.edu.unlam;

public class Vendedor {
	private String dni ;
	private String nombre;

	public Vendedor(String dniEjemplo, String string) {
		this.dni = dniEjemplo;
		this.nombre = string;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
