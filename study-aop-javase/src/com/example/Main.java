package com.example;

import com.example.handler.ProfilingHandler;
import com.example.service.LotteryService;
import com.example.service.impl.SimpleLotteryService;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        LotteryService lotteryService = new SimpleLotteryService();
        Class<?> clazz = lotteryService.getClass();
        lotteryService = (LotteryService) Proxy.newProxyInstance(clazz.getClassLoader(),
                clazz.getInterfaces(),
                    // Responsibility: Caching, Authentication, Authorization, Validation, Logging, Auditing
                new ProfilingHandler(lotteryService));
        // com.sun.proxy.$Proxy0
        System.err.println(lotteryService.getClass());
        System.err.println(lotteryService.draw(50,6));
        System.err.println(lotteryService.draw(50,6));
        System.err.println(lotteryService.draw(50,6));
        System.err.println(lotteryService.draw(50,6));
        System.err.println(lotteryService.draw(50,6));
        System.err.println(lotteryService.draw(50,6));
        System.err.println(lotteryService.draw(50,6));
    }
}
