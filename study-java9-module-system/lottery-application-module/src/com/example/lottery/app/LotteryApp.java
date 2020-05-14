package com.example.lottery.app;

import com.example.lottery.service.LotteryService;

import java.util.ServiceLoader;

public class LotteryApp {
    public static void main(String[] args) {
        ServiceLoader<LotteryService> services = ServiceLoader.load(LotteryService.class);
        LotteryService lotteryService = services.findFirst().get();
        System.err.println(lotteryService.getClass());
        lotteryService.draw(5)
                      .forEach(System.out::println);
    }
}
