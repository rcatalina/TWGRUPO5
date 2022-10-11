package com.bank.domain;

import java.util.UUID;

public class Account {
    private String id;
    private double balance = 0;

    public Account(double initBalance) {
        this.id = UUID.randomUUID().toString();
        this.balance = initBalance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean deposit(double amt) throws Exception {
        if (amt <= 0)
            throw new Exception("La cantidad a depositar debe ser superior a 0.");

        this.balance += amt;

        return true;
    }

    public boolean withdraw(double amt) throws Exception {
        if (amt <= 0)
            throw new Exception("La cantidad a retirar debe ser superior a 0.");

        boolean isOK = false;

        if (this.balance >= amt) {
            isOK = true;
            this.balance -= amt;
        }

        return isOK;
    }
}
