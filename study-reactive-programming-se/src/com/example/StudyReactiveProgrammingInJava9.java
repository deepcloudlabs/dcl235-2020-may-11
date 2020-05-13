package com.example;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import static java.util.concurrent.TimeUnit.SECONDS;

// Flow API -> Concurrent API
// Reactive Stream Processing -> Event (immutable -> record)
// Observer + Iterator
// Async. Method -> Flow.Subscriber<TradeEvent> onXYZ -> callback
public class StudyReactiveProgrammingInJava9 {
    public static void main(String[] args) throws InterruptedException {
        // Publish/Subscribe
        SubmissionPublisher<TradeEvent> publisher =
                              new SubmissionPublisher<>();
        Flow.Subscriber<TradeEvent> slowSubscriber = new AlgoTrader();
        Flow.Subscriber<TradeEvent> fastSubscriber = new SignalProcessor();
        publisher.subscribe(slowSubscriber);
        publisher.subscribe(fastSubscriber);
        var tradeEvents = List.of(
                new TradeEvent("GARAN",1000,10),
                new TradeEvent("GARAN",2000,20),
                new TradeEvent("GARAN",3000,30),
                new TradeEvent("GARAN",4000,40),
                new TradeEvent("GARAN",5000,50)
        );
        Consumer<TradeEvent> submit = publisher::submit;
        Consumer<TradeEvent> sleep1sec = tradeEvent -> {
            try { SECONDS.sleep(1); } catch (InterruptedException e) { }
        };
        tradeEvents.forEach(submit.andThen(sleep1sec));
        SECONDS.sleep(60);
        publisher.close();
        System.err.println("App is done!");
    }
}

// Slow
class AlgoTrader implements Flow.Subscriber<TradeEvent> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(TradeEvent item) {
        try {
            SECONDS.sleep(3);
        } catch (InterruptedException e) { }
        System.err.println("AlgoTrader: "+item);
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.err.println(throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.err.println("AlgoTrader is completed!");
    }
}

// Fast
class SignalProcessor implements Flow.Subscriber<TradeEvent> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(TradeEvent item) {
        System.err.println("SignalProcessor: "+item);
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.err.println(throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.err.println("SignalProcessor is completed!");
    }
}