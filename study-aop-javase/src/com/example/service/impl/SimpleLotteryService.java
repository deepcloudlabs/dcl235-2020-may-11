package com.example.service.impl;

import com.example.service.LotteryService;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class SimpleLotteryService implements LotteryService {
    @Override
    public List<Integer> draw(int max, int size) {
        return ThreadLocalRandom.current().ints(1, max)
                .distinct()
                .limit(size)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }
}
