package com.tuncode.javanotes.patternsandimportantopics.patterns.avoidifelsehell;

public class ShippingCostCalculatorContext {

    public static double calculateShippingCost(String shippingType, double weight) {
        ShippingCostStrategy strategy = ShippingCostFactory.getStrategy(shippingType);
        return strategy.getCost(weight);
    }
}
