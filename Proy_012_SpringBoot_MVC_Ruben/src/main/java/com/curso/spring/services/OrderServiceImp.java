package com.curso.spring.services;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.curso.spring.entities.Order;
import com.curso.spring.repository.OrderRepository;

@Service
public class OrderServiceImp implements OrderService {

	private static Logger logger = LoggerFactory.getLogger(OrderServiceImp.class);

	@Autowired
	@Qualifier(value = "orderRepo")
	private OrderRepository repo1;

	@Autowired
	@Qualifier(value = "orderRepoJPA")
	private OrderRepository repo2;

	public OrderServiceImp() {
		logger.info("... instanciando OrderServiceImp.Repositorio 1: {} ", repo1);
		logger.info("... instanciando OrderServiceImp.Repositorio 2: {}", repo2);
	}

	@PostConstruct
	public void onPostConstruct() {
		logger.info("... instanciando OrderRepository. Repositorio 1: {} {}", repo1, repo1);
		logger.info("... instanciando OrderRepository. Repositorio 2: {}", repo2);
	}

	@Override
	public void generateOrder(Order o) {
		logger.info("Has gestionado un pedido.");
		repo1.addOrder(o);
		repo2.addOrder(o);

	}

	@Override
	public List<Order> getAllOrders() {
		return repo1.getAll();
	}

}
