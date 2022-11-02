package com.curso.spring.repository;

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

}
