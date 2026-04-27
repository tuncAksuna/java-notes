package com.tuncode.javanotes.patternsandimportantopics.patterns.avoidifelsehell;

public class SameDayShippingCostStrategy implements ShippingCostStrategy {

    @Override
    public double getCost(double weight) {
        return weight * 20.0;
    }
}
