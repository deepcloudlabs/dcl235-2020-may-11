package com.example;

import java.math.BigDecimal;

public class StudyDoubleAndFloat {
    public static void main(String[] args) {
        double x = 123.45; // 8-byte
        float y = 23.456f; // 4-byte
        double money = 2.0 ;
        money = money - 1.10 ; // 0.9?
        System.out.println(money==0.9);
        System.out.println(String.format("%8.16f",money));
        float anotherMoney = 1_000_000_000;
        anotherMoney = anotherMoney + 50 ;
        System.out.println(String.format("%16.3f",anotherMoney));
        // IEEE-754 v5 (2008) -> CPU, GPU
        BigDecimal bd;
    }
}
