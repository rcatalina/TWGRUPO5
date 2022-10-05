package com.curso.varios;

import java.util.Date;

public class PedidoPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pedido p1 = new Pedido(1);

		p1.setCantidad(10);
		p1.setFecha(new Date());
		p1.setIdProducto(33);
		p1.setObservaciones("Esto es el primer pedido.");

		Pedido p2 = new Pedido(2, 1, new Date(), 10, "Esto es el segundo pedido.");

		System.out.println(p1.toString());
	}

}
