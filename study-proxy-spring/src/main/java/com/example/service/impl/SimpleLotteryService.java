package com.example.service.impl;

import com.example.service.LotteryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Service
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
