package com.example.service;

// ThreadSafe
// Cache Coherent
// JLS, JVM Spec. -> Class Loader
public enum BusinessServiceEnum {
    Instance;

    private BusinessServiceEnum() {
    }

    public void fun(){
        System.err.println("Have fun...");
    }
}
