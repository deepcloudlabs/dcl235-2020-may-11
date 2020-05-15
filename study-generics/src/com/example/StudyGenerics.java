package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGenerics {
    public static void main(String[] args) {
        // Java 7 : Diamond Operator
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(15);
        numbers.add(16);
        numbers.add(23); // bug
        numbers.add(42);
        for (Iterator<Integer> iter = numbers.iterator(); iter.hasNext(); ) {
            Integer num = iter.next(); // SAFE!!!
            System.out.println(num);
        }
        // Java SE 5 -> for-each
        for (Integer num : numbers)
            System.out.println(num);
        // Generics -> Collection API
        // Generic Programming
        Stack<Integer> intStack;
        Stack<Double> doubleStack;
        Stack<Employee> employeeStack;
    }
}
class Employee {}
class IntStack {
    int array[] ;
}
class DoubleStack {
    double array[] ;

}
class EmployeeStack {
    Employee array[];
}
// Generic Programming
class Stack<T> {
    T array[] ;

}
// Type Erasure
class GeneratedStack {
    Object array[];
}
