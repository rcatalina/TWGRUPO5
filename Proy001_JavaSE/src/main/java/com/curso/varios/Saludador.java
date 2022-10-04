package com.curso.varios;

//JVM cargar la clase com.curso.varios.Saludador

public class Saludador {

//	atributos
	String message;

//	constructores
	public Saludador() {
		super();
		this.message = "Hola";
	}

	public Saludador(String message) {
		this.message = message;
	}

//	métodos
	public String saluda(String nombreUsuario) {
		return "Hola " + nombreUsuario;
	}

	public String saluda() {
		return this.message + " amigo";
	}

}
