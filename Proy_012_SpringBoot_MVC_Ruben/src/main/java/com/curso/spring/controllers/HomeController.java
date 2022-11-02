package com.curso.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("nombre")
public class HomeController {

	@GetMapping("/")
	public String init(Model model) {
		model.addAttribute("nombre", "luis ramos");
		String nombre = (String) model.getAttribute("nombre");

		return "home";
	}

}
