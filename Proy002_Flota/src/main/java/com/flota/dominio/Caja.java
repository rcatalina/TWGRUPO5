package com.flota.dominio;

import com.flota.enums.MeasUnitNameEnum;
import com.flota.generic.MeasurementUnit;

public class Caja {

	private double ancho;
	private double largo;
	private double fondo;
	private MeasurementUnit distanceUnit;

	private double peso;
	private MeasurementUnit massUnit;

	public Caja(int ancho, int largo, int fondo, double peso, MeasUnitNameEnum distanceUnitName,
			MeasUnitNameEnum massUnitName) throws Exception {
		if (ancho <= 0 || largo <= 0 || fondo <= 0 || peso <= 0)
			throw new Exception("Cada uno de los valores de la caja debe ser superior a 0.");

		this.ancho = ancho;
		this.largo = largo;
		this.fondo = fondo;
		this.distanceUnit = new MeasurementUnit(distanceUnitName);

		this.peso = peso;
		this.massUnit = new MeasurementUnit(massUnitName);

	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getFondo() {
		return fondo;
	}

	public void setFondo(double fondo) {
		this.fondo = fondo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) throws Exception {
		if (peso <= 0)
			throw new Exception("El peso de la caja no puede ser igual o menor a 0.");

		this.peso = peso;
	}

}
