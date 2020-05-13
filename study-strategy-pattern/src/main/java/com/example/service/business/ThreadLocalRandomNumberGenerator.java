package com.example.service.business;

import com.example.service.RandomNumberGenerator;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@ServiceQuality(ServiceQualityLevel.THREADED)
public class ThreadLocalRandomNumberGenerator implements RandomNumberGenerator {
    @Override
    public int generate(int min, int max) {
        System.err.println("ThreadLocalRandomNumberGenerator::generate");
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
