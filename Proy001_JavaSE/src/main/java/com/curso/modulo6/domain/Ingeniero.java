package com.curso.modulo6.domain;

public class Ingeniero extends Empleado {

	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Ingeniero(String name, String surname) {
		super(name, surname);
		// TODO Auto-generated constructor stub
	}

	public void pensar() {
		System.out.println("Estoy pensando...");
	}

	@Override
	public void mostrarDetalle() {
		super.mostrarDetalle();

		if (this.category != null)
			System.out.println("CATEGORÍA: " + this.category);
	}

}
