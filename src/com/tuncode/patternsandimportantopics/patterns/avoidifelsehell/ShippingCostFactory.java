package com.tuncode.patternsandimportantopics.patterns.avoidifelsehell;

import java.util.HashMap;
import java.util.Map;

public class ShippingCostFactory {
    private static final Map<String, ShippingCostStrategy> strategies = new HashMap<>();

    static {
        strategies.put("STANDART", new StandartShippingCostStrategy());
        strategies.put("EXPRESS", new ExpressShippingCostStrategy());
        strategies.put("SAME_DAY", new SameDayShippingCostStrategy());
    }

    public static ShippingCostStrategy getStrategy(String shippingType) {
        ShippingCostStrategy strategy = strategies.get(shippingType);
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid Shipping Type: " + shippingType);
        }
        return strategy;
    }
}
