package com.example;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        System.out.println(threadPool.getClass());
        threadPool = Executors.newScheduledThreadPool(5);
        System.out.println(threadPool.getClass());
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
                                           // factory method
        var immutableNumbers = Collections.unmodifiableList(numbers);
                           // $UnmodifiableRandomAccessList --> private static class
        System.out.println(immutableNumbers.getClass());
        EnumSet<Digit> digits = EnumSet.of(Digit.ONE, Digit.THREE);
        var x  = Integer.valueOf(42);
        var y = new Integer(42);
    }
}

enum Digit {
    ONE, TWO, THREE
}