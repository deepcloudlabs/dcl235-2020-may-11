package com.example.domain;

public enum CustomerStatus implements Status{
    STANDARD(){
        @Override
        public int getStatus() {
            return 100;
        }
    }, GOLD(){
        @Override
        public int getStatus() {
            return 200;
        }
    };

}
