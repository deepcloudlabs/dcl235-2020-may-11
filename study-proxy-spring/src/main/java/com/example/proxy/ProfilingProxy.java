package com.example.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProfilingProxy {

    @Around("execution(* *.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.nanoTime();
        Object result = pjp.proceed();
        long stop = System.nanoTime();
        System.err.println(String.format("%s runs %d ns.",pjp.getSignature().getName(),(stop-start)));
        return result;
    }
}
