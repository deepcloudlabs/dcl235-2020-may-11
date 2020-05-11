package com.example.service.business;

import com.example.service.LotteryService;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

// solution class -> Component
// @Service, @Component, @Repository : Responsibility
// SRP

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class SimpleLotteryService implements LotteryService {
    // overloading -> high cohesion
    @Override
    public List<Integer> draw() {
        System.err.println("SimpleLotteryService::draw()");
        return ThreadLocalRandom.current()
                .ints(1, 50)
                .distinct()
                .limit(6)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }

}
