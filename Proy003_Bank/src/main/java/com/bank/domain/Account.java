package com.bank.domain;

public class Account {
	private double balance;

	public Account(double initBalance) {
		this.balance = initBalance;
	}

	public double getBalance() {
		return balance;
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
