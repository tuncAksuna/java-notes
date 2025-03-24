package com.tuncode.patternsandimportantopics.patterns.avoidifelsehell;

public class ExpressShippingCostStrategy implements ShippingCostStrategy {

    @Override
    public double getCost(double weight) {
        return weight * 10.0;
    }
}
