package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account(int firstDeposit) {
        balance = firstDeposit;
    }

    public void deposit(int deposit) {
        balance += deposit;
    }

    public int checkBalance() {
        return balance;
    }

    public void withdraw(int withdrawal) {
        if (withdrawal > balance){
            return;
        }
        balance -= withdrawal;
    }
}
