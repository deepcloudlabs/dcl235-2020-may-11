package com.example;

import java.util.List;

public class StudyFlyweightWrapperClasses {

    public static void main(String[] args) {
        // List<int> -> sequential -> L1 & L2
        // List<Integer> -> not sequential
        List<Integer> numbers;
        int x = 42; // 4 byte
        Integer j = new Integer(42); // 12-byte Object Header + 4-byte = 16 Byte
        long l = 42L; // 8-byte
        Long s = new Long(42); // 12-byte + 4-byte (alignment) + 8 Byte = 24 Byte
        // java 14 : record -> immutable class
        // Flyweight Pattern -> Object Pooling
        Integer x1 = Integer.valueOf(108) ; // Java SE 5 : Autoboxing
        Integer x2 = 108 ; // -128 <= integer <= 127
        Integer x3 = 549 ; // elementary school number
        Integer x4 = 549 ;
        Boolean b = Boolean.valueOf(true);
        // -XX:AutoBoxCacheMax=2048
        // Byte, Short, Integer, Long, Boolean, Character -> Flyweight -> Object Pool Size
        System.out.println("x1==x2: "+(x1==x2));
        System.out.println("x3==x4: "+(x3==x4));

    }
}
