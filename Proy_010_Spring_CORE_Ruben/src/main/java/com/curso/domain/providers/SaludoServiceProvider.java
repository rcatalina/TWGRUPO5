package com.curso.domain.providers;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;

import com.curso.domain.logger.LogFormatter;
import com.curso.domain.services.SaludoService;

public class SaludoServiceProvider implements SaludoService {

	private Logger logger;
	private String msg = "";

	public SaludoServiceProvider() {
		this.logger = Logger.getLogger("SaludoServiceProvider");
		this.logger.setUseParentHandlers(false);

		ConsoleHandler handler = new ConsoleHandler();

		Formatter formatter = new LogFormatter();
		handler.setFormatter(formatter);

		this.logger.addHandler(handler);

		this.logger.info("... instanciando SaludoServiceProvider");
	}

	public SaludoServiceProvider(String msg1, String msg2) {
		this.logger = Logger.getLogger("SaludoServiceProvider");
		this.logger.setUseParentHandlers(false);

		ConsoleHandler handler = new ConsoleHandler();

		Formatter formatter = new LogFormatter();
		handler.setFormatter(formatter);

		this.logger.addHandler(handler);

		this.logger.info("... instanciando SaludoServiceProvider");

		this.msg = msg1 + " " + msg2;
	}

	public Logger getLogger() {
		return this.logger;
	}

	public String getMessage() {
		return this.msg;
	}

	@Override
	public void saludar(String msg) {
		String toReturn = this.msg + " " + msg;
		logger.info(toReturn);
		logger.severe("Error gordo del copón!!!");

	}

}
