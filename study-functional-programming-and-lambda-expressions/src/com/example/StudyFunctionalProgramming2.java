package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Comparator.comparingInt;

public class StudyFunctionalProgramming2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
                List.of("jack","kate","james","ben","sun","jin","hugo")
        );
        // names.sort((o1, o2) -> Integer.compare(o1.length(),o2.length()));
        names.sort(comparingInt(String::length));
        names.forEach(System.out::println);
    }
}
