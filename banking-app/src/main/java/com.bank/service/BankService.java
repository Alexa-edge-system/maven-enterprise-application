package com.bank.service;

public class BankService {
    public double deposit(double balance, double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit amount");
        return balance + amount;
    }

    public double withdraw(double balance, double amount) {
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        return balance - amount;
    }
}
