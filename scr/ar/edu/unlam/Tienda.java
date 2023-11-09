package ar.edu.unlam;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Tienda {
	
	private String cuit;
	private String nombre;
	private Set<Vendible> producto;
	private Map<Producto, Integer> stock;
	private Set<Cliente> clientes;
	private Set<Venta> ventas;
	private Set<Vendedor> vendedores;
	

	public Tienda(String cuit, String nombreDeLaTienda ) {
		this.cuit = cuit;
		this.nombre = nombreDeLaTienda;
		this.producto = new HashSet<>();
		this.stock =new HashMap<>();
		this.clientes =new HashSet<>();
		this.vendedores =new HashSet<>();
		this.ventas = new HashSet<>();
	}


	public void setProducto(Vendible producto) {
		this.producto.add(producto);
	}

	public void agregarProducto(Producto producto) {
		setProducto(producto);
		
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vendible getVendible(String codigo) throws VendibleInexistenteException {
		for (Vendible actual : producto) {
			if(actual.getCodigo().equals(codigo)) {
				return actual;
			}else { 
				throw new VendibleInexistenteException();
			}
		}
		return null;
	}


	public void agregarProducto(Producto producto, Integer cantidad) {
		setStock(producto, cantidad);
		}
	
	public void descontarProducto(Producto producto, Integer cantidad) throws VendibleInexistenteException, StockInsuficienteException {
		Integer cantidadStock = getStock(producto);
		if (cantidadStock > cantidad) {
			cantidadStock = cantidadStock - cantidad;
			actualizarStock(producto, cantidadStock);
			
			} else {
				throw new StockInsuficienteException();
			}
		
		}


	public Integer getStock(Producto producto) throws VendibleInexistenteException {
	
		for (Entry<Producto, Integer> actual : stock.entrySet()) {
			if( actual.getKey().equals(producto)) {
				return actual.getValue();
			}else {
				throw new VendibleInexistenteException();
			}
		
	}return null;
	}
	
	public void actualizarStock(Producto producto, Integer cantidad) throws VendibleInexistenteException {
		
		for (Entry<Producto, Integer> actual : stock.entrySet()) {
			if( actual.getKey().equals(producto)) {
				actual.setValue(cantidad);
			}else {
				throw new VendibleInexistenteException();
			}
		
	}
	}
	


	public void setStock(Producto producto, Integer cantidad) {
		this.stock.put(producto, cantidad);
	}


	public void agregarCliente(Cliente cliente) {
		setClientes(cliente);
		
	}


	public Cliente getCliente(String cuitEjemplo) throws ClienteInexistenteException {
		for ( Cliente actual : clientes) {
			if ( actual.getCuit().equals(cuitEjemplo)) {
				return actual;
			}else {
				throw new ClienteInexistenteException();
			}
		}
		return null;
	}


	public void setClientes(Cliente clientes) {
		this.clientes.add(clientes);
	}


	public void agregarVendedor(Vendedor vendedor) {
		setVendedores(vendedor);
		
	}


	public Set<Vendedor> getVendedores() {
		return vendedores;
	}


	public void setVendedores(Vendedor vendedores) {
		this.vendedores.add(vendedores);
	}


	public Vendedor getVendedor(String dniEjemplo) throws VendedorInexistenteException {
		for( Vendedor actual : vendedores) {
			if(actual.getDni().equals(dniEjemplo)) {
				return actual;
			}else {
				throw new VendedorInexistenteException();
			}
		}
		return null;
	}


	public void agregarVenta(Venta ticket) {
	setVentas(ticket);
		
	}


	public Set<Venta> getVentas() {
		return ventas;
	}


	public void setVentas(Venta ventas) {
		this.ventas.add(ventas);
	}


	public void agregarProductoAVenta(String codigo, Producto producto2, Integer cantidadVendida) throws VendibleInexistenteException {
		actualizarStock(producto2, cantidadVendida);
		for ( Venta actual : ventas) {
			if ( actual.getCodigo().equals(codigo)) {
				actual.setProductoAVenta(producto2, cantidadVendida);
			}
		}
	
	
	
		
	}
	

}
