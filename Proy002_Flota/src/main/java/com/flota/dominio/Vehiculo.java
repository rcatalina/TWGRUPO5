package com.flota.dominio;

public class Vehiculo {

//	atributos
	private double cargaMaxima;
	private double cargaActual = 0;
	private String matricula;
	private int numCajas = 0;

//	public final double CARGA_MAX_POR_DEFECTO = 5990.3;

//	constructores
	public Vehiculo(double cargaMaxima, String matricula) {
		this.cargaMaxima = cargaMaxima;
		this.matricula = matricula;
	}

//	metodos
	public double getCargaMax() {
		return cargaMaxima;
	}

	public void setCargaMax(double cargaMax) throws Exception {
		if (cargaMax < 0)
			throw new Exception("La carga máxima no puede ser negativa.");

		this.cargaMaxima = cargaMax;
	}

	public double getCargaActual() {
		return cargaActual;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumCajas() {
		return numCajas;
	}

	/**
	 * Método que recibe la caja a cargar e incrementa el peso actual del camión y
	 * el número de cajas cargadas. Si el peso no es válido, lanza una excepción.
	 * 
	 * @param caja
	 * @throws Exception
	 */
	public void cargarCaja(Caja caja) throws Exception {
		double peso = caja.getPeso();

		if (peso < 0)
			throw new Exception("El peso de la caja no puede ser negativo");
		else if (this.cargaActual + peso > this.cargaMaxima)
			throw new Exception("El peso a cargar supera la carga máxima del vehículo.");

		this.cargaActual += peso;
		this.numCajas++;

	}

}
