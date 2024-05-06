package com.tuncode.patternsandimportantopics.patterns.strategypattern;

import java.math.BigDecimal;

/**
 * @author caksuna on 6.05.2024 15:22
 */
public interface PaymentStrategy {

    boolean pay(BigDecimal amount);
}
