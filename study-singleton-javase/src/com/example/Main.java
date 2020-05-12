package com.example;

import com.example.service.BusinessServiceEnum;
import com.example.service.EagerBusinessService;
import com.example.service.LazyBusinessService;

import static com.example.service.BusinessServiceEnum.Instance;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        // triggers class loader -> static
        Class.forName("com.example.service.LazyBusinessService");
        // since java SE 7, ClassLoader is Multi-Threaded and Thread-safe
        System.err.println("Started...");
        Instance.fun(); // created
        Instance.fun();
        Instance.fun();
        Instance.fun();


    }
}
