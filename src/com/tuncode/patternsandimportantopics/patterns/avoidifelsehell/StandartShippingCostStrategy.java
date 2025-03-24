package com.tuncode.patternsandimportantopics.patterns.avoidifelsehell;

public class StandartShippingCostStrategy implements ShippingCostStrategy {

    @Override
    public double getCost(double weight) {
        return weight * 5.0;
    }
}
