package com.example;

import com.example.service.business.LotteryService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("com.example.service.business");
        LotteryService lotteryService = ctx.getBean(LotteryService.class);
        System.out.println(lotteryService.draw(50,6));
        System.out.println(lotteryService.draw(50,6));
        System.out.println(lotteryService.draw(50,6));
        ctx.close();
    }
}
