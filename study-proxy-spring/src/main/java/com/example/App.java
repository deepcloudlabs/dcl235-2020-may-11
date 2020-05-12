package com.example;


import com.example.config.AppConfig;
import com.example.service.LotteryService;
import com.example.service.impl.NoInterfaceLotteryService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);
        LotteryService lotteryService = ctx.getBean(LotteryService.class);
        // class com.sun.proxy.$Proxy19: Java SE 6
        System.err.println(lotteryService.getClass());
        System.err.println(lotteryService.draw(50,6));
        NoInterfaceLotteryService nils =
                ctx.getBean(NoInterfaceLotteryService.class);
        // Instrumentation API : CG Library
        // com.example.service.impl.NoInterfaceLotteryService$$EnhancerBySpringCGLIB$$190a2cc5
        System.err.println(nils.getClass());
        System.err.println(nils.draw(50,6));

    }
}
