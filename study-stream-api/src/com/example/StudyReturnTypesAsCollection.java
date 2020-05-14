package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StudyReturnTypesAsCollection {
    public static void main(String[] args) {
        var allProcesses = ProcessHandle.allProcesses();
        for (ProcessHandle ph :
                (Iterable<ProcessHandle>) allProcesses::iterator){
            System.out.println(ph.info());
        }
        // Lazy initialization: no session/session is closed!
    }
}

class A {
    // Collection API -> Store, Access
    // Before Java 8
    Iterable<Integer> fun(){ return null;}
    Iterator<Integer> sun(){ return null;}
    Collection<Integer> run(){ return null;}
    List<Integer> gun(){ return null;}
    // Do not do this
    ArrayList<Integer> pun(){ return null;}

    // Since Java 8
    // Lazy evaluation, Processing API
    Stream<Integer> hun(){ return null;}

}