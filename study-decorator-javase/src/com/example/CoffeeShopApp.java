package com.example;

import java.util.List;

public class CoffeeShopApp {

    public static void main(String[] args) {
	     var coffees = List.of(
	         new Sugar(new Sugar(new TurkishCoffee())),
             new Cream(new Espresso()),
             new LongDecorator(new FilterCoffee())
         );
        var totalCost = coffees.stream().mapToDouble(Coffee::cost).sum();
        System.out.println(totalCost);
    }
}
