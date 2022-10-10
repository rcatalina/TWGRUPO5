package com.curso.modulo6.domain;

public class Animal {

	private String sonido;

	public static void main(String[] args) {
		Gato g = new Gato();
		Animal a = new Perro();
		Perro p = new Perro();

		// Polimorfismo
		PerroCaza pCaza = new PerroCaza();
		a = pCaza;
		p = pCaza;

		String s1 = ((PerroCaza) a).getRaza();
	}

}

class Gato extends Animal {
	private String familia;
}

class Perro extends Animal {
	private String raza;
}

class PerroCaza extends Perro {
	private String raza;

	public String getRaza() {
		return raza;
	}
}
