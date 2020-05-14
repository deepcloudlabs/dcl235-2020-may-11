package com.example.hr.app;

public class StudyInstanceOfWithInterface {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        System.out.println(a instanceof I);
    }
}

class A {}
class B extends A {}
class C extends B {}
class D {}
interface I {}

