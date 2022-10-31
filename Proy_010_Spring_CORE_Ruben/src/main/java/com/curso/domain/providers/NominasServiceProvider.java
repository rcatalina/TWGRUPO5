package com.curso.domain.providers;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.curso.domain.services.IRPFService;
import com.curso.domain.services.LoggerService;
import com.curso.domain.services.NominasService;

@Service
@Lazy
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class NominasServiceProvider implements NominasService {

	// inyecta en la variable de referencia una instancia de IRPFService
	// TIENE QUE SER UN INTERFACE
	@Autowired
	private IRPFService irpfService;

	@Autowired
	private LoggerService loggerService;

	public NominasServiceProvider() {
		super();
	}

	// Esta etiqueta es para usar las dependencias @autowired tras pasar por el
	// constructor
	// NO SE PUEDEN USAR DEPENDENCIAS EN EL CONSTRUCTOR
	@PostConstruct
	public void onPostConstruct() {
		// entra aqui justo despues de construir la instancia
		loggerService.getLogger().info("... instanciando NominasServiceProvider");
	}

	@PreDestroy
	public void onPreDestroy() {
		// entra aqui justo antes de destruir la instancia
	}

	@Override
	public void calcularNomina() {
		loggerService.getLogger().info("... entramos en calcularNomina()");
		loggerService.getLogger().info("Tu nomina es: " + irpfService.calcularIRPF());
	}

}
