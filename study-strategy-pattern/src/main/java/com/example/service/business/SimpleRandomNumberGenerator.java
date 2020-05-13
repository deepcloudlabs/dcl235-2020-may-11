package com.example.service.business;

import com.example.service.RandomNumberGenerator;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@ServiceQuality(ServiceQualityLevel.SIMPLE)
public class SimpleRandomNumberGenerator implements RandomNumberGenerator {
    private Random random = new Random();

    @Override
    public int generate(int min, int max) {
        System.err.println("SimpleRandomNumberGenerator::generate");
        return random.nextInt(max - min + 1) + min;
    }
}
