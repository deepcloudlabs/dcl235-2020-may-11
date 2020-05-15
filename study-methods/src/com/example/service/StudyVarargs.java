package com.example.service;

public class StudyVarargs {
    public static void printArray(int[] values) {
        for (var val : values)
            System.out.println(val);
    }

    public static void printVarArray(int... values) {
        for (var val : values)
            System.out.println(val);
    }
    // Do not do it!
    public static int searchArray(int... values) {
        if (values.length<2) return -1;
        var searchValue = values[0];
        for (var i = 1; i < values.length; ++i)
            if (values[i] == searchValue) return i;
        return -1;
    }
    // varargs : 1 , last parameter
    public static int searchArray2(int searchValue, int... values) {
        if (values.length==0) return -1;
        for (var i = 1; i < values.length; ++i)
            if (values[i] == searchValue) return i;
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(nums);
        printArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        //                      /\
        //                      |
        printVarArray(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
