package com.bank.domain;

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
    public boolean withdraw(double amt) throws Exception {

        if (amt <= 0)
            throw new Exception("La cantidad a retirar debe ser superior a 0.");

        double currentBalance = this.getBalance();
        double newBalance = currentBalance - amt;

        if (newBalance < this.overdraftAmount)
            return false;

        this.setBalance(newBalance);
        return true;

    }

}
