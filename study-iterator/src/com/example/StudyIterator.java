package com.example;

import java.util.List;

public class StudyIterator {

    public static void main(String[] args) {
        // Iterator -> Collection -> Language
        var numbers = List.of(4, 8, 15, 16, 23, 42);

        // outer loop #1
        for (var iter = numbers.iterator() ; iter.hasNext() ;){
            var num = iter.next();
            System.out.println("num: "+num);
        }
        System.out.println("================");
        // outer loop #2
        var iter = numbers.iterator();
        while (iter.hasNext()){
            var num = iter.next();
            System.out.println("num: "+num);
        }
        System.out.println("================");
        // outer loop #3 -- since java se 5
        // read-only, sequential, multiple collection
        for (var num : numbers){ // for-each
            System.out.println("num: "+num);
        }
        System.out.println("================");
        // inner loop #4 -- since java se 8
        numbers.forEach( System.out::println );
        // inner loop #5 -- since java se 8 --> Stream API -> FilterMapReduce
        numbers.stream().forEach( System.out::println );
        var sum = numbers.stream().mapToInt(Integer::valueOf).sum();
        // inner loop #6 -- since java se 8 --> Stream API -> FilterMapReduce
        sum = numbers.stream()
                     .parallel()
                      // spliterator
                     .mapToInt(Integer::valueOf)
                     .sum();
        // Data Parallelism
        // stream() -> Iterator
        // parallelStream() -> Spliterator ( Java SE 8 )
    }
}
