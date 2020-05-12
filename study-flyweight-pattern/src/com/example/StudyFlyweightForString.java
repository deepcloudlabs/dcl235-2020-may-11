package com.example;

public class StudyFlyweightForString {
    public static void main(String[] args) {
        // Object Caching -> Immutable
        String s1 = "Jack" ; // static String => Flyweight -> Object Caching -> Constant Pool
        String s2 = new String("Jack"); // Heap
        String s3 = "Jack";
        // internalize
        // java 8, G1GC (Garbage First) -> Automatic: String Deduplication
        // -XX:+UseG1GC -XX:+UseStringDeduplication
        // -XX:+PrintStringDeduplicationStatistics
        // > %10
        s2 = s2.intern();
        System.out.println("s1==s2: "+(s1==s2));
        System.out.println("s1==s3: "+(s1==s3));

    }
}
