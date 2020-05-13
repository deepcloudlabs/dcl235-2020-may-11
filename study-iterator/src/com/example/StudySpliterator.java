package com.example;

import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudySpliterator {
    public static void main(String[] args) {
        var numbers = IntStream.range(1,11)
                               .boxed()
                               .collect(Collectors.toList());
        var iter = numbers.iterator() ; // sequential
        var spliter1 = numbers.spliterator() ;
        // linear iteration
        while (spliter1.tryAdvance(System.out::println));
        spliter1 = numbers.spliterator();
        var spliter2 = spliter1.trySplit(); // first Half [1,2,3,4,5]
        var spliter3 = spliter2.trySplit(); // splitter3 [1,2]
                                            // splitter2 [3,4,5]
        System.out.println(spliter1.estimateSize()); // 5
        System.out.println(spliter2.estimateSize()); // 3
        System.out.println(spliter3.estimateSize()); // 2

        System.out.println(spliter3.characteristics());
        System.out.println("SIZED: "+spliter3.hasCharacteristics(Spliterator.SIZED));
        System.out.println("SORTED: "+spliter3.hasCharacteristics(Spliterator.SORTED));
        System.out.println("CONCURRENT: "+spliter3.hasCharacteristics(Spliterator.CONCURRENT));
        System.out.println("DISTINCT: "+spliter3.hasCharacteristics(Spliterator.DISTINCT));
        System.out.println("IMMUTABLE: "+spliter3.hasCharacteristics(Spliterator.IMMUTABLE));
        System.out.println("ORDERED: "+spliter3.hasCharacteristics(Spliterator.ORDERED));
        System.out.println("NONNULL: "+spliter3.hasCharacteristics(Spliterator.NONNULL));

        // Java SE 7 -> ForkJoin Framework
        System.out.println("=================");
        while (spliter2.tryAdvance(System.out::println));
        System.out.println("=================");
        while (spliter3.tryAdvance(System.out::println));
        // Collection API (1.2) -> Iterator
        // SE 5                    for-each
        // SE 8 -> Stream API  -> Spliterator (Parallel Programming)
    }
}
