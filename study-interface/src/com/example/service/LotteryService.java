package com.example.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Interface Segregation Principle
// SRP --> Interface
/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public interface LotteryService {
    List<Integer> draw();

    // utility method
    default List<List<Integer>> draw(int column){
        return IntStream.range(0,column)
                .mapToObj( i -> this.draw()) // polymorphic call -> runtime
                .collect(Collectors.toList());
    }
}
