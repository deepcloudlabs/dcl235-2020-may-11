package com.example;

import java.util.ArrayList;
import java.util.List;

public class StudyCovarianceAndInvariance {
    public static void main(String[] args) {
        Object [] arr = new Integer[10];
        // Covariance
        arr[0] = "zero"; // ArrayStoreException
        // Object Header (12Byte) -> getClass() -> Class Object

        // Invariance
        //  Compiler
        //     |
        //     v
        List<Integer> nums = new ArrayList<>();
        nums.add(0); // compile-time
        // nums.getClass() -> ArrayList

        // Static          Dynamic <-- Winner
        // Array      vs   Collection <-- Winner
        // Covariant       Invariant
    }
}
