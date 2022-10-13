package com.curso.test;

import com.curso.domain.Animal;
import com.curso.domain.Cat;
import com.curso.domain.Fish;
import com.curso.domain.Spider;
import com.curso.interfaces.Pet;

public class TestAnimals {

	public static void main(String[] args) {
		Fish fish = new Fish();
		Cat cat = new Cat();
		Animal a1 = new Fish();
		Animal a2 = new Spider();
		Pet p = new Cat();

		fish.play();
		cat.play();

		fish.walk();
		cat.walk();

		a2.eat();
		a2.walk();

		a1.walk();

		p.setName("Calcetines");
	}

}
