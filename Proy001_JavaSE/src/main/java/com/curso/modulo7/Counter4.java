package com.curso.modulo7;

public class Counter4 {

	// para inicializar variables static
	// opcion 1
	private static int count = 0;

	// opcion 2
	static {
		count = 0;

		// Este bloque tiene su utilidad si para inicializar esta variable hay que hacer
		// un fetch a BBDD, por ejemplo:

		// appService. getValorBD("asdajdgas");
	}
}
