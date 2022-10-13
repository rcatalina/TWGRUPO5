package com.curso.domain;

import com.curso.interfaces.Pet;

public class Cat extends Animal implements Pet {

	private String name;

	public Cat() {
		super(4);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("Estoy jugando... con un ratón muerto.");
	}

	@Override
	public void eat() {
		System.out.println("Nom nom... estoy comiendo pienso");

	}

}
