package com.example.domain;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class Discount implements Product {
    @Any
    @Inject
    @Delegate
    private Product product;
    private final double DISCOUNT_RATE = 0.7;

    @Override
    public double price() {
        return product.price() * DISCOUNT_RATE;
    }
}
