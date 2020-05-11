package com.example.service;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
// Before Java SE 8
public interface MyInterface {
    public static final int data = 42;

    public abstract void fun();
}

// with Java SE 8
interface MyInterface8 {
    public static final int data = 42;

    public abstract void fun();

    // Java SE 8
    public static void gun() {
    } // public static

    public default void sun() {
    } // default method

}

// with Java SE 9
interface MyInterface9 {
    public static final int data = 42;

    public abstract void fun();

    // Java SE 8
    // utility method for FP
    public static void gun() {
    } // public static

    // Backward compatibility for API design
    // Utility method
    public default void sun() {
    } // default method

    // Java SE 9
    // to eliminate code duplication
    private static void run() {
    } // private static

    private void jun() {
    } // private method
}
