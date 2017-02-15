package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AccountTests {

    private PrintStream printStream;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account(printStream, 100);
        account.deposit(50);
        account.checkBalance();

        verify(printStream).println(150);

    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account(printStream, 100);
        account.withdraw(50);
        account.checkBalance();

        verify(printStream).println(50);
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account(printStream, 50);
        account.withdraw(100);
        account.checkBalance();

        verify(printStream).println(50);
    }
}
