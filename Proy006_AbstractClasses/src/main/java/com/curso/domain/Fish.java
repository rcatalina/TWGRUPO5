package com.curso.domain;

import com.curso.interfaces.Pet;

public class Fish extends Animal implements Pet {

	private String name;

	public Fish() {
		super(0);
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
		System.out.println("Estoy jugando... con burbujitas.");

	}

	@Override
	public void walk() {
		System.out.println("Estoy andando... EEEEH!? ESTOY ANDANDO!?");

	}

	@Override
	public void eat() {
		System.out.println("Nom nom... estoy comiendo escamitas.");

	}

}
