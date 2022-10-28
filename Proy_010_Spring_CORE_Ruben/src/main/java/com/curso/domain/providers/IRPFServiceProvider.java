package com.curso.domain.providers;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.curso.domain.logger.LogFormatter;
import com.curso.domain.services.IRPFService;

@Service
public class IRPFServiceProvider implements IRPFService {

	private Logger logger;
	private String msg = "";

	public IRPFServiceProvider() {
		super();
		this.logger = Logger.getLogger("IRPFServiceProvider");
		this.logger.setUseParentHandlers(false);

		ConsoleHandler handler = new ConsoleHandler();

		Formatter formatter = new LogFormatter();
		handler.setFormatter(formatter);

		this.logger.addHandler(handler);

		this.logger.info("... instanciando IRPFServiceProvider");
	}

	@Override
	public double calcularIRPF() {

		return 0;
	}

}
