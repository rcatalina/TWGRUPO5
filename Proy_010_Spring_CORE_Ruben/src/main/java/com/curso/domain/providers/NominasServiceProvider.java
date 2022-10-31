package com.curso.domain.providers;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.curso.domain.services.IRPFService;
import com.curso.domain.services.LoggerService;
import com.curso.domain.services.NominasService;

@Service
@Lazy
@Scope(scopeName = "singleton")
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
	public void init() {
		loggerService.getLogger().info("... instanciando NominasServiceProvider");
	}

	@Override
	public void calcularNomina() {
		loggerService.getLogger().info("...entramos en calcularNomina()");
		loggerService.getLogger().info("Tu nomina es: " + irpfService.calcularIRPF());
	}

}
