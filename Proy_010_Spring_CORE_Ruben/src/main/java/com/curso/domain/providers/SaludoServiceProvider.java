package com.curso.domain.providers;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.curso.domain.services.SaludoService;

public class SaludoServiceProvider implements SaludoService {

	private Logger logger;

	public SaludoServiceProvider() {
		this.logger = Logger.getLogger("SaludoServiceProvider");
		this.logger.setLevel(Level.FINER);
		this.logger.info("... instanciando el servicio.");
	}

	public Logger getLogger() {
		return this.logger;
	}

	@Override
	public void saludar(String msg) {
		logger.fine(msg);
		logger.info("Saludo OK.");
		logger.severe("Error gordo del copón!!!");

	}

}
