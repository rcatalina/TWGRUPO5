package com.curso.varios;

public class EjemploVariablesReferenciaHeap {

	public static void main(String[] args) {
		Alumno a = new Alumno("Ruben", "Catalina");
		metodo1(a);
		System.out.println("fin main");
	}

	public static void metodo1(Alumno a) {
		Alumno b = a;
		b.setName("akdhad");
		metodo2();

		System.out.println("fin metodo1");
	}

	private static void metodo2() {
		Alumno c = new Alumno("Sara", "Martínez");
		System.out.println("fin metodo2");
	}

}
