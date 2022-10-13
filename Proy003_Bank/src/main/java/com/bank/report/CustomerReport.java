package com.bank.report;

import com.bank.domain.Bank;
import com.bank.domain.Customer;

public final class CustomerReport {

    private CustomerReport() {

    }

    public static void generateReport() {
        Customer[] customers = Bank.getCustomers();

        try {

            System.out.println("CUSTOMERS REPORT");
            System.out.println("================");

            for (Customer customer : customers) {
                customer.showDetail();
            }

        } catch (Exception e) {
          

//            if (e instanceof OverdraftException)
//                e.
//                System.out.println("Deficit: " + ((OverdraftException) e).getDeficit());
//            else
                e.printStackTrace();
            
        }

    }

}
