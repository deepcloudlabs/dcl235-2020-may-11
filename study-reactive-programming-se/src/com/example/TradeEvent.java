package com.example;

// Java 14 - record is a Preview feature
// record is a immutable class -> final class
// DDD -> Value Object
public final record TradeEvent(String symbol, double price, double quantity) { }