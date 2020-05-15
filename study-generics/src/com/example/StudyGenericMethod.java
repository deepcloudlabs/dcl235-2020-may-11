package com.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unchecked")
public class StudyGenericMethod {
    public static void main(String[] args) {
        ArrayList<String> names1 = new ArrayList<>();
        LinkedList<Integer> names2 = new LinkedList<>();
        // names1.add(BigInteger.ONE);
        printNames(names1);
        printNames(names2);
    }
    public static void printNames(List<?> names){ // Generic Method
        // Consumer
    }
}
