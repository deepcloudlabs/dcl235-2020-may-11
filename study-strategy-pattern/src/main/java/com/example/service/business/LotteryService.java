package com.example.service.business;

import com.example.service.RandomNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class LotteryService {
    @Autowired
    private List<RandomNumberGenerator> randomNumberGenerators;
    @Autowired
    private Map<String,RandomNumberGenerator> randomNumberGeneratorsMap;

    private AtomicInteger counter = new AtomicInteger(0);

    public List<Integer> draw(int max, int size) {
        RandomNumberGenerator randomNumberGenerator =
                randomNumberGenerators.get(counter.getAndIncrement() % randomNumberGenerators.size());
        return IntStream.generate(() -> randomNumberGenerator.generate(1, max))
                .distinct()
                .limit(size)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }
}
