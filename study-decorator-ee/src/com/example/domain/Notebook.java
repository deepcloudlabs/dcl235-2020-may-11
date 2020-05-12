package com.example.domain;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Notebook implements Product {
    @Override
    public double price() {
        return 5_000;
    }

    @Override
    public String name() {
        return "Notebook";
    }
}
