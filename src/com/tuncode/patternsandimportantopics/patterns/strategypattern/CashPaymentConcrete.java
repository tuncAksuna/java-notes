package com.tuncode.patternsandimportantopics.patterns.strategypattern;

import java.math.BigDecimal;

/**
 * @author caksuna on 6.05.2024 15:22
 */
public class CashPaymentConcrete implements PaymentStrategy {

    @Override
    public boolean pay(BigDecimal amount) {
        if (amount != null && amount.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("'CASH' payment process completed");
            return true;
        }
        return false;
    }
}
