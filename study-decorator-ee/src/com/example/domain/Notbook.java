package com.example.domain;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Notbook implements Product {
    @Override
    public double price() {
        return 5_000;
    }
}
