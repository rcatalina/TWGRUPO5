package com.curso.spring.services;

import com.curso.spring.entities.Order;

/**
 * 
 * @author Alumno
 * 
 * @version 1.0
 * 
 * @apiNote Service that manages all operations related to an order.
 *
 */
public interface OrderService {

	void generateOrder(Order o);
}
