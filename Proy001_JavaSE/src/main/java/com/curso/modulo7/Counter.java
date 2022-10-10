package com.curso.modulo7;

public class Counter {

	private int serialNumber;
	private static int cont = 0;

	public Counter() {
		this.serialNumber = ++cont;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public static int getCounter() {
		// OJO no se puede acceder a atributos no static en un metodo static
//		return serialNumber;

		return cont;
	}

	public static void setCounter(int counter) {
		Counter.cont = counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Counter vale " + Counter.cont + ".");

		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

		System.out.println("Serial number C1 vale " + c1.serialNumber + ".");
		System.out.println("Serial number C2 vale " + c2.serialNumber + ".");
		System.out.println("Serial number C3 vale " + c3.serialNumber + ".");

	}

}
