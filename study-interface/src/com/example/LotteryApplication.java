package com.example;

// loosely coupled

import com.example.service.LotteryService;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class LotteryApplication {
    // composition -> interface -> dependency
    // lotteryService ? dependency injection
    private LotteryService lotteryService;

    // dependency injection by constructor by hand
    public LotteryApplication(LotteryService lotteryService) {
        this.lotteryService = lotteryService;
    }

    // default constructor
    public LotteryApplication() {
    }

    //setter injection by hand
    public void setLotteryService(LotteryService lotteryService) {
        this.lotteryService = lotteryService;
    }

    // dependency injection framework --> Spring, CDI (Java EE), Guice (Google)
    // automatic
}
