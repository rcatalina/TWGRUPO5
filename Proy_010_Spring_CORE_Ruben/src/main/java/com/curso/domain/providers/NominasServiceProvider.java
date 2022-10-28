package com.curso.domain.providers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.domain.services.IRPFService;
import com.curso.domain.services.NominasService;

@Service
public class NominasServiceProvider implements NominasService {

	public NominasServiceProvider() {
		super();
		System.out.println("...instanciamos NominasServiceProvider()");
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
