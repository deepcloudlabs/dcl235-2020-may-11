package com.example.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProfilingHandler implements InvocationHandler {
    private Object realObject;

    public ProfilingHandler(Object realObject) {
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.nanoTime();
        Object result = method.invoke(realObject,args);
        long stop = System.nanoTime();
        System.err.println(String.format("%s runs %d ns.",method.getName(),(stop-start)));
        return result;
    }
}
