package com.curso.pruebas;

import java.util.Date;

import com.curso.varios.Saludador;

public class PruebasSaludador {

	public static void main(String[] args) {
		// Uso de la clase saludador
		int numeroCamiones = 2 * (int) Math.PI;
		Date fecha = new Date();

//		1. se puede crear un objeto Saludador
//		s1 es una variable de referencia que apunta a la clase de tipo Saludador
		Saludador s1 = new Saludador();

//		2. pedir saludar pasando nombre -> muestra "hola" + nombre
		System.out.println(s1.saluda("Ruben Catalina"));

//		3. pedir saludar sin nombre -> "hola amigo"
		System.out.println(s1.saluda());

//		4. Crear un saludador en el que indique yo el saludo
		Saludador s2 = new Saludador("Buenos días");

//		5. pedir saludo sin nombre "Buenos días amigo"
		System.out.println(s2.saluda());

	}

}
