package com.curso.varios;

import java.io.Serializable;
import java.util.Date;

public class Pedido implements Serializable {

	private int idPedido;
	private int idProducto;
	private Date fecha;
	private int cantidad;
	private String observaciones;

	public Pedido(int idPedido, int idProducto, Date fecha, int cantidad, String observaciones) {
		super();
		this.idPedido = idPedido;
		this.idProducto = idProducto;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.observaciones = observaciones;
	}

	public Pedido(int idPedido) {
		// no llamar al constructor super() ya que lo estaríamos llamando 2 veces
		this(idPedido, 0, new Date(), 0, "");
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		//@formatter:off 
		return "PEDIDO\n" 
				+ "ID Pedido: " + this.getIdPedido() + "\n"
				+ "ID Producto: " + this.getIdProducto() + "\n"
				+ "Fecha: " + this.getFecha() + "\n"
				+ "Obervaciones: " + this.getObservaciones() + "\n";
		//@formatter:on

	}

}
