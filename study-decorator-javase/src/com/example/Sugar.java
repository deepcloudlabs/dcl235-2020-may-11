package com.example;

// Decorator
public class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee) {
        super(coffee);
    }


    @Override
    public double cost() {
        return 1. + coffee.cost();
    }
}
