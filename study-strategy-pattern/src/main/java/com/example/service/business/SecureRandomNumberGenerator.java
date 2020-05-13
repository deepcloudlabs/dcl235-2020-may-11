package com.example.service.business;

import com.example.service.RandomNumberGenerator;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
@ServiceQuality(ServiceQualityLevel.SECURE)
public class SecureRandomNumberGenerator implements RandomNumberGenerator {
    private SecureRandom random = new SecureRandom();

    @Override
    public int generate(int min, int max) {
        System.err.println("SecureRandomNumberGenerator::generate");
        return random.nextInt(max - min + 1) + min;
    }
}
