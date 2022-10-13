package com.bank.domain;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private Map<String, Account> accounts;

    public Customer(String firstName, String lastName) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new LinkedHashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    public int getNumAccounts() {
        return accounts.size();
    }

    public Account getAccount(String id) {
        return this.accounts.get(id);
    }

    public void addAccount(Account account) throws Exception {
        String accountID = account.getId();

        if (accountID == null)
            throw new Exception("La cuenta a añadir no puede ser un NULL.");

        if (accounts.get(accountID) == null) {
            this.accounts.put(accountID, account);
        } else
            throw new Exception("La cuenta a añadir ya existe.");

    }

    public void deleteAccount(Account account) throws Exception {
        String accountID = account.getId();

        if (accountID == null)
            throw new Exception("La cuenta a eliminar no puede ser un NULL.");

        if (accounts.get(accountID) == null)
            throw new Exception("La cuenta a eliminar no existe.");
        else
            this.accounts.remove(accountID);

    }

    public void showDetail() throws Exception {
        System.out.println("\nCustomer: " + this.lastName + ", " + this.firstName);

        if (this.accounts.size() > 0) {
            for (Account account : this.accounts.values()) {
                String nameToShow;

                if (account instanceof SavingsAccount)
                    nameToShow = "Savings Account";
                else if (account instanceof CheckingAccount)
                    nameToShow = "Checking Account";
                else
                    throw new Exception("Estamos recibiendo un tipo de cuenta que no está contemplada.");

                System.out.println(nameToShow + ": current balance is " + account.getBalance() + ".");

            }
        }

    }

}
