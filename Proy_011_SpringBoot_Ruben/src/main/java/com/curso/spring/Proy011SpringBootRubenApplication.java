package com.curso.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso.spring.entities.Order;
import com.curso.spring.services.OrderService;

@SpringBootApplication
public class Proy011SpringBootRubenApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService1;

	public static void main(String[] args) {
		SpringApplication.run(Proy011SpringBootRubenApplication.class, args);
	}

	// esto es una buena practica, en vez de enguarrar el main
	// la clase que contiene el main debe implementar CommandLineRunner
	@Override
	public void run(String... args) throws Exception {
		orderService1.generateOrder(new Order());

	}

}
