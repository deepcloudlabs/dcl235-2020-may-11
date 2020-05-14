package com.example;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudyStreamApi {
    public static void main(String[] args) {
        var numbers = List.of(4, 8, 15, 16, 23, 42);
        Predicate<Integer> isOdd = i -> i%2 == 1;
        Function<Integer,Integer> squared = x -> x * x;
        BinaryOperator<Integer> multiply = (s,x) -> s*x;
        var product = numbers.stream() // 4 8 15 16 23 42
                        .filter(isOdd) //     15    23
                        .map(squared)  //     225   529
                        .reduce(1,multiply);
                             // 1    (1,225) -> 225
                             // 225  (225,529) -> 119025 -> result
        System.out.println(product);
        // Stream -> Collection
        // Stream -> FilterMapReduce -> Hadoop (1. HDFS 2. MapReduce)
        // filter, map, flatMap, reduce, sum, max, min, collect
        // distinct , limit, sorted, boxed, parallel, sequential, ...
        // Stream -> fluent api, method chain, ordered!
        // intermediary methods: filter, map, reduce, parallel, distinct,...
        // terminal methods: collect, findFirst, min, max, sum, count, ...
        // Stream -> Lazy Evaluation
        // processing is started with terminal method
        numbers.stream().map(x -> x * x * x); // No operation
        numbers.stream().filter(x -> x % 2 == 0)
                        .max(Integer::compareTo) // terminal
                        .ifPresent(System.out::println);
    }
}
