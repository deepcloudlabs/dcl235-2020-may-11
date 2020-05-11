package com.example;

import com.example.service.LotteryService;
import com.example.service.business.SecureLotteryService;
import com.example.service.business.SimpleLotteryService;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        LotteryService lotteryService = new SimpleLotteryService();
        lotteryService.draw(5).forEach(System.out::println);
        lotteryService = new SecureLotteryService();
        lotteryService.draw(5).forEach(System.out::println);
        // injection
        // constructor
        LotteryApplication app = // client
                // supplier ?
                new LotteryApplication(lotteryService);
        app = new LotteryApplication();
        // setter : supplier
        app.setLotteryService(lotteryService);
        // Spring, CDI (Java EE): Multiple Implementation?
    }
}
