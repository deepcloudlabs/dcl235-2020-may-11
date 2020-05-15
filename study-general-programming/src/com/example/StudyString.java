package com.example;

public class StudyString {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder(12888890);
        for (int i=0;i<2_000_000;++i)
            s.append(i);
        long stop = System.currentTimeMillis();
        System.out.println(s.length()+", "+(stop-start)+" ms.");
    }
}
