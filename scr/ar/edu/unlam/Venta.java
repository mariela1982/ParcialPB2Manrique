package ar.edu.unlam;

import java.util.HashMap;
import java.util.Map;

public class Venta {
	
	private String factura;
	private Cliente cliente;
	private Vendedor vendedor;
	private Map<Producto, Integer> productoAVenta;

	public Venta(String factura, Cliente cliente, Vendedor vendedor) {
		this.factura = factura;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.productoAVenta = new HashMap<>();
	}

	public Map<Producto, Integer> getProductoAVenta() {
		return productoAVenta;
	}

	public void setProductoAVenta(Producto producto, Integer cantidad) {
		this.productoAVenta.put(producto, cantidad);
	}

	public String getCodigo() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

}
