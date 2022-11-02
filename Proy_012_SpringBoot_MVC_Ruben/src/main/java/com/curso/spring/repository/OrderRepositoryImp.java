package com.curso.spring.repository;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.curso.spring.entities.Order;

@Repository
@Qualifier("orderRepo")
public class OrderRepositoryImp implements OrderRepository {

	private static Logger logger = LoggerFactory.getLogger(OrderRepositoryImp.class);

	public OrderRepositoryImp() {
		logger.info("... instanciando OrderRepositoryImp");
	}

	@Override
	public void addOrder(Order order) {
		logger.info("Has grabado un pedido en la BD.");

	}

	@Override
	public List<Order> getAll() {
		List<Order> listaPedidos = new LinkedList<>();
		listaPedidos.add(new Order("champu", Double.valueOf(3.5)));
		listaPedidos.add(new Order("toalla", Double.valueOf(9.75)));
		listaPedidos.add(new Order("manzana", Double.valueOf(1)));

		return listaPedidos;
	}

}
