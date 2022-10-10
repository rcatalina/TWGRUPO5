package com.curso.modulo6.domain;

public class Gerente extends Empleado {

	private String departamento;

	public Gerente(String name, String surname) {
		super(name, surname);
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public void mostrarDetalle() {
		super.mostrarDetalle();

		if (this.departamento != null)
			System.out.println("DPTO: " + this.departamento);
	}
}
