package com.example.random.service.business;

import com.example.random.service.RandomService;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleRandomService implements RandomService {
    @Override
    public int generate(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
