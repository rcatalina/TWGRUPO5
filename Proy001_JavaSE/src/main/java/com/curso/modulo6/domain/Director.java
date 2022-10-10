package com.curso.modulo6.domain;

public class Director extends Gerente {

	private Double comision;

	public Double getComision() {
		return comision;
	}

	public Director(String name, String surname) {
		super(name, surname);
		this.comision = Double.valueOf(0);
	}

	public void aumentarComision(Double inc) throws Exception {
		if (inc != null)
			this.comision += inc;
		else
			throw new Exception("El aumento de comision no puede ser NULL.");
	}

	@Override
	public void mostrarDetalle() {
		super.mostrarDetalle();

		if (this.comision != null)
			System.out.println("COMISION: " + this.comision);
	}

}
