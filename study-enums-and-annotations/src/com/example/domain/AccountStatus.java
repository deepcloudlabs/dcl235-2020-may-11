package com.example.domain;

// Error: enum EnumA extends EnumB
// Error: enum EnumA extends ClassC
// Correct: enum EnumA implements X, Y, Z {}
public enum AccountStatus implements Status {
    ACTIVE(1) {
        @Override
        public int getStatus() {
            return this.code;
        }
    }, PASSIVE(549) {
        @Override
        public int getStatus() {
            return this.code;
        }
    }, CLOSED(42) {
        @Override
        public int getStatus() {
            return this.code;
        }
    }, BLOCKED(108) {
        @Override
        public int getStatus() {
            return this.code;
        }
    }; // Object -> Class Loader -> Type -> Constant
    protected int code;

    AccountStatus(int code) {
        this.code = code;
    }

}

interface Status {
    int getStatus();
}