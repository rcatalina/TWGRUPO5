package com.curso.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.curso.spring.services.OrderService;

@Controller
@SessionAttributes("nombre")
public class OrdersController {

	@Autowired
	OrderService orderService;

	@GetMapping("/orders")
	public String init(Model model) {

		String nombre = (String) model.getAttribute("nombre");
		model.addAttribute("lista", orderService.getAllOrders());

		return "orders";
	}
}
