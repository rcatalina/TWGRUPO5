package com.bank.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Bank {
    private static String id = UUID.randomUUID().toString();
    private static String name = "Kutxabank";
    private static List<Customer> customers = new ArrayList<>();

    private Bank() {
        super();
    }

    public static String getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public static Customer getCustomer(int index) throws Exception {

        if (customers == null)
            throw new Exception("ERROR\nEl banco no tiene clientes.");

        if (index < 0)
            throw new Exception("ERROR\nEl valor introducido para el índice deber ser igual o superior a 0.");

        if (index >= customers.size())
            throw new Exception("ERROR\nNo existe el cliente relativo a ese índice.");

        return customers.get(index);
    }

    public static List<Customer> getCustomers() {
        return customers;
    }

    public static int getNumberOfCustomers() {
        return customers.size();
    }

    public static void addCustomer(String firstName, String lastName) throws Exception {
        if (firstName == null || firstName.isBlank() || lastName == null || lastName.isBlank())
            throw new Exception("ERROR\nEl nombre y apellido del cliente no pueden estar vacíos.");

        Customer customer = new Customer(firstName, lastName);

        Bank.addCustomer(customer);
    }

    public static void addCustomer(Customer customer) throws Exception {
        customers.add(customer);
    }

}
