package com.example.domain;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SsdDisk implements Product{
    @Override
    public double price() {
        return 250;
    }

    @Override
    public String name() {
        return "SSD Disk";
    }
}
