package com.example;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

public class StudyJol {
    // Distributed Cache: Hazelcast, Coherence, ...
    // Customer: 32M x 1/2k = 16 G => 32 G
    // 8G Heap JVM Machines -> Eden, S0,s1 , Tenure (6G) (Cache)
    // 6 Machines
    public static void main(String[] args) {
        System.out.println(VM.current().details());
        System.out.println(ClassLayout.parseClass(A.class).toPrintable());
    }
}

class A {
    long l;
    byte b;

    long r;
    short s2;
}