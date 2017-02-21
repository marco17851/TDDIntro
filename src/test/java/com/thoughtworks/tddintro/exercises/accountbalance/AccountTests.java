package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AccountTests {

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account(100);
        account.deposit(50);

        assertEquals(150, account.checkBalance());
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account(100);
        account.withdraw(50);

        assertEquals(50, account.checkBalance());
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account(50);
        account.withdraw(100);

        assertEquals(50, account.checkBalance());
    }
}
