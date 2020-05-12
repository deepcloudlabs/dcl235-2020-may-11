package com.example;

// Decorator : Business Aware
public class Cream extends CoffeeDecorator {

    public Cream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return 2.5 +
                // delegate
                coffee.cost();
    }
}
