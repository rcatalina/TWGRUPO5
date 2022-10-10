package com.curso.modulo6.domain;

public class Secretario extends Empleado {

	private String numSegSocial;

	public Secretario(String name, String surname) {
		super(name, surname);
		// TODO Auto-generated constructor stub
	}

	public String getNumSegSocial() {
		return numSegSocial;
	}

	public void setNumSegSocial(String numSegSocial) {
		this.numSegSocial = numSegSocial;
	}

	public void atenderLlamada() {
		System.out.println("Estoy atendiendo llamadas...");
	}

	@Override
	public void mostrarDetalle() {
		super.mostrarDetalle();
		System.out.println("Nº SEG. SOCIAL: " + this.numSegSocial);
	}

}
