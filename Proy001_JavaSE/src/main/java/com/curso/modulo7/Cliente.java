package com.curso.modulo7;

// uso de clases, metodos y variables FINAL

public class Cliente {

	// No se pueden cambiar las variables FINAL
	private static final double DESCUENTO_MAX = 30.0;
	private String nombre;

	public static double getDescuentoMax() {
		return DESCUENTO_MAX;
	}

	public void verDatos() {
		System.out.println("... los datos del cliente.");
	}

	public final void hazAlgo() {
		System.out.println("Trabajando...");
	}

}

// Las clases FINAL no pueden heredarse
final class ClienteVIP extends Cliente {

	@Override
	public void verDatos() {
		System.out.println("... los datos DE OTRO cliente.");
	}

	// No se puede hacer override de metodos FINAL
//	@Override
//	public void hazAlgo() {
//		System.out.println("Trabajando PUES...");
//	}

}

//class ClienteExtra extends ClienteVIP {
//
//}
