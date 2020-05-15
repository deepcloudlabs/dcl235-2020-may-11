package com.example;

import java.util.List;

public class StudyScope {
    public static void main(String[] args) {
        // prefer for-loop to while-loop
        for (var i=0;i<10;++i){

        }
        // can NOT access to i
        int j=0;
        while(j<10){

            ++j;
        }
        // prefer for-each (1) to for-loop (2)
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        // (1)
        for (var num : numbers){}

        // (2)
        for (var iter = numbers.iterator();iter.hasNext();){
            var num = iter.next();
        }

        // prefer forEach (inner loop) to for-each
        numbers.forEach( System.out::println );
    }

    public static void fun(int i){

        if (i<0)
            throw new IllegalArgumentException("i must be positive");

        A a = new A(); // high cost operation

        // use "a" object
    }
}

// Fat Object
class A{}
