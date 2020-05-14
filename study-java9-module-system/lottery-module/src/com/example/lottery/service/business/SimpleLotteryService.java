package com.example.lottery.service.business;

import com.example.lottery.service.LotteryService;
import com.example.random.service.RandomService;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleLotteryService implements LotteryService {
    private RandomService randomService;

    public SimpleLotteryService() {
        randomService = ServiceLoader.load(RandomService.class)
                                     .findFirst()
                                     .get();
    }

    @Override
    public List<Integer> draw(int max, int size) {
        return IntStream.generate(() -> randomService.generate(1, max))
                .distinct()
                .limit(size)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }

    @Override
    public List<List<Integer>> draw(int column) {
        return IntStream.range(0, column)
                .mapToObj(i -> this.draw(50, 6))
                .collect(Collectors.toList());
    }
}
