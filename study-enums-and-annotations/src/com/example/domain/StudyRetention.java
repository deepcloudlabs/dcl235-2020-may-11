package com.example.domain;

public class StudyRetention {
    public static void main(String[] args) {
        A a = new A(42);
        var clazz = a.getClass();
        System.out.println(clazz.isAnnotationPresent(Serializable.class));

    }
}
