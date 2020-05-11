package com.example.banking.domain;

import static com.example.banking.domain.Money.minus;
import static com.example.banking.domain.Money.plus;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
// DDD: Domain Driven Design
// Entity: Identity, Persistence
// Ubiquitous Language: Account, Iban, Money, MoneyCurrency --> Bounded Context -> Sub-process
public class Account {
    // Information Hiding Principle --> 1) private 2) Iban, Money : Immutable
    private final Iban iban;
    private Money balance;

    public Account(Iban iban, Money balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public Iban getIban() {
        return iban;
    }

    public Money getBalance() {
        return balance;
    }

    public void deposit(Money amount) {
        balance = plus(balance, amount);
    }

    public void withdraw(Money amount) {
        if (balance.lessThan(amount))
            throw new IllegalArgumentException("Insufficient balance");
        balance = minus(balance, amount);
    }
}
