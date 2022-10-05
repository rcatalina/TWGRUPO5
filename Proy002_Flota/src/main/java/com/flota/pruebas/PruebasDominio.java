package com.flota.pruebas;

import com.flota.dominio.Caja;
import com.flota.dominio.Vehiculo;
import com.flota.enums.MeasUnitNameEnum;

public class PruebasDominio {

	public static void main(String[] args) {
		Vehiculo v1 = new Vehiculo(1500.5, "46778XE");

		try {
			Caja c1 = new Caja(50, 30, 20, 500.75, MeasUnitNameEnum.CENTIMETER, MeasUnitNameEnum.KILOGRAM);

			v1.setCargaMax(61.03);

			System.out.println("Carga máxima vehículo 1: " + v1.getCargaMax());
			System.out.printf("El camión con matrícula %s tiene una carga actual de %.02f kg %n", v1.getMatricula(),
					v1.getCargaActual());

			System.out.println("Cargo una caja de 60 kg.");

			v1.cargarCaja(c1);

			System.out.printf("El camión con matrícula %s tiene una carga actual de %.02f kg %n", v1.getMatricula(),
					v1.getCargaActual());

		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("ERROR: " + e.getMessage());
			return;
		}

	}

}
