package com.example.banking.domain;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
// Value Object : Immutable Class
public final class Money {
    private final double value;
    private final MoneyCurrency currency;

    private Money(double value, MoneyCurrency currency) {
        this.value = value;
        this.currency = currency;
    }

    public static Money valueOf(double value, MoneyCurrency currency) {
        if (value <= 0.) throw new IllegalArgumentException("Money cannot be negative or zero!");
        return new Money(value, currency);
    }

    public static Money plus(Money left, Money right) {
        if (left.getCurrency() != right.getCurrency())
            throw new IllegalArgumentException("Cannot deposit with different currency");

        return Money.valueOf(left.getValue() + right.getValue(), left.getCurrency());
    }

    public static Money minus(Money left, Money right) {
        if (left.getCurrency() != right.getCurrency())
            throw new IllegalArgumentException("Cannot deposit with different currency");

        return Money.valueOf(left.getValue() - right.getValue(), left.getCurrency());
    }

    public double getValue() {
        return value;
    }

    public MoneyCurrency getCurrency() {
        return currency;
    }

    public boolean lessThan(Money right) {
        if (this.getCurrency() != right.getCurrency())
            throw new IllegalArgumentException("Cannot process with different currency");
        return this.value < right.value;
    }
}
