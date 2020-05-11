package com.example.banking.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class UseListOfMethods {
    public static void main(String[] args) {
        // Immutable List
        var numbers = List.of(4, 8, 15, 16, 23, 42);
        numbers.add(52);
        BigInteger bi = BigInteger.valueOf(1);
        BigDecimal bd = BigDecimal.valueOf(2);
        // Wrapper Classes: Byte,Short,Integer, Long, Float,Double,Character,Boolean
    }
}
