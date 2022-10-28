package com.curso.domain.providers;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.domain.logger.LogFormatter;
import com.curso.domain.services.IRPFService;
import com.curso.domain.services.NominasService;

@Service
public class NominasServiceProvider implements NominasService {
	private Logger logger;
	private String msg = "";

	public NominasServiceProvider() {
		super();
		this.logger = Logger.getLogger("NominasServiceProvider");
		this.logger.setUseParentHandlers(false);

		ConsoleHandler handler = new ConsoleHandler();

		Formatter formatter = new LogFormatter();
		handler.setFormatter(formatter);

		this.logger.addHandler(handler);

		this.logger.info("... instanciando NominasServiceProvider");
	}

	// inyecta en la variable de referencia una instancia de IRPFService
	// TIENE QUE SER UN INTERFACE
	@Autowired
	private IRPFService irpfService;

	@Override
	public void calcularNomina() {
		System.out.println("...entramos en calcularNomina()");
		System.out.println("Tu nomina es: " + irpfService.calcularIRPF());
	}

}
