package com.example;

public class StudyWrapperClasses {
    public static void main(String[] args) {
        // int -> Integer
        // 1) error: List<int>
        // correct: List<Integer>
        // 2) OOP: Encapsulation, Information Hiding, Inheritance, Polymorphism
        int x = 42;
        Integer y = Integer.valueOf(42); // Auto-boxing (primitive -> wrapper) (java se 5)
        x = y.intValue(); // Auto-unboxing (wrapper -> primitive)
        Integer z , u=3,v=5;
        int a,b=3,c=5;
        z = u + v; // do not use wrapper classes for arithmetic operations
        z = Integer.valueOf(u.intValue()+v.intValue());
        a = b + c; // primitive : Ultra Fast
        // wrapper -> memory foot-print
        // int[1_000_000] -> 4 MB -> Utilizes L1 Cache
        // Integer[1_000_000] -> 12B (Header) + 4B = ( 16B + 4B ) => 20 MB
        //                       16B (Header) + 4B + 4B (alignment) = 24B + 8B => 32 MB
        //                       Does not utilize L1 Cache
        // JVM optimization -> Compressed Oops
        // Collection<int> will be possible in the near future :-)
        // Two important projects in OpenJDK
        // 1) Valhalla
        // 2) Sumatra (https://openjdk.java.net/projects/sumatra/)
        // 3) JNI 2.0
    }
}
