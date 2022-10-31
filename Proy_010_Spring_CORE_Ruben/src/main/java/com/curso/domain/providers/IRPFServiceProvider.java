package com.curso.domain.providers;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.curso.domain.services.IRPFService;
import com.curso.domain.services.LoggerService;

@Service
@Lazy
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class IRPFServiceProvider implements IRPFService {

	@Autowired
	private LoggerService loggerService;

	public IRPFServiceProvider() {
		super();
	}

	@PostConstruct
	public void init() {
		loggerService.getLogger().info("... instanciando IRPFServiceProvider");
	}

	@Override
	public double calcularIRPF() {
		return 0;
	}

}
