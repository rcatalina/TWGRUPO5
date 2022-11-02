package com.curso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.entities.Producto;

@Controller
public class ProductController {

	@RequestMapping("/producto")
	public String saludo(Model model) {
		Producto prod = new Producto();
		prod.setIdProducto(1);
		prod.setDescripcion("adwagdwaj");
		prod.setStock(30);
		prod.setPrecio(3.70);

		model.addAttribute("producto", prod);

		return "producto"; // WEB-INF/vistas/home.jsp
	}
}
