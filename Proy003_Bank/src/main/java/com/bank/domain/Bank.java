package com.bank.domain;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public final class Bank {
    private static String id = UUID.randomUUID().toString();
    private static String name = "Kutxabank";
    private static Customer[] customers = {};
    private static Integer numberOfCustomers = 0;

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

        if (index >= customers.length)
            throw new Exception("ERROR\nNo existe el cliente relativo a ese índice.");

        return customers[index];
    }

    public static Customer[] getCustomers() {
        return customers;
    }

    public static Integer getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public static void addCustomer(String firstName, String lastName) throws Exception {
        if (firstName == null || firstName.isBlank() || lastName == null || lastName.isBlank())
            throw new Exception("ERROR\nEl nombre y apellido del cliente no pueden estar vacíos.");

        Customer customer = new Customer(firstName, lastName);

        List<Customer> customerList = Arrays.asList(customers);
        customerList.add(customer);

        customers = (Customer[]) customerList.toArray();
        numberOfCustomers++;
    }

//    private static void validate(String name, Customer[] customers) throws Exception {
//        boolean hasError = false;
//        List<String> errMessages = new LinkedList<>();
//
//        if (name == null || name.isBlank()) {
//            hasError = true;
//            errMessages.add("El nombre del banco no puede estar vacío.\n");
//        }
//
//        if (customers != null && customers.length < 5) {
//            hasError = true;
//            errMessages.add("En caso de introducir una lista de clientes, ésta debe contener al menos 5.\n");
//        }
//
//        if (hasError) {
//            String e = "ERROR\n";
//
//            for (String msg : errMessages) {
//                e = e.concat(msg + " ");
//            }
//
//            throw new Exception(e);
//        }
//    }

}
