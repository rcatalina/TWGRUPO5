package com.curso.spring.controller;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.entidades.Usuario;
import com.curso.spring.servicios.PedidosService;

@Controller
@SessionAttributes("usuario")
public class PedidosController {

	@Autowired
	private PedidosService pedidoService;

	@GetMapping("/pedidos")
	public String pedidos(Model model) {

		// pedir la lista de pedidos
		Collection<Pedido> lista = pedidoService.getPedidos(null);
		model.addAttribute("listaPedidos", lista);

		return "pedidos";
	}

	// localhost:8080/pedidos/Maite

	@GetMapping("/pedidos/{userName}")
	public String pedidosCliente(Model model, @PathVariable("userName") String name) {

		// pedir la lista de pedidos del usuario
		Collection<Pedido> lista = pedidoService.getPedidos(name);
		model.addAttribute("listaPedidos", lista);

		return "pedidos";
	}

	/// pedido url
	// ?idPedido=1 request params

	@GetMapping("/pedido")
	public String verDetallePedido(Model model, @RequestParam("idPedido") Optional<Integer> id) {

		// hemos declarado opicional id
		// orElse(alternativa) si no aparece devuelve null
		Integer idPedido = id.orElse(null);
		if (id.isEmpty()) { // idPedido == null
			return "redirect:/pedidos";
		}
		Pedido p = pedidoService.getPedido(idPedido);
		model.addAttribute("pedido", p);
		return "detalle-pedido";
	}

	@GetMapping("/pedidos/add")
	public String addPedido(Model model) {

		Usuario user = (Usuario) model.getAttribute("usuario");

		if (user == null) {
			return "redirect:/login";
		}

		Pedido p = new Pedido();
		p.setUser(user.getNombre());

		model.addAttribute("pedido", p);
		return "add-pedido";
	}

	@PostMapping("/pedidos/add")
	public String irAListaPedidos(Model model, @ModelAttribute("pedido") @Valid Pedido p, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "add-pedido";
		}

		boolean valido = true;

		if (valido) {
			p.setEntregado(false);
			p.setFechaPedido(new Date());

			pedidoService.addPedido(p);
		}

		return "redirect:/pedidos";
	}

}
