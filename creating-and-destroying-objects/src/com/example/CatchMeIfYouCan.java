package com.example;

public class CatchMeIfYouCan {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static int fun(){
        try{
            return 42;
        } finally {
            return 108; // releasing resource -> finalizer
        }
    }
    public static void main(String[] args) {
        //   a) 42
        // + b) 108
        //   c) 75
        // x d) Does not compile!
        System.out.println(fun());
    }
}
