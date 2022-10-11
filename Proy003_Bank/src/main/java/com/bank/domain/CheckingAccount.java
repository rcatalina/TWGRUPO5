package com.bank.domain;

import com.bank.exception.OverdraftException;

public class CheckingAccount extends Account {

    private double overdraftAmount;

    public CheckingAccount(double initBalance) {
        super(initBalance);
    }

    public CheckingAccount(double initBalance, double overdraftAmount) {
        super(initBalance);
        this.overdraftAmount = overdraftAmount;
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    @Override
    public void withdraw(double amt) throws OverdraftException {

        if (amt <= 0)
            throw new OverdraftException("La cantidad a retirar debe ser superior a 0.", 0);

        double currentBalance = this.getBalance();
        double newBalance = currentBalance - amt;

        if (newBalance < this.overdraftAmount)
            throw new OverdraftException("La cantidad a retirar supera el límite de esta cuenta.",
                    newBalance + this.overdraftAmount);

        this.setBalance(newBalance);

    }

}
