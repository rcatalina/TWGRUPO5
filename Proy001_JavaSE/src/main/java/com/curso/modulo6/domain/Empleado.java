package com.curso.modulo6.domain;

public class Empleado {

    private static final Double SALARIO_BASE = Double.valueOf(12000);

    private String name;
    private String surname;
    private Double salary;

    public Empleado(String name, String surname) {
        super();
        this.name = name;
        this.surname = surname;
    }

    public static Double getSalarioBase() {
        return SALARIO_BASE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void mostrarDetalle() {
        System.out.println("\nEMPLEADO");
        System.out.println("TIPO: " + this.getClass().getSimpleName());
        System.out.println("Nombre: " + this.name);
        System.out.println("Apellido: " + this.surname);
        System.out.println("Salario: " + this.salary);
    }

    public static void saludar() {
        System.out.println("Hola!");

    }

}
