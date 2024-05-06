package com.tuncode.patternsandimportantopics.patterns.strategypattern;

import java.math.BigDecimal;

/**
 * This is the main class that enables switching between strategies and interacting with the application's client.
 *
 * @author caksuna on 6.05.2024 15:40
 */
public class PaymentStrategyContex {

    private final PaymentStrategy strategy;

    public PaymentStrategyContex(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean pay(BigDecimal amount) {
        strategy.pay(amount);
        return true;
    }
}
