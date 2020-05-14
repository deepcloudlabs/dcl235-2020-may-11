package com.example;

import java.io.Serializable;
import java.math.BigInteger;

public class StudyFunctionalProgramming {
    public static void main(String[] args) {
        int x = 42; // primitive -> value
        // Class (BigInteger) -> reference -> Heap Object
        BigInteger y = BigInteger.valueOf(42);
        // Function -> Interface -> Type
        /* 1) Marker Interface : 0 -> Serializable
           2) Functional Interface : 1 SAM (Single Abstract Method)
              @FunctionalInterface (Best Practice) -> @Override
         */
        // (1) Function Object
        Fun z1 = new Fun() {
            @Override
            public int fun(int y) {
                return 42;
            }
        } ;
        // (2.1) Lambda Expression
        // Pure Function
        final int q[] = {100}; // effectively final
        //q++;
        Fun z21 = (z) -> { // side-effect free, pure function
            z++;
            q[0]++; // dangerous!!!
            return 42  ;
        } ;
        // (2.2) Lambda Expression
        Fun z22 = (w) -> 42 ;
        // (3) Method Reference
        Fun z3 = Fun::gun;
        A a = new A();
        Fun z4 = a::elma;
        Fun z5 = A::armut;
        Fun z6 = B::erik;
    }
}
class A {
    public int elma(int z){ return 42; }
    public static int armut(int o) { return 42; }
}

abstract class B {
    public static int erik(int z){ return 42; }
}

@FunctionalInterface
interface Fun { // SAM
    int fun(int s);
    static int gun(int u) { return 42; } // Java SE 8
    default void sun() {} // Java SE 8
    private static void run() { } // Java SE 9
    private void tun() {} // Java SE 9
}