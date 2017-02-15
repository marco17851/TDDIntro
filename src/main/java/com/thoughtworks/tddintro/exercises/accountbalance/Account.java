package com.thoughtworks.tddintro.exercises.accountbalance;

import java.io.PrintStream;

public class Account {
    private int balance;
    private PrintStream printStream;

    public Account(PrintStream stream, int firstDeposit) {
        printStream = stream;
        balance = firstDeposit;
    }

    public void deposit(int deposit) {
        balance += deposit;
    }

    public void checkBalance() {
        printStream.println(balance);
    }

    public void withdraw(int withdrawal) {
        if (withdrawal > balance){
            return;
        }
        balance -= withdrawal;
    }
}
