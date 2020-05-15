package com.example.domain;

@Serializable(100) // SOURCE CODE
public class A { // Compiler: A.java -> A.class (CLASS)
                 // JVM (Class Loader): A.class -> Meta-space
    private int value;

    public A(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int fun() {

        int i = 42;

        return i;
    }
}

class B extends A {

    public B(int value) {
        super(value);
    }
}