package com.bank.domain;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Bank {
	private String id;
	private String name;
	private Customer[] customers;
	private Integer numberOfCustomers;

	public Bank(String name, Customer[] customers) throws Exception {
		super();

		validate(name, customers);

		this.id = UUID.randomUUID().toString();
		this.name = name;

		if (customers == null) {
			this.customers = new Customer[5];
			this.numberOfCustomers = 5;
		} else {
			this.customers = customers;
			this.numberOfCustomers = customers.length;
		}

	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer getCustomer(int index) throws Exception {
		if (this.customers == null)
			throw new Exception("ERROR\nEl banco no tiene clientes.");

		if (index < 0)
			throw new Exception("ERROR\nEl valor introducido para el índice deber ser igual o superior a 0.");

		if (index >= this.customers.length)
			throw new Exception("ERROR\nNo existe el cliente relativo a ese índice.");

		return this.customers[index];
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public Integer getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public void addCustomer(String firstName, String lastName) throws Exception {
		if (firstName == null || firstName.isBlank() || lastName == null || lastName.isBlank())
			throw new Exception("ERROR\nEl nombre y apellido del cliente no pueden estar vacíos.");

		Customer customer = new Customer(firstName, lastName);

		List<Customer> customerList = new LinkedList<>();

		for (int i = 0; i < customers.length; i++) {
			customerList.add(this.customers[i]);
		}

		customerList.add(customer);

		this.customers = (Customer[]) customerList.toArray();
		this.numberOfCustomers++;
	}

	private void validate(String name, Customer[] customers) throws Exception {
		boolean hasError = false;
		List<String> errMessages = new LinkedList<>();

		if (name == null || name.isBlank()) {
			hasError = true;
			errMessages.add("El nombre del banco no puede estar vacío.\n");
		}

		if (customers != null && customers.length < 5) {
			hasError = true;
			errMessages.add("En caso de introducir una lista de clientes, ésta debe contener al menos 5.\n");
		}

		if (hasError) {
			String e = "ERROR\n";

			for (String msg : errMessages) {
				e = e.concat(msg + " ");
			}

			throw new Exception(e);
		}
	}

}
