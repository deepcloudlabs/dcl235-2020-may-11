package com.example.service.business;

import com.example.service.LotteryService;

import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;

// OCP

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class SecureLotteryService implements LotteryService {

    @Override
    public List<Integer> draw() {
        System.err.println("SecureLotteryService::draw()");
        return new SecureRandom()
                .ints(1, 50)
                .distinct()
                .limit(6)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }

}
