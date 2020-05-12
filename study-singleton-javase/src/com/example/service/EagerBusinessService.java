package com.example.service;
// TS
public class EagerBusinessService {
    private static final EagerBusinessService instance ;
    static { // static block
       instance = new EagerBusinessService();
    }
    private EagerBusinessService() {
        System.err.println("EagerBusinessService()");
    }
    public void fun(){
        System.err.println("Have fun...");
    }

    public static EagerBusinessService getInstance() {
        return instance;
    }
}
