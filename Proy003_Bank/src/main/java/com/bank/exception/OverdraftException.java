package com.bank.exception;

public class OverdraftException extends Exception {
    private final double deficit;

    public OverdraftException(String msg, double deficit) {
        super(msg + " Deficit: " + deficit + ".");
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }

}
