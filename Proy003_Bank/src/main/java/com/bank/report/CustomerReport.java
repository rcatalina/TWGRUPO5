package com.bank.report;

import java.util.List;

import com.bank.domain.Bank;
import com.bank.domain.Customer;

public final class CustomerReport {

    private CustomerReport() {

    }

    public static void generateReport() {
        List<Customer> customers = Bank.getCustomers();

        if (customers == null || customers.isEmpty()) {
            System.out.println("El banco no tiene clientes.");
            return;
        }

        try {

            System.out.println("CUSTOMERS REPORT");
            System.out.println("================");

            for (Customer customer : customers) {
                customer.showDetail();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
