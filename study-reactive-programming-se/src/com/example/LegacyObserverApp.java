package com.example;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("deprecate")
public class LegacyObserverApp {
    public static void main(String[] args) {
        Observable observable = new TradeEventObservable();
        Observer slowObserver = (o,tradeEvent) -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) { }
            System.err.println("Slow Observer: "+tradeEvent);
        };
        Observer fastObserver = (o,tradeEvent) -> {
            System.err.println("Fast Observer: "+tradeEvent);
        };
        observable.addObserver(slowObserver);
        observable.addObserver(fastObserver);
        var tradeEvents = List.of(
                new TradeEvent("GARAN",1000,10),
                new TradeEvent("GARAN",2000,20),
                new TradeEvent("GARAN",3000,30),
                new TradeEvent("GARAN",4000,40),
                new TradeEvent("GARAN",5000,50)
        );
        tradeEvents.forEach(observable::notifyObservers);
    }
}

class TradeEventObservable extends Observable {
    @Override
    public void notifyObservers(Object event) {
        setChanged();
        super.notifyObservers(event);
    }
}