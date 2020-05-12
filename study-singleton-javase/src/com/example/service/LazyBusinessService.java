package com.example.service;

import java.util.Objects;

import static java.util.Objects.isNull;

public class LazyBusinessService {
    private static LazyBusinessService instance ;

    private LazyBusinessService() {
        System.err.println("LazyBusinessService()");
    }
    public void fun(){
        System.err.println("Have fun...");
    }

    public static LazyBusinessService getInstance() {
        if (isNull(instance))
            instance = new LazyBusinessService(); // Once
        return instance;
    }
}
