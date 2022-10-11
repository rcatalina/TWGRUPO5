package com.bank.report;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bank.domain.CheckingAccount;
import com.bank.domain.Customer;
import com.bank.domain.SavingsAccount;

public class CustomerReport {

    public static void main(String[] args) {
        Map<String, Customer> customers;
        try {
            customers = CustomerReport.generateCustomers();

            System.out.println("CUSTOMERS REPORT");
            System.out.println("================");

            for (Customer customer : customers.values()) {
                customer.showDetail();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Map<String, Customer> generateCustomers() throws Exception {

        Customer c1 = new Customer("Jane", "Simms");
        c1.addAccount(new SavingsAccount(500, 2));
        c1.addAccount(new CheckingAccount(200, 1500));

        Customer c2 = new Customer("Owen", "Bryant");
        c2.addAccount(new CheckingAccount(200, 1000));

        Customer c3 = new Customer("Tim", "Soley");
        c3.addAccount(new SavingsAccount(1500, 1.5));
        c3.addAccount(new CheckingAccount(200, 1000));

        Customer c4 = new Customer("Maria", "Soley");
        c4.addAccount(new SavingsAccount(200, 1.8));
        c4.addAccount(new CheckingAccount(150, 1000));

        Map<String, Customer> customers = new LinkedHashMap<>();
        customers.put(c1.getId(), c1);
        customers.put(c2.getId(), c2);
        customers.put(c3.getId(), c3);
        customers.put(c4.getId(), c4);

        return customers;
    }

}
