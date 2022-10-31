package com.curso.domain.providers;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.curso.domain.services.LoggerService;
import com.curso.domain.services.SaludoService;

@Service
@Lazy
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SaludoServiceProvider implements SaludoService {

	private String msg = "";

	@Autowired
	private LoggerService loggerService;

	public SaludoServiceProvider() {
		super();
	}

	public SaludoServiceProvider(String msg1, String msg2) {
		this.msg = msg1 + " " + msg2;
	}

	@PostConstruct
	public void init() {
		loggerService.getLogger().info("... instanciando SaludoServiceProvider");
	}

	public String getMessage() {
		return this.msg;
	}

	@Override
	public void saludar(String msg) {
		String toReturn = this.msg + " " + msg;

		loggerService.getLogger().info(toReturn);

	}

}
