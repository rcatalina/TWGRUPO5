package com.curso.modulo6.test;

import com.curso.modulo6.domain.Director;
import com.curso.modulo6.domain.Empleado;
import com.curso.modulo6.domain.Gerente;
import com.curso.modulo6.domain.Ingeniero;

public class Pruebas {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Ruben", "Catalina");
		e1.setSalary(Double.valueOf(50000));
		e1.mostrarDetalle();

		Gerente g1 = new Gerente("Manuel", "García");
		g1.setSalary(Double.valueOf(70000));
		g1.setDepartamento("Administración");
		g1.mostrarDetalle();

		Empleado g2 = new Gerente("Sandra", "Ríos");
		g2.setSalary(Double.valueOf(60000));
		g2.mostrarDetalle();

		Empleado i1 = new Ingeniero("Pepe", "Lopez");
		i1.setSalary(Double.valueOf(40000));
		i1.mostrarDetalle();

		Empleado d1 = new Director("Pepe", "Lopez");

		try {
			((Director) d1).aumentarComision(Double.valueOf(1700));
		} catch (Exception e) {
			e.printStackTrace();
		}

		d1.setSalary(Double.valueOf(47000));
		((Director) d1).setDepartamento("Dirección");
		d1.mostrarDetalle();

	}

}
