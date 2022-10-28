package com.curso.domain.providers;

import org.springframework.stereotype.Service;

import com.curso.domain.services.IRPFService;

@Service
public class IRPFServiceProvider implements IRPFService {

	public IRPFServiceProvider() {
		super();
		System.out.println("...instanciamos IRPFServiceProvider()");
	}

	@Override
	public double calcularIRPF() {

		return 0;
	}

}
