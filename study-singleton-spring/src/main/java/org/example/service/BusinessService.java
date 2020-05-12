package org.example.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import javax.inject.Singleton;

//@Component // @Service @Repository
// @Scope("singleton") // Default Scope
//@Lazy
//@Named
//@Singleton
public class BusinessService {
    public BusinessService() {
        System.err.println("BusinessService()");
    }

    public void fun() {
        System.err.println("Have fun...");
    }
}
