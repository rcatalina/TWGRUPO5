package com.curso.spring.repository;

import java.util.List;

import com.curso.spring.entities.Order;

public interface OrderRepository {

	void addOrder(Order order);

	List<Order> getAll();

}
