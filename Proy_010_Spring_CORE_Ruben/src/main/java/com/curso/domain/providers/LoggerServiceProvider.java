package com.curso.domain.providers;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.curso.domain.logger.LogFormatter;
import com.curso.domain.services.LoggerService;

@Service
@Lazy
@Scope(scopeName = "singleton")
public class LoggerServiceProvider implements LoggerService {

	private Logger logger;

	public LoggerServiceProvider() {
		this.logger = Logger.getLogger("LoggerServiceProvider");
		this.logger.setUseParentHandlers(false);

		ConsoleHandler handler = new ConsoleHandler();
		Formatter formatter = new LogFormatter();

		handler.setFormatter(formatter);

		this.logger.addHandler(handler);

		this.logger.info("... instanciando LoggerServiceProvider");
	}

	@Override
	public Logger getLogger() {
		return this.logger;
	}

}
