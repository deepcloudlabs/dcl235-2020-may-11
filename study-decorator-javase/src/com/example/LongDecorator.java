package com.example;

public class LongDecorator extends CoffeeDecorator {
    public LongDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return 1.5 * coffee.cost();
    }
}
