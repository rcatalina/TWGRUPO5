package com.curso.domain.pruebas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiApp {

	public static void main(String[] args) {
// 		SIN Spring: inyeccion de la dependencia
//		SaludoService service = new SaludoServiceProvider();
//		service.saludar("Esto es un saludo.");

// 		CON Spring: inyeccion de la dependencia
//		ya no creo instancias de la implementacion del servicio,
//		sino que voy a solicitar al contenedor de Beans de Spring
//		que me entregue una instancia
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mis-beans.xml");

		// si un bean esta en singleton y tiene lazy-init=false,
		// Spring crea una instancia de el automaticamente, sin haberle pedido nada aun

//		SaludoService s1 = (SaludoService) ctx.getBean("saludadorPrototipo");
//		s1.saludar("Soy el saludador 1.");
//
//		SaludoService s2 = (SaludoService) ctx.getBean("saludadorPrototipo");
//		s2.saludar("Soy el saludador 2.");
	}

}
