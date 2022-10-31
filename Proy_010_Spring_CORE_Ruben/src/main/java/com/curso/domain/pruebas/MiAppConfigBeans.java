package com.curso.domain.pruebas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.curso.domain.config.ConfigBeans;
import com.curso.domain.entities.Manager;

public class MiAppConfigBeans {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigBeans.class);

		Manager m = (Manager) ctx.getBean("leader1");
		m.manage();

	}

}
